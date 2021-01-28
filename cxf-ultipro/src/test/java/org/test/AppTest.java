package org.test;

import org.junit.Test;

public class AppTest
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( AppTest.class );

	@Test
	public void testOne() throws Exception
	{
		log.debug( "testOne" );

		com.ultipro.dataservices.bidata._2.ObjectFactory dataFactory = new com.ultipro.dataservices.bidata._2.ObjectFactory();
		com.ultipro.dataservices.bistream._2.ObjectFactory streamFactory = new com.ultipro.dataservices.bistream._2.ObjectFactory();

		com.ultipro.dataservices.bidata._2.LogOnRequest logOnRequest = new com.ultipro.dataservices.bidata._2.LogOnRequest();
		logOnRequest.setUserName( dataFactory.createLogOnRequestUserName( "" ) );
		logOnRequest.setPassword( dataFactory.createLogOnRequestPassword( "" ) );
		logOnRequest.setClientAccessKey( dataFactory.createLogOnRequestClientAccessKey( "" ) );
		logOnRequest.setUserAccessKey( dataFactory.createLogOnRequestUserAccessKey( "" ));

		com.ultipro.dataservices.bidata._2.IBIDataService dataService = new org.tempuri.BIDataService().getWSHttpBindingIBIDataService();

		org.apache.cxf.endpoint.Client cxfDataClient = org.apache.cxf.frontend.ClientProxy.getClient( dataService ); 
		cxfDataClient.getInInterceptors().add( new org.apache.cxf.interceptor.LoggingInInterceptor() );
		cxfDataClient.getOutInterceptors().add( new org.apache.cxf.interceptor.LoggingOutInterceptor() );

		java.util.Map<String, java.util.List<String>> headers = new java.util.HashMap<String, java.util.List<String>>();
		headers.put( "US-DELIMITER", java.util.Arrays.asList( "," ));
		cxfDataClient.getRequestContext().put( org.apache.cxf.message.Message.PROTOCOL_HEADERS, headers );

		com.ultipro.dataservices.bistream._2.IBIStreamService streamService = new org.tempuri.BIStreamService().getWSHttpBindingIBIStreamService();

		com.ultipro.dataservices.bidata._2.DataContext dataContext = dataService.logOn( logOnRequest );
		if( com.ultipro.dataservices.bidata._2.ContextStatus.OK != dataContext.getStatus() )
		{
			log.error( "status: " + dataContext.getStatus() );
			log.error( "message: " + dataContext.getStatusMessage().getValue() );
			return;
		}

		com.ultipro.dataservices.bidata._2.ReportListResponse reportListResponse = dataService.getReportList( dataContext );
		if( com.ultipro.dataservices.bidata._2.ReportRequestStatus.SUCCESS != reportListResponse.getStatus() )
		{
			log.error( "status: " + reportListResponse.getStatus() );
			log.error( "message: " + reportListResponse.getStatusMessage().getValue() );
			return;
		}

		com.ultipro.dataservices.bidata._2.ArrayOfReport arrayOfReports = reportListResponse.getReports();
		java.util.List<com.ultipro.dataservices.bidata._2.Report> reports = arrayOfReports.getReport();

		com.ultipro.dataservices.bidata._2.ReportRequest reportRequest = dataFactory.createReportRequest(); 
		reportRequest.setReportPath( dataFactory.createReportReportPath( reports.get( 0 ).getReportPath().getValue() ) );
		com.ultipro.dataservices.bidata._2.ReportResponse reportResponse = dataService.executeReport( reportRequest, dataContext );
		if( com.ultipro.dataservices.bidata._2.ReportRequestStatus.SUCCESS != reportResponse.getStatus() )
		{
			log.error( "status: " + reportResponse.getStatus() );
			log.error( "message: " + reportResponse.getStatusMessage().getValue() );
			return;
		}

		String reportKey = reportResponse.getReportKey().getValue();
		log.info( "Report Key: " + reportKey );

		com.ultipro.dataservices.bistream._2.RetrieveReportRequest retrieveReportRequest = streamFactory.createRetrieveReportRequest();

		javax.xml.ws.Holder<com.ultipro.dataservices.bistream._2.ReportResponseStatus> streamStatus = new javax.xml.ws.Holder<>();
		javax.xml.ws.Holder<java.lang.String> streamStatusMessage = new javax.xml.ws.Holder<>();

		com.ultipro.dataservices.bistream._2.StreamReportResponse streamResponse = streamService.retrieveReport( retrieveReportRequest, reportKey, streamStatus, streamStatusMessage );
		if( com.ultipro.dataservices.bistream._2.ReportResponseStatus.FAILED == streamStatus.value )
		{
			log.error( "Failed: " + streamStatusMessage.value );
			return;
		}

		byte[] data = streamResponse.getReportStream();
		log.info( "Size of data: " + data.length );

		java.io.File outfile = new java.io.File( "/tmp/utilipro" );
		org.apache.commons.io.FileUtils.writeByteArrayToFile( outfile, data );
	}
}
