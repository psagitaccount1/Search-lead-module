<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Lead</title>
</head>
<body>
	<h2>Update new lead</h2>
	<form action="/savelead" method="post">
		<pre>
			First Name<input type="text" name="firstName" value="${lead.firstName}"/>
			Last Name<input type="text" name="lastName" value="${lead.lastName}"/>
			Email<input type="text" name="email" value="${lead.email}"/>
			Mobile<input type="text" name="mobile" value="${lead.mobile}"/>
			<input type="submit" value="update"/>
		</pre>
	</form>
	${msg}
</body>
</html>