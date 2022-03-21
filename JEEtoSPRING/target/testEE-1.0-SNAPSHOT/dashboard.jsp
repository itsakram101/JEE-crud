
<%@ page isELIgnored="false" %>


<%@ page import="youcode.entities.Employee" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="youcode.entities.Address" %><%--
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

    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap CRUD Data Table for Database with Modal Form</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<body>

    <h1 class="text-center">Employee Management</h1>

</body>
<div class="table-wrapper">
    <h2 class="text-center font-weight-bold"><a class="btn-primary btn mb-5 font-weight-bold" href="${pageContext.servletContext.contextPath}/add">Add Employee</a></h2>
    <table class="table table-striped table-dark">
        <thead class="bg-primary">
        <tr>
            <th scope="col">name</th>
            <th scope="col">departure date</th>
            <th scope="col">entry date</th>
            <th scope="col">Edit</th>
            <th scope="col">Delete</th>
        </tr>
        </thead>
        <tbody>
        <%ArrayList<Employee> list = (ArrayList<Employee>) request.getAttribute("employees");%>
        <% for(Employee employee : list) {%>
        <tr>
            <td><%out.println(employee.getName());%></td>
            <td><%out.println(employee.getDepartureDate());%></td>
            <td><%out.println(employee.getEntryDate());%></td>

            <td><a href="${pageContext.servletContext.contextPath}/update?id=<% out.println(employee.getIdEmployee());%>" class="btn btn-primary">Edit <i class="fas fa-user-edit"></i></a>
            </td>
            <td><a href="${pageContext.servletContext.contextPath}/delete?id=<% out.println(employee.getIdEmployee());%>" class="btn btn-danger">Delete <i class="fas fa-trash"></i></a>
            </td>



        </tr>
        <%}%>
        </tbody>
    </table>

</div>
</body>
</html>

