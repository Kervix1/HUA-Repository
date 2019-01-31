<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>

.jstl{
 background-color:  "WebContent/WEB-INF/view/ApplicationLists.jsp";
width:420px;
height:30px;
border: 1px solid black;
 border-radius: 5px;
text-align: center;
margin-left:400px
}

</style>
</head>
<body >
<c:set var="string1" value="${applicationsByAm}" />
<c:set var = "string2" value = "${fn:split(string1,',')}" />
<c:forEach var="i" begin="1" end="10">
<h4 class="jstl">  ${string2[i]}</h4>
</c:forEach>



</body>
</html>