<%--
  Created by IntelliJ IDEA.
  User: iftekhar
  Date: 3/7/19
  Time: 3:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login Page</title>
</head>
<body>

<h3>Login Page</h3>
${error }
<form method="post"
      action="${pageContext.request.contextPath }/login">
    <table border="0" cellpadding="2" cellspacing="1">
        <tr>
            <td>Username</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td>
                <input type="submit" value="Login">
                <a href="/signup" /> signup
            </td>
        </tr>
    </table>
</form>

</body>
</html>
