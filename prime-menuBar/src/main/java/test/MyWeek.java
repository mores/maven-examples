package test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean( name = "MyWeek" )
@SessionScoped
public class MyWeek implements java.io.Serializable
{
	private org.primefaces.model.ScheduleModel eventModel;
	private java.util.Date initialDate;

	public MyWeek()
        {
		java.util.GregorianCalendar gc = new java.util.GregorianCalendar();
                gc.set( java.util.Calendar.HOUR_OF_DAY, 0 );
                        gc.set( java.util.Calendar.MINUTE, 0 );
                        gc.set( java.util.Calendar.SECOND, 0 );
                        gc.set( java.util.Calendar.MILLISECOND, 0 );
                        gc.set( java.util.Calendar.YEAR, 2022 );
                        gc.set( java.util.Calendar.WEEK_OF_YEAR, 26 );
                        gc.set( java.util.Calendar.DAY_OF_WEEK, java.util.Calendar.MONDAY );

                gc.add( java.util.GregorianCalendar.HOUR, 6 );
                initialDate = gc.getTime();

		eventModel = new DefaultScheduleModel();

		eventModel.addEvent( createEvent( "A1", "driver", 0 ) );
                eventModel.addEvent( createEvent( "A2", "driver", 3 ) );

		eventModel.addEvent( createEvent( "B1", "zero", 5 ) );
                eventModel.addEvent( createEvent( "B2", "zero", 8 ) );

		eventModel.addEvent( createEvent( "C1", "driver", 12 ) );
		eventModel.addEvent( createEvent( "C2", "driver", 16 ) );
		
		eventModel.addEvent( createEvent( "D1", "zero", 12 ) );
                eventModel.addEvent( createEvent( "D2", "zero", 16 ) );
		
	}

	public org.primefaces.model.ScheduleModel getEventModel()
        {
                return eventModel;
        }

	public java.util.Date getInitialDate()
        {
                return initialDate;
        }

	private org.primefaces.model.DefaultScheduleEvent createEvent( String title, String style, int hours )
        {
                org.primefaces.model.DefaultScheduleEvent day = new org.primefaces.model.DefaultScheduleEvent();

		java.util.Calendar calendar = java.util.Calendar.getInstance();
		calendar.setTime( initialDate );

	    	calendar.add( java.util.Calendar.HOUR_OF_DAY, hours);
                day.setStartDate( calendar.getTime() );

		calendar.add( java.util.Calendar.HOUR_OF_DAY, 2 );
                day.setEndDate( calendar.getTime() );

                day.setTitle( title );
		day.setStyleClass( style );
                day.setEditable( false );

                return day;
        }
}
