<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jstl/xml" %>
<c:choose>
	<c:when test="${not empty applicationScope.data}"></c:when>
	<c:otherwise>
		<x:parse var="data" scope="application"><c:import url="data/simple_100.xml"/></x:parse>
	</c:otherwise>
</c:choose>

<html>

<head>
	<title>Simple Search Example</title>
</head>
<body>
<c:choose>
	<c:when test="${not empty param.name and param.name != ''}">
		<c:set var="value" scope="request" value="${param.name}"/>
	</c:when>
	<c:otherwise>
		<c:set var="value" scope="request" value="Adam"/>
	</c:otherwise>
</c:choose>
<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td>
			Results for <b><c:out value="${value}"/></b>
		</td>
	</tr>
	<tr>
		<td>
		<form action="simple_search.jsp" method="get">
		Search by first name: <input type="text" name="name" value="">
		</form>
		</td>
	</tr>	
<x:forEach select="$data/rowset/row" var="row">
	<x:if select="$value = $row/col[1] or $value = $row/col[2]">
	<tr>
		<td>
		<x:forEach select="$row/col">
			<x:out select="."/>
		</x:forEach>
		</td>
	</tr>
	</x:if>
</x:forEach>
</table>

</body>

</html>