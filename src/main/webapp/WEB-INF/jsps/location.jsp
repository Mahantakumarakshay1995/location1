<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Locations</title>
</head>
<body>

<h2>show location</h2>

	<form action="savelocation" method="post">
	<pre>
		id<input type="text" name="id"/>
		pin<input type="text" name="code"/>
		f_name<input type="text" name="name"/>
		type<input type="text" name="type"/>
		<input type="submit" value="save"/>
		</pre>
	</form>


</body>
</html>