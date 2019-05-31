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

<!DOCTYPE html>
<html lang="en">

<body>

<jsp:include page="navbar.jsp" />

<div class="container">
    <h3>News Feed</h3>
    <c:forEach items="${posts}" var="post">
        ${post.user.firstName}<br>
        ${post.postContent}<br>
        at ${post.place.placeName.toUpperCase()}<br><br>
    </c:forEach>
</div>

</body>
</html>




</body>
</html>

