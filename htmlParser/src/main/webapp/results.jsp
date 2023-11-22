<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>HTML Parser Results</title>
<style>
.container {
	font-family: Arial, sans-serif;
	background-color:AntiqueWhite ;
	margin: auto;
	padding: 0;
	text-align: center;
	border : 2px solid black;
	border-radius : 10px;
	width : 700px;
}

h1 {
	font-size: 24px;
	color: #333;
	margin-top: 20px;
}

h2 {
	font-size: 20px;
	color: #333;
	margin-top: 20px;
}

ul {
	list-style-type: none;
	margin-top: 20px;
	padding-left: 20px;
}

li {
	font-size: 16px;
	color: #333;
	margin-bottom: 10px;
}

li:last-child {
    display: inline-block;
    padding: 5px;
    border: 1px solid black;
    font-size: 20px;
    font-weight: bold;
    color: blue;
}

</style>

</head>
<body>
<div class="container">
	<h1>HTML Parser Results</h1>
	<h2>Tag Count and Locations:</h2>
	<ul>
		<c:forEach items="${tags}" var="tag">
			<li>${tag}</li>
		</c:forEach>
	</ul>
	</div>
</body>
</html>
