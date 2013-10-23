<%@ page import="peter.db.*,java.sql.*,java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jstl/xml" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>

<%
	String mg = "manager";
	DBManager manager = (DBManager)pageContext.findAttribute(mg);
	if (manager == null) {
		manager = new DBManager();
		pageContext.setAttribute(mg,manager,PageContext.APPLICATION_SCOPE);
	}
	QueryBean bean = new QueryBean(manager);
	ResultSet result = bean.runQuery("select * from recipes where recipe_pk > 423");
%>
	
<html>

<head>
	<title>Welcome</title>
</head>
<body>

<table border="0" cellpadding="0" cellspacing="0">
<% while (result.next()) {%>
	<tr>
		<td>
		<%=result.getString("recipe_title") %><br>
		<%=result.getString("preparation") %><br>
		<%=result.getString("cooking") %><br>
		<%=result.getString("serving") %><br>
		<%=result.getString("tips") %><br>
		</td>
	</tr>
<% } %>
</table>

</body>

</html>