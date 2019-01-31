<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<b>User:${user}</b>
	<br>

		<c:if test="${param.error != null}">
			<div class="ui negative message">
				<i class="close icon"></i>
				<div class="header">Oops!</div>
				<p>Please insert your information correctly!!</p>
			</div>
		</c:if>

	<h2 id=head>Create an Application Form</h2>
	

	<form action="/ergasiag21/Applications/saveApplication" method="post">
		 First Name: <input name="firstName" type="text"> <br> SurName: <input
			name="lastName" type="text"> <br> Semester: <input
			name="semister" type="number"> <br> Id: <input name="userId" type="number"> <br> <br>

		<table style="width: 20% th, td{
  padding: 10px;">

			<c:forEach var="tempuni" items="${universities}">
				<tr>
					<th>University id</th>
					<th>University Name</th>
					<th>Language</th>
					<th>Available Positions</th>

				</tr>
				<tr>
					<td>${tempuni.iniversityid}</td>
					<td>${tempuni.universityName}</td>
					<td>${tempuni.universityLanguage}</td>
					<td>${tempuni.availablePositions}</td>

			</c:forEach>

		</table>
			<br> <br> Please pick at least one university from the ones listed above <br>
			University 1: <input name="university1" type="text"> 			Language: <input name="language1" type="text"><br>
			University 2: <input name="university2" type = "text">  		Language: <input name="language2" type="text"><br>
			University 3: <input name="university3" type="text">  			Language: <input name="language3" type="text"><br>
		    <br><input type="submit" value="Confirm choices" />
			
			
	</form>
	<!--  <div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<!--  add our html table here -->
	<!--	<table>
				<tr>
					<th>Id</th>
					<th>first Name</th>
					<th>last Name</th>
					<th>username</th>
					<th>password</th>
					<th>semester</th>
					<th>Email</th>
				</tr>
				<!-- loop over and print our customers -->
	<!-- 	<c:forEach var="tempstudent" items="${students}">

					<tr>
						<td>${tempstudent.id}</td>
						<td>${tempstudent.firstName}</td>
						<td>${tempstudent.lastName}</td>
						<td>${tempstudent.username}</td>
						<td>${tempstudent.password}</td>
						<td>${tempstudent.semester}</td>
						<td>${tempstudent.email}</td>

					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>-->
