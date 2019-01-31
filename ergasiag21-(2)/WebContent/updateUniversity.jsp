User:
<b>${user}</b>
<br>
<style>
h2.solid {
	margin-left: 3em;
}

input.input {
	margin-left: 7em;
}

input.stdN {
	margin-left: 11em;
}

input.stdN1 {
	margin-left: 1em;
}
</style>
<h2 class=solid>Update Universities</h2>


<form action="/ergasiag21/Universities/updateUniversity" method="post">
	<p> Please enter the university's name and the new available positions: </p>
	University Name: <input name="universityName" type="text"> <br> <br>
	Available Positions: <input name="availablePositions" type="number"> <br> <br>
	
	<input type="submit" value="Confirm university commit" />
	
	



</form>
