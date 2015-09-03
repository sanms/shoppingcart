<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>


<P>welcome   ${user1.getEmailId()}. </P>
<P>welcome   ${user1.getPasswrd()}. </P>
<P>welcome   ${name}. </P>
</body>
</html>
