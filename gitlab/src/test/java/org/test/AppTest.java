package org.test;

import org.junit.Test;

public class AppTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( AppTest.class );

	private org.apache.http.impl.client.CloseableHttpClient httpClient;

	@Test
	public void testGitlab() throws Exception
	{
		log.info( "gitlab" );

		org.apache.poi.ss.usermodel.Workbook workbook = new org.apache.poi.xssf.usermodel.XSSFWorkbook();
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.createSheet("MergeRequests");

		org.gitlab4j.api.GitLabApi gitLabApi = new org.gitlab4j.api.GitLabApi(yourUrl, yourToken);
		gitLabApi.setIgnoreCertificateErrors(true);

		java.util.Map<Integer,String> projectsById = new java.util.HashMap<>();
		java.util.List<org.gitlab4j.api.models.Project> projects = gitLabApi.getProjectApi().getProjects();
		for( org.gitlab4j.api.models.Project project : projects )
		{
			if( project.getOwner() == null )
			{
				projectsById.put( project.getId(), project.getName() );
			}
		}

		java.time.LocalDate inputDate = java.time.LocalDate.parse("2021-05-15");
		java.time.LocalDate firstDayOfQuarter = inputDate.withMonth(inputDate.get(java.time.temporal.IsoFields.QUARTER_OF_YEAR) * 3 - 2).with(java.time.temporal.TemporalAdjusters.firstDayOfMonth());
		java.time.LocalDate lastDayOfQuarter = inputDate.withMonth(inputDate.get(java.time.temporal.IsoFields.QUARTER_OF_YEAR) * 3).with(java.time.temporal.TemporalAdjusters.lastDayOfMonth());
		
		org.gitlab4j.api.models.MergeRequestFilter filter = new org.gitlab4j.api.models.MergeRequestFilter(); 
		filter.setCreatedAfter( java.util.Date.from( firstDayOfQuarter.plusDays( -1 ).atStartOfDay(java.time.ZoneId.systemDefault()).toInstant() ) );
		filter.setCreatedBefore( java.util.Date.from( lastDayOfQuarter.plusDays( 1 ).atStartOfDay(java.time.ZoneId.systemDefault()).toInstant() ) );	
		filter.setState( org.gitlab4j.api.Constants.MergeRequestState.MERGED );
		filter.setTargetBranch( "develop" );

		java.util.List<org.gitlab4j.api.models.MergeRequest> mergeRequests = gitLabApi.getMergeRequestApi().getMergeRequests( filter );

		java.util.Map<Integer,java.util.List<org.gitlab4j.api.models.MergeRequest>> byProject = new java.util.HashMap<>();

		for( org.gitlab4j.api.models.MergeRequest mergeRequest : mergeRequests )
		{
			Integer projectId = mergeRequest.getProjectId();

			java.util.List<org.gitlab4j.api.models.MergeRequest> some = byProject.get( projectId );
			if( some == null )
			{
				some = new java.util.ArrayList<>();
			}
			some.add( mergeRequest );
			byProject.put( projectId, some );	
		}

		int totalMergeRequests = 1;
		for( java.util.Map.Entry<Integer, java.util.List<org.gitlab4j.api.models.MergeRequest>> entry : byProject.entrySet() )
		{
			Integer projectId = entry.getKey();
			java.util.List<org.gitlab4j.api.models.MergeRequest> mrs = entry.getValue();

			String projectName = projectsById.get( projectId );
			if( projectName != null )
			{
				log.info( projectName + "  " + mrs.size() );

				for( org.gitlab4j.api.models.MergeRequest mr : mrs )
				{
					org.apache.poi.ss.usermodel.Row row = sheet.createRow( totalMergeRequests );
					totalMergeRequests = totalMergeRequests + 1;

					org.apache.poi.ss.usermodel.Cell A = row.createCell( 0 );
					A.setCellValue( projectName );

					org.apache.poi.ss.usermodel.Hyperlink link = workbook.getCreationHelper().createHyperlink(org.apache.poi.common.usermodel.HyperlinkType.URL);	
					link.setAddress( mr.getWebUrl() );
					org.apache.poi.ss.usermodel.Cell B = row.createCell( 1 );
					B.setCellValue( mr.getWebUrl() );
					B.setHyperlink(link);
				}
			}
		}

		java.io.FileOutputStream fileOut = new java.io.FileOutputStream("/home/smore/Desktop/Q2.xlsx");
		workbook.write(fileOut);
		fileOut.close();

		workbook.close();
	}
}
