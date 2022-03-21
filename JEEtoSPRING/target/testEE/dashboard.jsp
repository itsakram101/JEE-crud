
<%@ page isELIgnored="false" %>


<%@ page import="youcode.entities.Employee" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
// <% out.println(employee.getName());%>
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 21/01/2022
  Time: 01:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>


    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap CRUD Data Table for Database with Modal Form</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<body>

    <h1 class="text-center">Hello from the dashboard</h1>

</body>

<table class="table table-responsive align-middle">
    <thead>
    <tr>
        <td>name</td>
        <td>departure_date</td>
        <td>entry_date</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    </thead>
    <tbody>
        <%ArrayList<Employee> list = (ArrayList<Employee>) request.getAttribute("employees");%>
                <% for(Employee employee : list) {%>
    <tr>
        <td><%out.println(employee.getName());%></td>

    </tr>
        <%}%>
    <tbody>
</table>
</body>
</html>
