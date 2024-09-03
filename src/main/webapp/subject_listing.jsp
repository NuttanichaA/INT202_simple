<%@ page import="sit.int202.simple.entities.Subject" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 9/3/2024
  Time: 2:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Subject List</title>
</head>
<body>
    <%
        List<Subject> subjectList = (List<Subject>) request.getAttribute("subjects");
    %>
<table>
    <tr><th>Subject code</th><th>Title</th><th>Credit</th></tr>
    <% for(Subject s : subjectList){%>
    <tr><td><a href="find-subject?sID=<%= s.getId()%>"><%= s.getId()%></a></td> <%-- = เป็นเหมือน sout --%>
    <td><%= s.getTitle()%></td>
    <td><%= s.getCredit()%></td></tr>
    <% }%>
</table>
</body>
</html>
