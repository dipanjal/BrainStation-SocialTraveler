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
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login Page</title>
</head>
<body>


<h3>News Feed</h3>



<c:forEach items="${posts}" var="posts">
    ${posts.user.firstName}<br>
    ${posts.postContent}<br>
    ${posts.place.placeName.toUpperCase()}<br><br>

</c:forEach>

</body>
</html>

