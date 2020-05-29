<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Students registration</title>
</head>
<body>
	 <form:form action="registerStudent" modelAttribute="student">  
        First name: <form:input path="firstName" />
        	<form:errors path="firstName"/>         
        <br><br>  
        Last name: <form:input path="lastName" /> 
       	 	<form:errors path="lastName"/>        
        <br><br>  
        Birthday: (mm/dd/yyyy) <form:input type="date" path="birthdate" />
        	<form:errors path="birthdate"/>         
        <br><br>  
        Email: <form:input path="email" /> 
        	<form:errors path="email"/>        
        <br><br>  
        Phone Number: <form:input path="phoneNumber"/>
       		<form:errors path="phoneNumber"/>
       	<br><br>
       	Profession: 
       	<form:select path="profession"  >
    		<form:options items="${professionList}"/>
       	</form:select>
        <br><br>  
       	Pick a number between 10 and 100: <form:input path="favNum"/>
       		<form:errors path="favNum"/>
       	<br><br>
       	<input type="submit" value="Submit" />      
    </form:form>  
	
</body>
</html>