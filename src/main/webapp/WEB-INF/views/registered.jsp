<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h1 class="text-center">${page_name}</h1>
<div class="card position-absolute top-50 start-50 translate-middle" style="width: 28rem;">
  <div class="card-body">UserID : ${userCreationId}</h5>
    <p class="card-text">Email :${userModel.email}<br>Conatct Number : ${userModel.contactNumber}<br>Password : ${userModel.password}</p>
    <a href="#" class="btn btn-primary">OK</a>
  </div>
</div>
</div>
</body>
</html>