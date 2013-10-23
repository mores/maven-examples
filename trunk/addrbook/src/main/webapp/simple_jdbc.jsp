<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jstl/xml" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>

<sql:setDataSource
	driver="oracle.jdbc.driver.OracleDriver"
	url="jdbc:oracle:thin:@192.168.0.2:1521:logan"
	user="recipe"
	password="sirachibaby"
	scope="application"
	var="addrdb"/>
	
<sql:query var="result" dataSource="${addrdb}">select * from recipes where recipe_pk > 423</sql:query>

<html>

<head>
	<title>Welcome</title>
</head>
<body>

<table border="0" cellpadding="0" cellspacing="0">
<c:forEach items="${result.rows}" var="row">
	<tr>
		<td>
		<c:out value="${row.recipe_title}"/><br>
		<c:out value="${row.preparation}"/><br>
		<c:out value="${row.cooking}"/><br>
		</td>
	</tr>
</c:forEach>
</table>

</body>

</html>