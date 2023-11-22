<%@page import="com.valtech.training.assignmentspringboot.models.EmployeeModels"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
body {
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    background-color: LightGoldenrodYellow;
    color: #2c3e50;
    margin: 0;
}

.container {
    max-width: 900px;
    margin: 30px auto;
    padding: 20px;
    border-radius: 8px;
    background-color: #fff;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h1 {
    color: purple;
}

table {
    width: 100%;
    margin-bottom: 20px;
    border-collapse: separate;
    border-spacing: 0 8px;
}

th, td {
    padding: 15px;
    text-align: left;
    border: 1px solid Gray;
    border-radius: 6px;
}

th {
    background-color: DarkGray;
    color: blue;
}

tr:nth-child(even) {
    background-color: #ecf0f1;
}

form {
    margin-top: 20px;
}

input[type="submit"] {
    background-color: Cyan;
    color: black;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}

input[type="submit"]:hover {
    background-color: IndianRed;
}

.btn-danger {
    background-color: #e74c3c;
    color: #fff;
    padding: 8px 15px;
    text-decoration: none;
    border-radius: 5px;
    margin-right: 5px;
}

.btn-danger:hover {
    background-color: #c0392b;
}

.btn-warning {
    background-color: #f39c12;
    color: #2c3e50;
    padding: 8px 15px;
    text-decoration: none;
    border-radius: 5px;
    margin-right: 5px;
}

.btn-warning:hover {
    background-color: #d35400;
}

.btn-success {
    background-color: #2ecc71;
    color: #fff;
    padding: 8px 15px;
    text-decoration: none;
    border-radius: 5px;
}

.btn-success:hover {
    background-color: #27ae60;
}



</style>
</head>
<body>
<%EmployeeModels employees = (EmployeeModels) request.getAttribute("employees"); %>
<form method="post" action="save?id=<%= employees.getId()%>">
	<table border="1px">
		<tr>
			<td>Employee_ID</td>
			<td><input type="text" disabled="disabled" name="id" value="<%= employees.getId()%>"/></td>
		</tr>
		<tr>
			<td>Employee_Name</td>
			<td><input type="text" name="name" value="<%= employees.getName()%>"/></td>
		</tr>
		<tr>
			<td>Age</td>
			<td><input type="text" name="age" value="<%= employees.getAge()%>"/></td>
		</tr>
		<tr>
			<td>Experience</td>
			<td><input type="text" name="experience" value="<%= employees.getExperience()%>"/></td>
		</tr>
		<tr>
			<td>Seniority</td>
			<td><input type="text" name="seniority" value="<%= employees.getSeniority()%>"/></td>
		</tr>
		<tr>
			<td>Salary</td>
			<td><input type="text" name="salary" value="<%= employees.getSalary()%>"/></td>
		</tr>
		<tr>
			<td>Department_ID</td>
			<td><input type="text" name="department" value="<%= employees.getDepartment().getId()%>"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="submit" value="Create"/>
				<input type="submit" name ="cancel" value="Cancel"/>
			</td>
		</tr>
	</table>
</form>
</body>
</html>