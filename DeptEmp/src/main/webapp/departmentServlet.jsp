<%@page import="department.DepartmentD"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Department and Employee Details</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body{
background-color: gray;
}

  
    /* Style for the first table (Department Details) */
    table.table-bordered:first-child {
        width: 50%;
        margin: 0 auto;
    }
    table.table-bordered:first-child td {
        text-align: center;
        padding: 5px;
    }
    table.table-bordered:first-child td:nth-child(odd) {
        font-weight: bold;
    }

    /* Style for the buttons in the first table */
    table.table-bordered:first-child input[type="submit"] {
        background-color: black;
        color: #fff;
        padding: 5px 10px;
        border: none;
        cursor: pointer;
        margin: 5px;
    }

    /* Style for the second table (Employee Details) */
    table.table-bordered:nth-child(2) {
        width: 100%;
        margin: 20px auto;
    }
    table.table-bordered:nth-child(2) th,
    table.table-bordered:nth-child(2) td {
        text-align: center;
    }
    table.table-bordered:nth-child(2) thead {
        background-color: BlueViolet;
        color: #fff;
    }
    table.table-bordered:nth-child(2) tbody tr:nth-child(odd) {
        background-color: #f2f2f2;
    }
</style>
  

</head>
<body>
	<%
	DepartmentD dept = (DepartmentD) session.getAttribute("dept");
	%>
	<table class="table table-bordered">
		<tr>
			<td>Department Id:</td>
			<td><%=dept.getDeptId()%></td>
		</tr>
		<tr>
			<td>Department Name:</td>
			<td><%=dept.getDeptName()%></td>
		</tr>
		<tr>
			<td>Department Location:</td>
			<td><%=dept.getDeptLoc()%></td>
		</tr>
		<tr>
			<td colspan="2">
				<form action="dispEmpbyDept" method="post">
					<input type="submit" name="submit" value="First" /> <input
						type="submit" name="submit" value="Previous" /> <input
						type="submit" name="submit" value="Next" /> <input type="submit"
						name="submit" value="Last" />
				</form>
			</td>
		</tr>
	</table>
	<table class="table table-bordered">
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>AGE</th>
				<th>EXPERIENCE</th>
				<th>SENIORITY</th>
				<th>SALARY</th>
				<th>DEPTID</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="employee" items="${emps}">
				<tr>
					<td><c:out value="${employee.id}" /></td>
					<td><c:out value="${employee.name}" /></td>
					<td><c:out value="${employee.age}" /></td>
					<td><c:out value="${employee.experience}" /></td>
					<td><c:out value="${employee.seniority}" /></td>
					<td><c:out value="${employee.salary}" /></td>
					<td><c:out value="${employee.deptId}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>
