<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jstl/xml" %>
<c:choose>
	<c:when test="${not empty applicationScope.data}"></c:when>
	<c:otherwise>
		<x:parse var="data" scope="application"><c:import url="data/simple_data1.xml"/></x:parse>
	</c:otherwise>
</c:choose>

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