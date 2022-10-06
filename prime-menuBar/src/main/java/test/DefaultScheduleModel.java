package test;

public class DefaultScheduleModel implements org.primefaces.model.ScheduleModel, java.io.Serializable
{
	private java.util.List<org.primefaces.model.ScheduleEvent> events;

	public DefaultScheduleModel()
        {
                events = new java.util.ArrayList<org.primefaces.model.ScheduleEvent>();
        }

	@Override
	public void addEvent( org.primefaces.model.ScheduleEvent event )
        {
                event.setId( java.util.UUID.randomUUID().toString() );
                events.add( event );
        }

	@Override
	public void clear()
        {
                events = new java.util.ArrayList<org.primefaces.model.ScheduleEvent>();
        }

	@Override
	public boolean deleteEvent( org.primefaces.model.ScheduleEvent event )
        {
                return events.remove( event );
        }

	@Override
	public org.primefaces.model.ScheduleEvent getEvent( String id )
        {
                for( org.primefaces.model.ScheduleEvent event : events )
                {
                        if( event.getId().equals( id ) )
                                return event;
                }

                return null;
        }

	@Override
	public int getEventCount()
        {
                return events.size();
        }

	@Override
	public java.util.List<org.primefaces.model.ScheduleEvent> getEvents()
        {
                return events;
        }

	@Override
	public boolean isEventLimit()
        {
                return false;
        }

	@Override
	public void updateEvent( org.primefaces.model.ScheduleEvent event )
        {
                int index = -1;

                for( int i = 0; i < events.size(); i++ )
                {
                        if( events.get( i ).getId().equals( event.getId() ) )
                        {
                                index = i;

                                break;
                        }
                }

                if( index >= 0 )
                {
                        events.set( index, event );
                }
        }
}
