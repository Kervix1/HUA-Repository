<jsp:useBean id="student" class="gr.hua.dit.ds.ergasia21.Student"></jsp:useBean>

<!--<form action="StudentServlet" method="post">
Username: <input name="name" type="text">
<br/>
Age: <input name ="age" type="number"/>
<br>
<input type="submit"/>
</form> -->

<form action="LoginServlet" method="post">
      
                Username: <input name="user"  type="text" > <br> 
                Password: <input name="pwd" type="password" > <br> 

                <input type="submit" value="Login">
            
        </form>
        
     <form  action="/lab2/Subscribe.jsp" target="_self">
      <input type="submit" value="Subscribe">
         
     
     </form>