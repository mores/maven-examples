package org.test;


public class DiscoverServices implements javax.jmdns.ServiceListener
{
	@Override
        public void serviceAdded( javax.jmdns.ServiceEvent event)
	{
		System.out.println("Service added   : " + event.getName() + "." + event.getType());
        }

        @Override
        public void serviceRemoved( javax.jmdns.ServiceEvent event)
	{
		System.out.println("Service removed : " + event.getName() + "." + event.getType());
        }

        @Override
        public void serviceResolved( javax.jmdns.ServiceEvent event)
	{
		System.out.println("Service resolved: " + event.getInfo());
        }
}
