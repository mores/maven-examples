<%@ page import="javax.xml.transform.*,javax.xml.transform.stream.*,javax.xml.transform.sax.*,java.util.*,java.io.*" %>
<%
	Random ran = new Random(System.currentTimeMillis());
	String filekey = "filenames";
	String[] vfiles = null;
	if (pageContext.findAttribute(filekey) != null) {
		vfiles = (String[])pageContext.findAttribute(filekey);
	} else {
		File dir = new File("../webapps/addrbook/random");
		vfiles = dir.list();
		pageContext.setAttribute(filekey,vfiles,PageContext.APPLICATION_SCOPE);
	}
	int flen = vfiles.length;
	int newfile = ran.nextInt(vfiles.length);
	String base = "../webapps/addrbook/random/";
	String source = vfiles[newfile];
	String xslbase = "../webapps/addrbook/data/";
	String xsl = "complex_data.xsl";

	if (request.getParameter("xml") != null) {
		source = request.getParameter("xml");
	}
	if (request.getParameter("xsl") != null) {
		xsl = request.getParameter("xsl");
	}
	TransformerFactory tfac = TransformerFactory.newInstance();
	Source ssource = new StreamSource(base + source);
	Result result = new StreamResult(out);
	Transformer trans = tfac.newTransformer(new StreamSource(xslbase + xsl));
%>
<html>

<head><title>xml stream transform</title></head>

<body>
<%		trans.transform(ssource,result); %>
</body>

</html>