<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
admin
</h1>
<h2>
Welcome ${dataMap.get("user").getUserFname()}
</h2>

<%--  <c:set var="temp" value="${dataMap.get(.\"productList.\")}"/>
<c:out value="${salary}"/>
 

<h1>${temp.getpName()} </h1>

 --%>

<p1>
<table border="1">
<thead>
 <tr><h2>Product List</h2></tr>
 <tr>
    <th>Product Name</th>
    <th>Product Price</th>
    <th>Product Category</th>
    <th>Product Image Name</th>
  </tr>
</thead>

 <tbody> 
 <c:forEach items="${dataMap.get(\"productList\")}" var="product">
    <tr>
      <td>${product.getpName()}</td>
      <td>${product.getPrice()}</td>
      <td>${product.getCategory()}</td>
      <td>${product.getImageName()}</td>
    </tr>
  </c:forEach> 
  </tbody>
</table> 
</p1>
</br>
<table>
<tr></tr>
<tr>
<input type="button" value="Add Product" onclick="window.location='addProductForm';" />
</tr></table>

<table border="1">
<thead>
 <tr><h2>User List</h2></tr>
 <tr>
    <th>Name</th>
    <th>Email ID</th>
    <th>Address</th>
    <th>Phone number</th>
    <th>Gender</th>
  </tr>
</thead>

 <tbody> 
 <c:forEach items="${dataMap.get(\"userList\")}" var="user">
    <tr>
      <td>${user.getUserFname()} ${user.getUserLname()}</td>
      <td>${user.getEmailId()}</td>
      <td>${user.getAddressLine1()} ${user.getAddressLine2()}</td>
      <td>${user.getPhoneNumber()}</td>
      <td>${user.getGender()}</td>
    </tr>
  </c:forEach> 
  </tbody>
</table> 
</p2>

</body>
</html>
