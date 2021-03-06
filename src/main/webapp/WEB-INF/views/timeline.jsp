<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<%--    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">--%>
    <title>Timeline</title>
<%--    <!-- Latest compiled and minified CSS -->--%>
<%--    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">--%>

<%--    <!-- Optional theme -->--%>
<%--    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">--%>

<%--    <!-- Latest compiled and minified JavaScript -->--%>
<%--    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>--%>

    <script
            src="https://code.jquery.com/jquery-3.4.1.js"
            integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
            crossorigin="anonymous"></script>


</head>
<body>

<jsp:include page="navbar.jsp" />
<script>
    var BASEURL = "<c:url value="/" />";
    console.log(BASEURL);
</script>

<div class="container">
    <h2>Timeline</h2>
    <table class="table" id="posts">
        <thead>
        <tr>
            <th>Firstname</th>
            <th>PLace</th>
            <th>Feeling</th>
        </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
</div>

<script>
    $(function () {
        $.ajax({
            url:BASEURL+"api/post/all",
            success:function (data) {
                var table = $("#posts");

                $.each(data,function (i,val) {
                    console.log(val);
                    // var ulTemp = ul.attr("id",val.id);
                    // ulTemp.append()
                    var urlToEdit = "/post/edit/"+val.id;
                    var urlToDelete = "/post/delete/"+val.id;
                    table.append("<tr><td>"+val.user.firstName +"</td>"+
                        "<td>at "+ val.place.placeName+"</td>" +
                        "<td>"+val.postContent+"</td>" +
                        "<td><a role='button' href='"+urlToEdit+"' type=\"button\" class=\"btn btn-primary\">Edit</a></td>" +
                        "<td><a role='button' href='"+urlToDelete+"' type=\"button\" class=\"btn btn-danger\">Delete</a></td>" +
                        "</tr>");
                    <%--div.append('<ul lass="list-group" id="1"> <li> ${val.postContent} </li> </ul>');--%>
                    // $('<option>').val(val.id).text(val.privacyType).appendTo(select);
                });
            }
        });
    });
</script>

<h3>
    ${message}
</h3>
</body>
</html>

