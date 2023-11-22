<%@page import="com.valtech.training.assignmentspringboot.models.DepartmentModels"%>
<%@page import="com.valtech.training.assignmentspringboot.models.EmployeeModels"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of All Employees</title>

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
	<h1>List of Employees</h1>
	<%
	List<EmployeeModels> employees = (List<EmployeeModels>) request.getAttribute("employees");
	%>
	<%
	/* List<DepartmentModels> departments = (List<DepartmentModels>) request.getAttribute("departments"); */
	DepartmentModels departmentModels = (DepartmentModels) request.getAttribute("departments");
	request.setAttribute("current", departmentModels.getId());
	%>
	<table border="2px">
		<tr>
			<th>Department_ID</th>
			<th>Department_Name</th>
			<th>Department_Location</th>
		</tr>
		<%-- <%
		for (DepartmentModels department : departments) {
			request.setAttribute("department", department);
		%> --%>
		<%
		request.setAttribute("department", departmentModels);
		%>
		<tr>
			<td>${department.id}</td>
			<td>${department.dname}</td>
			<td>${department.dlocation}</td>
		</tr>

		<%-- <%
		}
		%> --%>
		<tr>
			<td colspan="6">
				<form action="list" method="post">
					<input type="submit" name="submit" value="First" /> <input
						type="submit" name="submit" value="Previous" /> <input
						type="submit" name="submit" value="Next" /> <input type="submit"
						name="submit" value="Last" />
				</form>
			</td>
		</tr>
	</table>
	<table border="2px">
		<tr>
			<th>Employee_ID</th>
			<th>Employee_Name</th>
			<th>Age</th>
			<th>Experience</th>
			<th>Seniority</th>
			<th>Salary</th>
			<th>Department_ID</th>
			<th>Actions</th>
		</tr>
		<%
		for (EmployeeModels employee : employees) {
			request.setAttribute("employee", employee);
		%>
		<tr>
			<td>${employee.id}</td>
			<td>${employee.name}</td>
			<td>${employee.age}</td>
			<td>${employee.experience}</td>
			<td>${employee.seniority}</td>
			<td>${employee.salary}</td>
			<td>${employee.department.id}</td>
			<td><a href="delete?id=${employee.id}">Delete</a> <a
				href="edit?id=${employee.id}">Edit</a></td>
		</tr>
		<%
		}
		%>
		<tfoot>
			<tr>
				<td colspan="5" align="right">
					<form method="get" action="new">
						<input type="submit" name="submit" value="Add New Employee" />
					</form>
				</td>
			</tr>
		</tfoot>
	</table>
</body>
</html>