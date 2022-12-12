
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style><%@include file='/WEB-INF/views/css/table_dark.css' %></style>
<html>
<head>
  <title>Register</title>
</head>
<body>
<form method = "post" action="${pageContext.request.contextPath}/register">
  <h1 class="table_dark">Register:</h1>
<table border="1" class="table_dark">
  <tr>
    <th>Name</th>
    <th>License</th>
    <th>Login</th>
    <th>Password</th>
    <th>Register</th>
  </tr>
  <tr>
    <td><input type="text" name="name" required> </td>
  <td><input type="text" name="license" required> </td>
  <td><input type="text" name="login" required></td>
  <td> <input type="password" name="password" required></td>
    <td><button type ="submit">Register</button></td>
  </tr>
</table>
</form>
<h4><a href="${pageContext.request.contextPath}/login"></a> </h4>
</body>
</html>
