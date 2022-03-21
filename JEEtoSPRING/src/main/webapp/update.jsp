<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 1/27/2022
  Time: 11:00 PM
  To change this template use File | Settings | File Templates.
--%>

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
    <title>upadte</title>

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
    <h2 class="text-center font-weight-bold"><a class="btn-primary btn mb-5 font-weight-bold" href="${pageContext.servletContext.contextPath}/home">Go back</a></h2>


</div>

<form action="${pageContext.servletContext.contextPath}/home" method="post">
    <input value="${employee.getIdEmployee()}" required name="id" hidden>

    <div class="row">
        <div class="form-group col-md-6">
            <label for="entry_date">Entry Date:</label>
            <input class="form-control" type="date" value="${getEntryDate}" name="entry_date" placeholder="Entry Date..." id="entry_date"/>
        </div>
    </div>
    <div class="row">
        <div class="form-group my-0 py-0 col-md-12">
            <label class="h4">Address:</label>
        </div>



    </div>
    <div class="row">
        <div class="form-group col-md-12">
            <button class="btn btn-lg btn-primary shadow-sm w-100">Update</button>
        </div>
    </div>
</form>
</body>
</html>

