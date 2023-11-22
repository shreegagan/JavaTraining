<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Fancy Phone Number Ranker</title>

<style>
body{
background-color:rgba(0,0,0,0.3)
}
.container {
	font-family: sans-serif;
	background-color: #f5f5f5;
	text-align: center;
	color: #333;
	width:500px;
	margin : auto;
	border : 2px solid crimson;
	border-radius : 10px;

}

</style>
</head>
<body>
<div class="container">
    <h1>Fancy Phone Number Ranker</h1>
    <form action="FancyRankerServlet" method="post">
        <p>Enter ten 10-digit phone numbers, one per line:</p>
        <textarea name="phoneNumbers" rows="10" cols="30"></textarea>
        <br>
        <input type="submit" value="Rank Numbers">
    </form>
    </div>
</body>
</html>
    