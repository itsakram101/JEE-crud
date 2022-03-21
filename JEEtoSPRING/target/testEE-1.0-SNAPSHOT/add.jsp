<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 1/24/2022
  Time: 10:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Add Employee</title>
    <style>
        img {
            width: 200px;
        }
    </style>
</head>
<body class="bg-light">

<div class="container">
<div class="justify-content-center py-5">
    <div class="d-flex justify-content-between">
        <div class="col-auto m-auto"><h1 class="text-primary ">Add Employee</h1></div>
        <div><h2 class="text-center font-weight-bold"><a class="btn-success btn mb-5 font-weight-bold" href="${pageContext.servletContext.contextPath}/home">Go Back !</a></h2></div>

    </div>
    <div class="col-md-12">
        <div class="card p-3">
            <form action="${pageContext.servletContext.contextPath}/home" method="post">

                <div class="row">
                    <div class="form-group col-md-6">
                        <label for="name">Name:</label>
                        <input class="form-control" type="String" name="entry_date" placeholder="name" id="name"/>
                    </div>
                </div>
                <div class="row">

                    <div class="form-group col-md-6">
                        <label for="entry_date">Entry Date:</label>
                        <input class="form-control" type="date" name="entry_date" placeholder="Entry Date..." id="entry_date"/>
                    </div>
                </div>
                <div class="m-5 row">
                    <img src ="images/image1.jpg" />
                </div>
                <div>
                    <div class="form-group my-0 py-0 col-md-12">
                        <label class="h6">Address:</label>
                    </div>
                    <div class="form-group col-md-3">
                        <label for="country">Country:</label>
                        <input class="form-control" type="text" name="country" placeholder="Country..." id="country"/>
                    </div>
                    <div class="form-group col-md-3">
                        <label for="city">City:</label>
                        <input class="form-control" type="text" name="city" placeholder="City..." id="city"/>
                    </div>
                    <div class="form-group col-md-3">
                        <label for="street">Street:</label>
                        <input class="form-control" type="text" name="street" placeholder="Street..." id="street"/>
                    </div>
                    <div class="form-group col-md-3">
                        <label for="postalcode">Postal code:</label>
                        <input class="form-control" type="number" name="postalcode" placeholder="Postal code..." id="postalcode"/>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-12">
                        <button class="btn btn-lg btn-success shadow-sm w-100">Save</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</div>

</body>
</html>
