<%@ page import="javax.xml.transform.*,javax.xml.transform.stream.*,javax.xml.transform.sax.*,java.util.*,java.io.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jstl/xml" %>
<%
	Random ran = new Random(System.currentTimeMillis());
	String filekey = "filenames";
	String[] vfiles = {"./random/random_0.xml","./random/random_1.xml"};
	if (pageContext.findAttribute(filekey) != null) {
		vfiles = (String[])pageContext.findAttribute(filekey);
	} else {
		File dir = new File("../webapps/addrbook/random");
		vfiles = dir.list();
		pageContext.setAttribute(filekey,vfiles,PageContext.APPLICATION_SCOPE);
	}
	int flen = vfiles.length;
	int newfile = ran.nextInt(vfiles.length);
	pageContext.setAttribute("dsource","./random/" + vfiles[newfile],PageContext.REQUEST_SCOPE);
%>

<x:parse var="data"><c:import url="${dsource}"/></x:parse>

<html>

<head><title>random data series test</title></head>

<body>

<table border="0" cellpadding="0" cellspacing="0">
<x:forEach select="$data/rowset/row" var="row">
	<tr>
		<td colspan="2">
		<x:forEach select="$row/person" var="name">
			<x:out select="$name/first"/> <x:out select="$name/middle"/> <x:out select="$name/last"/>
		</x:forEach>
		</td>
	</tr>
	<tr>
		<td width="50">
			&nbsp;&nbsp;
		</td>
		<td>
		<x:forEach select="$row/address" var="addr">
			<b><x:out select="$addr/label"/></b><br>
			<x:out select="$addr/street1"/><br>
			<x:if select="$addr/street2 != ''"><x:out select="$addr/street2"/><br></x:if>
			<x:out select="$addr/city/label"/>, <x:out select="$addr/state/label"/> <x:out select="$addr/zip/label"/><br>
			<br>
			<x:out select="$addr/notes"/><br>
		</x:forEach>
		</td>
	</tr>
</x:forEach>
</table>

</body>

</html>