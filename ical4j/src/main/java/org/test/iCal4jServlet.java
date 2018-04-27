package org.test;

import javax.servlet.annotation.WebServlet;

@WebServlet( "/*" )
public class iCal4jServlet extends javax.servlet.http.HttpServlet
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( iCal4jServlet.class );

	@Override
	protected void doGet( javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response ) throws javax.servlet.ServletException, java.io.IOException
        {
		log.info( "doGet" );

		response.setContentType("text/calendar");

		net.fortuna.ical4j.model.Calendar calendar = new net.fortuna.ical4j.model.Calendar();
		calendar.getProperties().add( new net.fortuna.ical4j.model.property.ProdId( "-//aapthorp//jBPM iCal wrapper//EN") );
		calendar.getProperties().add( net.fortuna.ical4j.model.property.Version.VERSION_2_0);
		calendar.getProperties().add( net.fortuna.ical4j.model.property.CalScale.GREGORIAN);
		calendar.getProperties().add( net.fortuna.ical4j.model.property.Method.REQUEST);

		java.util.Date start = new java.util.Date();
		java.util.GregorianCalendar end = new java.util.GregorianCalendar();
		end.add( java.util.Calendar.HOUR, 1 );

		net.fortuna.ical4j.model.DateTime startDate = new net.fortuna.ical4j.model.DateTime( start.getTime() );
		net.fortuna.ical4j.model.DateTime dueDate = new net.fortuna.ical4j.model.DateTime( end.getTime() );

		net.fortuna.ical4j.model.component.VEvent event = new net.fortuna.ical4j.model.component.VEvent( startDate, dueDate, "Do - Something" );
		calendar.getComponents().add( event );

		response.getOutputStream().write( calendar.toString().getBytes() );
        }

	@Override
	protected void doPost( javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response ) throws javax.servlet.ServletException, java.io.IOException
        {
		log.info( "doPost" );
        }

}
