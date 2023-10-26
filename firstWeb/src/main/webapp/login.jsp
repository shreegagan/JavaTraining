<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
 <link rel="stylesheet" href="./style.css">
</head>
<body>
 <div class="container">
	<form action="login"  class="form"  method="post">
	 <div class="form">
	Name:<input name="name" type="text" class="form-control"><br/>
	Pass:<input name="pass" type="password" class="form-control"> <br/>
	<input name="submit" type="submit"  value="login" class="btn"/>
	</div>
	</form>
	<p style="color: red;">Message = <%= request.getAttribute("message") %></p>
</div>
</body>
</html>


