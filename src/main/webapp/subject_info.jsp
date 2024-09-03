<%@ page import="sit.int202.simple.entities.Subject" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 9/3/2024
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%Subject subject = (Subject) request.getAttribute("subject");%>
    <%if(subject != null){%>
    <label>Subject ID: <input type="text" disabled value="<%= subject.getId()%>"><br></label>
    <label>Title: <input type="text" disabled value="<%= subject.getTitle()%>"><br></label>
    <label>Credit: <input type="text" disabled value="<%= subject.getCredit()%>"><br></label>
    <%}else{%>
    <h2> Subject code: <%request.getParameter("sID");%> does not exist </h2>
    <%}%>
    <hr>
    <a href="subject-list">Subject List</a>
</body>
</html>
