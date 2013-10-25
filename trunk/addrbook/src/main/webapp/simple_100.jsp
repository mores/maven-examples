<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<x:parse var="data"><c:import url="data/simple_100.xml"/></x:parse>

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
		<td>
		<x:forEach select="$row/col">
			<x:out select="."/>
		</x:forEach>
		</td>
	</tr>
</x:forEach>
</table>

</body>

</html>
