<%@ page import="javax.xml.transform.*,javax.xml.transform.stream.*,javax.xml.transform.sax.*,java.util.*,java.io.*" %>
<%
	String base = "../webapps/addrbook/data/";
	String source = "simple_100.xml";
	String xsl = "simple_data.xsl";
	if (request.getParameter("xml") != null) {
		source = request.getParameter("xml");
	}
	if (request.getParameter("xsl") != null) {
		xsl = request.getParameter("xsl");
	}
	TransformerFactory tfac = TransformerFactory.newInstance();
	Source ssource = new StreamSource(base + source);
	Result result = new StreamResult(out);
	Transformer trans = tfac.newTransformer(new StreamSource(base + xsl));
%>
<html>

<head><title>xml stream transform</title></head>

<body>
<%		trans.transform(ssource,result); %>
</body>

</html>