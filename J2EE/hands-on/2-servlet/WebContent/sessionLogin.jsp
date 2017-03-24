<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Session Login Example</title>
</head>
<body>
<fieldset>
		<legend>Enter Your Login Details</legend>
		
		<form action="sessionLogin" method="post">
		<br />
			User Name : <input type="text" name="uname" /> <br /> <br />
			Password  : <input type="password" name="password"> <br /><br />
			<input type ="submit" name="Login" />
		</form>
	</fieldset>
</body>
</html>