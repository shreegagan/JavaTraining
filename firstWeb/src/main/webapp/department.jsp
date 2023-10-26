<%@page import="firstWeb.Department"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Department Details</title>
  <!-- Add Bootstrap CSS -->
  <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  <style>
  div{
  background-color:gray;
  font-family: Arial, sans-serif;
            text-align: center;
            border-radius: 10px;
            margin: 0;
            padding: 0;
  
  }
  .btn-group{
  background-color:red;
   border-radius: 100px;
   color: green;
  }
  
  
  </style>
</head>
<body>
  <% Department dept = (Department) request.getAttribute("dept"); %>
  <div class="container">
    <h2>Department Details</h2>
    <table class="table table-bordered">
      <tr>
        <th>DeptId</th>
        <td><%= dept.getDid() %></td>
      </tr>
      <tr>
        <th>DeptName</th>
        <td><%= dept.getDname() %></td>
      </tr>
      <tr>
        <th>DeptLoc</th>
        <td><%= dept.getLocation() %></td>
      </tr>
      <tr>
        <th>EmpList</th>
        <td><%= dept.getEmplist() %></td>
      </tr>
    </table>
    
    <hr>
    
    
    <!-- Navigation buttons -->
    <form action="deptCtlr" method="post">
      <div class="btn-group">
        <button type="submit" name="submit1" value="First" class="btn btn-primary">First</button>
        <button type="submit" name="submit1" value="Previous" class="btn btn-primary">Previous</button>
        <button type="submit" name="submit1" value="Next" class="btn btn-primary">Next</button>
        <button type="submit" name="submit1" value="Last" class="btn btn-primary">Last</button>
      </div>
    </form>
    <!-- Employee table -->
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
  </div>
  <!-- Add Bootstrap JavaScript (optional) -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
