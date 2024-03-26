package org.test;

import org.jetbrains.annotations.NotNull;

public class App
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( App.class );

	// _ENV_SENSE_UUID = bluetooth.UUID(0x181A)
	private static java.util.UUID ENV_SERVICE = java.util.UUID.fromString( "0000181a-0000-1000-8000-00805f9b34fb" );

	// _TEMP_CHAR = bluetooth.UUID(0x2A6E)
	private static java.util.UUID TEMP = java.util.UUID.fromString( "00002a6e-0000-1000-8000-00805f9b34fb" );

	private static java.util.UUID TIME_SERVICE = java.util.UUID.fromString("00001805-0000-1000-8000-00805f9b34fb" );
	private static java.util.UUID TIME = java.util.UUID.fromString( "00002a2b-0000-1000-8000-00805f9b34fb" );

	private final String[] args;
	private String lookingFor;

	private com.welie.blessed.BluetoothCentralManager central;
	private com.welie.blessed.BluetoothPeripheral connectedPeripheral;
	private static final java.util.Set<String> knownDevices = new java.util.HashSet<>();

	public static void main( String[] args )
        {
                new App( args ).run();
        }

        public App( String[] args )
        {
                this.args = args;
	
		if( args.length > 0 )
		{
			this.lookingFor = args[0];
		}

		Runtime.getRuntime().addShutdownHook(new Thread()
		{
			public void run()
			{
				try
				{
					System.out.println("Shutting down ...");
					central.cancelConnection( connectedPeripheral );
					Thread.sleep(200);
				}
				catch( InterruptedException e)
				{
					Thread.currentThread().interrupt();
					e.printStackTrace();
				}
			}
		});
        }

	public void run()
        {
		log.info( "run" );

		central = new com.welie.blessed.BluetoothCentralManager( bluetoothCentralManagerCallback, new java.util.HashSet<>( java.util.Collections.singletonList( com.welie.blessed.BluetoothCentralManager.SCANOPTION_NO_NULL_NAMES )));
		central.setRssiThreshold( -120 );
		central.scanForPeripherals();
	}

	private final com.welie.blessed.BluetoothPeripheralCallback peripheralCallback = new com.welie.blessed.BluetoothPeripheralCallback() {
	
		@Override
		public void onServicesDiscovered(@NotNull final com.welie.blessed.BluetoothPeripheral peripheral, @NotNull final java.util.List<com.welie.blessed.BluetoothGattService> services)
		{
			for( com.welie.blessed.BluetoothGattService service : services )
			{
				log.info( "\tDiscovered Service: " + service.getUuid() );
			}

			peripheral.setNotify( ENV_SERVICE, TEMP, true );

			com.welie.blessed.BluetoothGattCharacteristic writeCharacteristic = peripheral.getCharacteristic(TIME_SERVICE, TIME);
			if( writeCharacteristic != null )
			{
				peripheral.setNotify(writeCharacteristic, true);

				if( writeCharacteristic.supportsWritingWithResponse()) {

					com.welie.blessed.BluetoothBytesParser parser = new com.welie.blessed.BluetoothBytesParser();
					parser.setCurrentTime( java.util.Calendar.getInstance() );

					peripheral.writeCharacteristic( writeCharacteristic, parser.getValue(), com.welie.blessed.BluetoothGattCharacteristic.WriteType.WITH_RESPONSE);
				}
			}
		}

		@Override
		public void onCharacteristicUpdate(@NotNull com.welie.blessed.BluetoothPeripheral peripheral, byte[] value, @NotNull com.welie.blessed.BluetoothGattCharacteristic characteristic, com.welie.blessed.BluetoothCommandStatus status)
		{
			String output = org.apache.commons.codec.binary.Hex.encodeHexString( value );
			log.info( "onCharacteristicUpdate: " + output );

			final com.welie.blessed.BluetoothBytesParser parser = new com.welie.blessed.BluetoothBytesParser( value );
			if( characteristic.getUuid().equals( TEMP ))
			{
				int rawTemp = parser.getIntValue( com.welie.blessed.BluetoothBytesParser.FORMAT_UINT16, 0, java.nio.ByteOrder.LITTLE_ENDIAN );
				java.math.BigDecimal tempDegreeC = new java.math.BigDecimal( rawTemp ).divide( new java.math.BigDecimal( "100" ), 2, java.math.RoundingMode.HALF_UP );
				log.info( "\ttemp: " + tempDegreeC + " degc " );
			}
			else if( characteristic.getUuid().equals( TIME ))
			{
				log.info( "\ttime: " + parser.getDateTime() );
			}
			else
			{
				log.info( "Unknown Characteristic: " + characteristic.getUuid() );
			}
		}
	};

	private final com.welie.blessed.BluetoothCentralManagerCallback bluetoothCentralManagerCallback = new com.welie.blessed.BluetoothCentralManagerCallback() {

		@Override
		public void onDiscoveredPeripheral(final @NotNull com.welie.blessed.BluetoothPeripheral peripheral, final @NotNull com.welie.blessed.ScanResult scanResult)
		{
			if( knownDevices.contains( peripheral.getAddress() ) )
			{
				return;
			}
			log.info( "onDiscoveredPeripheral: " + peripheral.getAddress() + "\t" + peripheral.getName() );
			knownDevices.add( peripheral.getAddress() );

			if( peripheral.getAddress().equals( lookingFor ) )
			{
				central.stopScan();
				central.connectPeripheral( peripheral, peripheralCallback );
				connectedPeripheral = peripheral;
			}
		}
	};
}
