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


<table border="1">
<thead>
 <tr>Product List</tr>
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



</body>
</html>
