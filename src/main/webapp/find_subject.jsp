<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 9/16/2024
  Time: 9:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Find Subject</title>
</head>
<body>
<form action="subject-info" method="post"> <%--เขียน form ไม่บอก method default คือ get: value ไปกับ url--%>
    Subject ID: <input type="text" name="subjectID"><br> <%--หัวใจของการเขียน html ในนี้คือต้องมี name ทุกครั้ง--%>
    <input type="submit">
</body>
</html>
