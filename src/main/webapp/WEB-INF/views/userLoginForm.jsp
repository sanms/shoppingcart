<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>user login  Form</title>
</head>
<body>
<center>

<h2>user login page</h2>
<form:form method="POST" action="userLoginSubmit"  commandName="loginForm">

   <table>
    <tr>
        <td><form:label path="emailId">Name</form:label></td>
        <td><form:input path="emailId" /></td>
    </tr>
    <tr>
        <td><form:label path="passwrd">Password</form:label></td>
        <td><form:input type="password" path="passwrd" /></td>
    </tr>
    <tr>
  		<td></td>	  
        <td>
          <center>  <input type="submit" value="Submit"/>  </center>
        </td>
  
 </tr>
 <tr>
 <td/>
   <td>
     <center>    <input type="button" value="Register" onclick="window.location='register';" /></center> 
   </td>        
    </tr>
</table>  
</form:form>
</center>
</body>
</html>
