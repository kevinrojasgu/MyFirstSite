<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>


<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<title>Student registration</title>
</head>
<body>	
		<h3>Student: </h3>
		<br>
	    First name: <label>"${student.firstName}"</label>
        <br><br>  
        Last name: <label>"${student.lastName}"</label>  
        <br><br>  
        Birthday: <label>"${student.birthdate}"</label>
        <br><br>  
        Email: <label>"${student.email}"</label>  
        <br><br>  
        Phone Number: <label>"${student.phoneNumber}"</label>  
        <br><br>  
        Profession: <label>"${student.profession}"</label>
        <br><br>
        Favorite Number: <label>"${student.favNum}"</label>
        <br><br>
</body>
</html>