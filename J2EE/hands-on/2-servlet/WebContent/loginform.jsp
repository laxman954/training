<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JAVA/J2EE Login Form</title>
</head>
<body>
	<h1>Simple Login Form</h1>
	<hr />
	<p>
		This Simple Form Explains login to Application and Validated login data.
	</p>
	<p> If the login success go the next page
		otherwise display error messages here.</p>
		
		
	<fieldset>
		<legend>Enter Your Login Details</legend>
		
		<form action="login" method="post">
		<br />
			User Name : <input type="text" name="uname" /> <br /> <br />
			Password  : <input type="password" name="password"> <br /><br />
			<input type ="submit" name="Login" />
		</form>
	</fieldset>
	<br /> <br />
</body>
</html>