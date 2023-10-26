<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Fancy Phone Number Ranker Result</title>

<style>
body{
background-color:rgba(0,0,0,0.5)
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
<h1>Fancy Phone Number Ranker Result</h1>
    
    <p>Ranked Phone Numbers:</p>
    <ol>
        <c:forEach items="${rankedPhoneNumbers}" var="phoneNumber">
            <li>${phoneNumber}</li>
        </c:forEach>
    </ol>
    
    <p><a href="index.jsp">Go back</a></p></div>
</body>
</html>
