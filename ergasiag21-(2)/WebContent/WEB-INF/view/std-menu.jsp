<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<!--  <meta charset="UTF-8">-->
<style>

.button_menu {
margin-top: 30px;
  background-color:#FFFF99;

  border-radius: 2px;
  color: black;

  padding: 25px 100px;
 float: left;

  text-decoration: none;

  font-size: 16px;
   display: inline-block;
 
  cursor: pointer;
   -webkit-transition-duration: 0.4s; /* Safari */
  transition-duration: 0.4s;




}

.button_menu:hover {
  background-color: #FFFF33	; /* Green */
  color: black;
  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
}
.title{
margin-bottom:10px

}
.copy{
margin-top: 500px;


}
</style>
</head>
<body>
<div class="w3-container w3-blue">
  <h2>Student Menu</h2>
</div>

<a href="/ergasiag21/Universities/list" class="button_menu">Fill your Application</a> 
<a href="/ergasiag21/Applications/list" class="button_menu">See the Applications list</a>
<a href="<c:url value="/id-form.jsp"></c:url>" class="button_menu">See your Application</a>

</body>
</html>



