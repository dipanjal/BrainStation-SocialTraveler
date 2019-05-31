<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login Page</title>
</head>
<body>

<style>
    .error{
        color: red;
    }
</style>


<center>
    <h3>Signup</h3>
    <form:form method="post" modelAttribute="user">
        <%--<form:input path="userName"></form:input>--%>
        <%--<input type="submit" value="signup"/>--%>

        <table border="0" cellpadding="2" cellspacing="2">
            <tr>
                <td>First Name:</td>
                <td><form:input path="firstName"/> <form:errors path="firstName" cssClass="error"/> </td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><form:input path="lastName"/> <form:errors path="lastName" cssClass="error"/> </td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="email"/>  <form:errors path="email"  cssClass="error"/> </td>
            </tr>

            <tr>
                <td>Phone:</td>
                <td><form:input path="phone"/>  <form:errors path="phone" cssClass="error"/> </td>
            </tr>

            <tr>
                <td>Password:</td>
                <td><form:input path="password"/>  <form:errors path="password" cssClass="error"/> </td>
            </tr>

            <tr>
                <td><input type="submit" value="Signup" /></td>
                <td><a href="/" />Login</td>

            </tr>
        </table>

    </form:form>
</center>


</body>
</html>

