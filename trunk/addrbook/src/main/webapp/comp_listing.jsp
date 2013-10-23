<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jstl/xml" %>

<x:parse var="data"><c:import url="data/complex_data1.xml"/></x:parse>

<html>

<head>
	<title>
	Welcome 
	<c:choose>
		<c:when test="${not empty param.name and param.name != ''}">
			<c:out value="${param.name}"/>
		</c:when>
		<c:otherwise>New User</c:otherwise>
	</c:choose>
	to the Address Book
	</title>
</head>
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