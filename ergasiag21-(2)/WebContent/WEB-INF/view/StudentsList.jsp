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

	<h2 id=head>Create an Application Form</h2>

	<form action="StudentDataConnect" method="post">
		Name: <input name="name" type="text"> <br> SurName: <input
			name="sname" type="text"> <br> Semester: <input
			name="semester" type="number"> <br>

		<table style="width: 20% th, td{
  padding: 10px;">


			<tr>
				<th>Id</th>
				<th>first Name</th>
				<th>last Name</th>
				<th>username</th>
				<th>password</th>
				<th>semester</th>
				<th>Email</th>
			</tr>
			
			<c:forEach var="tempstudent" items="${students}">

				<!-- 						<tr> -->
				<td>${tempstudent.id}</td>
				<td>${tempstudent.firstName}</td>
				<td>${tempstudent.lastName}</td>
				<td>${tempstudent.username}</td>
				<td>${tempstudent.password}</td>
				<td>${tempstudent.semester}</td>
				<td>${tempstudent.email}</td>
				<!--  						</tr>  -->
			</c:forEach>
			<c:forEach var="tempuni" items="${universities}">

				<tr>
					<td>${tempuni.iniversityid}</td>
					<td>${tempuni.universityName}</td>
					<td>${tempuni.universityLanguage}</td>
					<td>${tempuni.availablePositions}</td>
			</c:forEach>

			<tr>
				<th>University</th>
				<th>language</th>
				<th>Students</th>
			</tr>
			<tr>
				<td id=UNI1>MIT</td>
				<td>English</td>
				<td>50</td>
			</tr>
			<tr>
				<td id=UNI2>Harvard</td>
				<td>Spanish</td>
				<td>94</td>
			</tr>
			<tr>
				<td id=UNI3>Columbia</td>
				<td>French</td>
				<td>94</td>
			</tr>
			<tr>
				<td id=UNI4>Cambrige</td>
				<td>German</td>
				<td>94</td>
			</tr>
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

