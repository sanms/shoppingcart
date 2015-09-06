<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring Form</title>
</head>
<body>

<h2>user registration form</h2>
<form:form method="POST" action="adminRegistration"  commandName="adminForm">
   <table>
    <tr>
        <td><form:label path="emailId">Username ( email )</form:label></td>
        <td><form:input path="emailId" /></td>
    </tr>
    <tr>
        <td><form:label path="passwrd">Password</form:label></td>
        <td><form:input type="password" path="passwrd" /></td>
    </tr>
    <tr>
        <td><form:label path="userFname">First Name</form:label></td>
        <td><form:input path="userFname" /></td>
    </tr>
    <tr>
        <td><form:label path="userLname">Last Name</form:label></td>
        <td><form:input path="userLname" /></td>
    </tr>
    
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>
