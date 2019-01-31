<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<!--  <meta charset="UTF-8">-->
<style>
.input_id {



  border-radius: 2px;
  color: black;

  padding: 4px 20px;


  text-decoration: none;

  font-size: 16px;

}
.copy{
margin-top: 500px;


}


</style>
</head>
<body>
<div class="w3-container w3-blue">
  <h2>Enter Your ID</h2>
</div>

<form action ="FromById" class="w3-container" method ="post">
  <p>

  <input class="w3-input" type="text" name="id"></p>
  	<input type="submit" value="submit" >
</form>
	<!--<form action ="FromById" method ="post"> 
		Enter your id:<input type="text" name="id" class="input_id"> 
	<input type="submit" value="submit" >
	
	</form>-->
</body>
</html>