<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login Page</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</head>
<body>
<style>
    .error{
        color: red;
    }
</style>

${error }
<center>
    <h3>Login Page</h3>
    <form:form method="post" modelAttribute="loginForm">
        <div class="form-group">
            <p>email</p>
            <form:input path="email"/>
            <br><form:errors path="email" cssClass="error"/>
        </div>
        <div class="form-group">
            <p>password</p>
            <form:password path="password"/>
            <br><form:errors path="password" cssClass="error"/>
        </div>
        <input type="submit" value="Login">
        <a href="/signup" /> signup
    </form:form>
    <h3 class="error">${message}</h3>
</center>

<%--<form>--%>
<%--    <table border="0" cellpadding="2" cellspacing="1">--%>
<%--        <tr>--%>
<%--            <td>Username</td>--%>
<%--            <td><input type="text" name="username"></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>Password</td>--%>
<%--            <td><input type="password" name="password"></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>&nbsp;</td>--%>
<%--            <td>--%>
<%--                <input type="submit" value="Login">--%>
<%--                <a href="/signup" /> signup--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--    </table>--%>
<%--</form>--%>

</body>
</html>
