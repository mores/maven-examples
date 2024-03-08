package org.test;

import org.jetbrains.annotations.NotNull;

public class App
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( App.class );

	private final String[] args;
	private String lookingFor;

	private com.welie.blessed.BluetoothCentralManager central;
	private static final java.util.Set<String> knownDevices = new java.util.HashSet<>();

	public static void main( String[] args )
        {
                new App( args ).run();
        }

        public App( String[] args )
        {
                this.args = args;
	
		if( args.length < 1 )
		{
			log.error( "Please supply address" );
			System.exit( 0 );
		}

		this.lookingFor = args[0];
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
			log.info( "onServicesDiscovered" );

			// _ENV_SENSE_UUID = bluetooth.UUID(0x181A)
			// _TEMP_CHAR = bluetooth.UUID(0x2A6E)
			peripheral.setNotify( java.util.UUID.fromString( "0000181a-0000-1000-8000-00805f9b34fb" ), java.util.UUID.fromString( "00002a6e-0000-1000-8000-00805f9b34fb" ), true );
		}

		@Override
		public void onCharacteristicUpdate(@NotNull com.welie.blessed.BluetoothPeripheral peripheral, byte[] value, @NotNull com.welie.blessed.BluetoothGattCharacteristic characteristic, com.welie.blessed.BluetoothCommandStatus status)
		{
			String output = org.apache.commons.codec.binary.Hex.encodeHexString( value );
			log.info( "onCharacteristicUpdate: " + output );

			final com.welie.blessed.BluetoothBytesParser parser = new com.welie.blessed.BluetoothBytesParser( value );	
			int rawTemp = parser.getIntValue( com.welie.blessed.BluetoothBytesParser.FORMAT_UINT16, 0, java.nio.ByteOrder.LITTLE_ENDIAN );
			java.math.BigDecimal tempDegreeC = new java.math.BigDecimal( rawTemp ).divide( new java.math.BigDecimal( "100" ), 2, java.math.RoundingMode.HALF_UP );
			log.info( "temp: " + tempDegreeC + " degc " );
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
			log.info( "onDiscoveredPeripheral: " + peripheral.getAddress() );
			knownDevices.add( peripheral.getAddress() );

			if( peripheral.getAddress().equals( lookingFor ) )
			{
				central.connectPeripheral( peripheral, peripheralCallback );
			}
		}
	};
}
