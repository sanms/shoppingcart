<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring Form</title>
</head>
<body>

<h2>Student Information</h2>
<form:form method="POST" action="springform"  commandName="userForm">
   <table>
    <tr>
        <td><form:label path="emailId">Name</form:label></td>
        <td><form:input path="emailId" /></td>
    </tr>
    <tr>
        <td><form:label path="passwrd">Password</form:label></td>
        <td><form:input path="passwrd" /></td>
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
