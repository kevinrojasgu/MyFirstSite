<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deeper response</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<link rel = "stylesheet" type = "text/css" href = "${pageContext.request.contextPath}/resources/css/" />
</head>
<body>
<div> <p>${responseMessage} </p></div>

<div>
<img alt="rickMorty" src="${pageContext.request.contextPath}/resources/imgs/rickmorty.gif">

<button type="button" class="btn btn-dark">Dark</button>
</div>
	
</body>
</html>