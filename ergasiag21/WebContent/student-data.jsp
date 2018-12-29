<jsp:useBean id="student" class="gr.hua.dit.ds.ergasia21.Student"></jsp:useBean>
<jsp:setProperty name="student" property="*" />

<!--Student Username:<jsp:getProperty name="student" property="user"/>
Student password: <jsp:getProperty property="pwd" name="student"  />-->


User:<b>${user}</b>
<br>

<h2 id=head>Create an Application Form</h2>

<form action="StudentDataConnect" method="post">
	Name: <input name="name" type="text"> <br> SurName: <input
		name="sname" type="text"> <br> Semester: <input
		name="semester" type="number"> <br>

	<table style="width: 20% th, td{
  padding: 10px;}">

		
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
					<c:forEach var="tempstudent" items="${students}">

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
<script type="text/javascript">
// 	var name1, name2, name3, name4;
// 	//apo8hkeush panephstimiwn sta name1,name2, ktl
// 	document.getElementById("UN1").innerHTML = "ARXIDOKAMPOS(harokopeio)";
</script>
