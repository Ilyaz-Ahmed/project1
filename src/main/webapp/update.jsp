<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update">
id:<input type="number" name="sid" value=<%=request.getParameter("sid") %> readonly="readonly">
name:<input type="text" name="sname" value=<%=request.getParameter("sname") %>>
phno:<input type="number" name="phno" value=<%=request.getParameter("phno") %>>
Male:<input type="radio" name="gender" value="male">
female:<input type="radio" name="gender" value="female">
<button type="submit">update</button>
<button>cancel</button>
</form>
</body>
</html>