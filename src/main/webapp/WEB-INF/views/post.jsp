<%--
  Created by IntelliJ IDEA.
  User: iftekhar
  Date: 3/7/19
  Time: 3:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login Page</title>
</head>
<body>


<h3>Create A Post</h3>

<form:form method="post" modelAttribute="newPost">

    <div class="form-group">
        <form:textarea  path="postContent" cssClass="form-control rounded-0"
                        placeholder="whats on you mind..." id="exampleFormControlTextarea1" rows="10"/>
        <form:select path="places" class="form-control" id="places" />

    </div>

    <%--<form:input path="userName"></form:input>--%>
    <%--<input type="submit" value="signup"/>--%>

<%--    <table border="1" cellpadding="2" cellspacing="2">--%>
<%--        <tr>--%>
<%--            <td><form:hidden path="userId"/></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td><form:textarea  path="postContent" placeholder="whats on you mind"/></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td><input type="submit" value="Signup"/></td>--%>
<%--        </tr>--%>
<%--    </table>--%>

</form:form>

<!--Material textarea-->



</body>
</html>

