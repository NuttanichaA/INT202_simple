<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 8/27/2024
  Time: 2:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
            <%--เป็นตัวบอกว่าถ้ากดปุ่ม submmit จะให้ไปที่ไหน--%>
    <form action="test-parameter" method="post"> <%--เขียน form ไม่บอก method default คือ get: value ไปกับ url--%>
        User Name: <input type="text" name="username"><br> <%--get: value ไปกับ body สามารถดูได้ใน payload--%>
        Password: <input type="password" name="password"> <%--หัวใจของการเขียน html ในนี้คือต้องมี name ทุกครั้ง--%>
        <input type="submit">
    </form>
</body>
</html>
