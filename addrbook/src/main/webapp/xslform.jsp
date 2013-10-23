<html>

<head><title>Form page for XMLServlet</title></head>

<body>

<form action="xmlservlet" method="get">
<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td>
		<font face="arial" size="2">
		Dataset:
		</font>
		</td>
		<td>
		<font face="arial" size="2">
		<select name="addrbook">
			<option value="http://localhost:8080/addrbook/data/simple_100.xml">simple 100</option>
			<option value="http://localhost:8080/addrbook/data/simple_500.xml">simple 500</option>
			<option value="http://localhost:8080/addrbook/data/simple_1000.xml">simple 1000</option>
			<option value="http://localhost:8080/addrbook/data/medium_100.xml">medium 100</option>
			<option value="http://localhost:8080/addrbook/data/medium_500.xml">medium 500</option>
			<option value="http://localhost:8080/addrbook/data/medium_1000.xml">medium 1000</option>
			<option value="http://localhost:8080/addrbook/data/complex_100.xml">complex 100</option>
			<option value="http://localhost:8080/addrbook/data/complex_500.xml">complex 500</option>
			<option value="http://localhost:8080/addrbook/data/complex_1000.xml">complex 1000</option>
		</select>
		</font>
		</td>
	</tr>
	<tr>
		<td>
		<font face="arial" size="2">
		Stylesheet:
		</font>
		</td>
		<td>
		<font face="arial" size="2">
		<select name="style">
			<option value="http://localhost:8080/addrbook/data/simple_data.xsl">simple</option>
			<option value="http://localhost:8080/addrbook/data/medium_data.xsl">medium</option>
			<option value="http://localhost:8080/addrbook/data/complex_data.xsl">complex</option>
		</select>
		</font>
		</td>
	</tr>
	<tr>
		<td colspan="2">
		<input type="submit" value="submit">
		</td>
	</tr>
</table>
</form>

</body>

</html>