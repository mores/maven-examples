package org.test;

import org.jetbrains.annotations.NotNull;

/*
*	all red 	- 0100ffff - 6e74665f656e61626c65 
*	all yellow 	- 0100ffff - 6e74665f656e61626c65 
*	all blue	- 0100ffff - 6e74665f656e61626c65
*/

public class App
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( App.class );

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
					if( connectedPeripheral == null )
					{
						return;
					}
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

				java.util.List<com.welie.blessed.BluetoothGattCharacteristic> characteristics = service.getCharacteristics();
				for( com.welie.blessed.BluetoothGattCharacteristic characteristic : characteristics )
				{
					log.info( "\t\tDiscovered Characteristic: " + characteristic.getUuid() + "\t" + characteristic.getProperties() );
					log.info( "\t\t\tsupportsReading: " + characteristic.supportsReading() );
					log.info( "\t\t\tsupportsWritingWithResponse: " + characteristic.supportsWritingWithResponse() );
					log.info( "\t\t\tsupportsWritingWithoutResponse: " + characteristic.supportsWritingWithoutResponse() );
					log.info( "\t\t\tsupportsNotifying: " + characteristic.supportsNotifying() );

					if( characteristic.supportsReading() )
					{
						boolean read = peripheral.readCharacteristic( characteristic );
						log.info( "Read: " + read );
					}
				}
			}
		}

		@Override
		public void onCharacteristicUpdate(@NotNull com.welie.blessed.BluetoothPeripheral peripheral, byte[] value, @NotNull com.welie.blessed.BluetoothGattCharacteristic characteristic, com.welie.blessed.BluetoothCommandStatus status)
		{
			String output = org.apache.commons.codec.binary.Hex.encodeHexString( value );
			log.info( "onCharacteristicUpdate: " + output );

			final com.welie.blessed.BluetoothBytesParser parser = new com.welie.blessed.BluetoothBytesParser( value );
			log.info( "Unknown Characteristic: " + characteristic.getUuid() );
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
