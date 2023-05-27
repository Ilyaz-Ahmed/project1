<%@page import="dto.Studentdto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% List<Studentdto> dto=(List<Studentdto>)request.getAttribute("Studentlist"); %>
<table border="1px">
<tr>
<th>sid</th>
<th>sname</th>
<th>gender</th>
<th>phno</th>
<th>remove</th>
<th>update</th>
</tr>
<%for(Studentdto a:dto){ %>
<tr>
<td><%=a.getSid()%></td>
<td><%=a.getSname()%></td>
<td><%=a.getGender()%></td>
<td><%=a.getPhno()%></td>
<td><a href="remove?sid=<%=a.getSid()%>">remove</a></td>
<td><a href="update.jsp?sid=<%=a.getSid()%>
&sname=<%=a.getSname()%>>
&phno=<%=a.getPhno()%>>
&gender=<%=a.getGender()%>>">update</a></td>
</tr>
<%}%>
</body>
</html>