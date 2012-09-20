package org.test;

public class App
{
	public static void main(String[] args) throws Exception
	{
		String type = "_daap._tcp.local.";
		javax.jmdns.JmDNS bonjourService = javax.jmdns.JmDNS.create();
		bonjourService.addServiceListener( type, new DiscoverServices() );
		javax.jmdns.ServiceInfo[] serviceInfos = bonjourService.list( type );
		for( javax.jmdns.ServiceInfo info : serviceInfos )
		{
			System.out.println("## resolve service " + info.getName()  + " : " + info.getURL());
		}
		bonjourService.close();
	}
}
