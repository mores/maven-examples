package test;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.faces.lifecycle.ClientWindowScoped;

@Named( "MyWeek" )
@ClientWindowScoped
public class MyWeek implements java.io.Serializable
{
	private org.primefaces.model.ScheduleModel eventModel;
	private java.time.LocalDate initialDate;

	public MyWeek()
        {
                initialDate = java.time.LocalDate.now();

		eventModel = new org.primefaces.model.DefaultScheduleModel();

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

	public java.time.LocalDate getInitialDate()
        {
                return initialDate;
        }

	private org.primefaces.model.DefaultScheduleEvent<java.math.BigDecimal> createEvent( String title, String style, int hours )
        {
                org.primefaces.model.DefaultScheduleEvent<java.math.BigDecimal> day = new org.primefaces.model.DefaultScheduleEvent<>();

		java.time.LocalDateTime now = java.time.LocalDateTime.now();
		java.time.LocalDateTime start = now.plusHours( hours );

                day.setStartDate( start );
                day.setEndDate( start.plusHours( 2 ) );

                day.setTitle( title );
		day.setStyleClass( style );
                day.setEditable( false );

		day.setData( new java.math.BigDecimal( "0" ) );

                return day;
        }
}
