
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<%--<head>--%>
<%--    <!-- Latest compiled and minified CSS -->--%>
<%--    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">--%>

<%--    <!-- Optional theme -->--%>
<%--    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">--%>

<%--    <!-- Latest compiled and minified JavaScript -->--%>
<%--    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>--%>



<%--    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">--%>
<%--    <title>Login Page</title>--%>
<%--    <script>--%>
<%--        var BASEURL = "<c:url value="/" />";--%>
<%--        console.log(BASEURL);--%>
<%--    </script>--%>
<%--</head>--%>
<head>
        <script
                src="https://code.jquery.com/jquery-3.4.1.js"
                integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
                crossorigin="anonymous"></script>
</head>
<jsp:include page="navbar.jsp" />
<script>
    var BASEURL = "<c:url value="/" />";
    console.log(BASEURL);
</script>
<body>
<style>
    .error{
        color: red;
    }
</style>

<h3>Create A Post</h3>


<form:form action="/post/edit" method="post" modelAttribute="newPost">

    <div class="form-group">
        <form:hidden path="userId" value="${newPost.userId}"/>
        <form:hidden path="id" value="${newPost.id}"/>
        <form:textarea  path="postContent" cssClass="form-control rounded-0"
                        placeholder="whats on you mind..." id="exampleFormControlTextarea1" rows="10"/>
        <form:errors path="postContent" cssClass="error"/>
    </div>



    <div class="form-group">
        <label for="place_dropdown">Select list:</label>
        <form:select cssClass="form-control" id="place_dropdown" path="placeId">
            <option></option>
        </form:select>
        <form:errors path="placeId" cssClass="error"/>
        <script>
        $(function () {
            $.ajax({
               url:BASEURL+"api/places/all",
                success:function (places) {
                    var select = $("#place_dropdown");
                    select.find('option').remove();
                    $.each(places,function (i,val) {
                        // console.log(val);
                        $('<option>').val(val.id).text(val.placeName).appendTo(select);
                    });

                }
            });
        });
        </script>
    </div>
    <div class="form-group" >
        <form:select cssClass="form-control" id="privacy_dropdown" path="privacyTypeId">
            <option></option>
        </form:select>
        <form:errors path="privacyTypeId" cssClass="error"/>
        <script>
            $(function () {
                $.ajax({
                    url:BASEURL+"api/privacy/all",
                    success:function (data) {
                        var select = $("#privacy_dropdown");
                        select.find('option').remove();
                        $.each(data,function (i,val) {
                            console.log(val);
                            $('<option>').val(val.id).text(val.privacyType).appendTo(select);
                        });
                    }
                });
            });
        </script>

    </div>

    <input type="submit" value="Update"/></td>

</form:form>

<h3>
    ${message}
</h3>





</body>
</html>

