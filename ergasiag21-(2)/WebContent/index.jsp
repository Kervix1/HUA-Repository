<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
.button {
  background-color: #87CEEB;
  border: 2px solid black;
  border-radius: 12px;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
 
  margin: 4px 2px;
  cursor: pointer;
   -webkit-transition-duration: 0.4s; /* Safari */
  transition-duration: 0.4s;




}

.button:hover {
  background-color: #99CEEA; /* Green */
  color: black;
  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
}
.copy{
margin-top: 420px;

}
</style>
</head>
<body>
<a href="<c:url value="StudentLogin.jsp" ></c:url>"class="button">Login As Student</a> <br> <br>
<a href="<c:url  value="SecretaryLogin.jsp" ></c:url>"class="button">Login As Secretary</a>


</body>
</html>