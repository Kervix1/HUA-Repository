<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	User:<b>${user}</b>
	<br>

	<h2 id=head>Create an Application Form</h2>

	<form action="StudentDataConnect" method="post">
		Name: <input name="name" type="text"> <br> SurName: <input
			name="sname" type="text"> <br> Semester: <input
			name="semester" type="number"> <br>

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
		<br> University:<select name="University">
			<option value="un">Select University</option>
			<option value="MIT" id=UN1>MIT</option>
			<option value="Harvard">Harvard</option>
			<option value="Columbia">Columbia</option>
			<option value="Cambrige">Cambrige</option>
		</select> Language:<select name="Language">
			<option value="lan">Select Language</option>
			<option value="English">English</option>
			<option value="Spanish">Spanish</option>
			<option value="French">French</option>
			<option value="German">German</option>
		</select> <br> <br> <input type="submit" />
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
