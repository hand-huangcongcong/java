<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/InsertServlet" method="post">
<table>
<tr><td>电影名称</td><td><input type="text" name="title"></td></tr>
<tr><td>电影描述</td><td><input type="text" name="description"></tr>
<tr><td>语言</td><td><input type="text" name="language"></tr>
<tr><td><input type="submit" value="确定"></td></tr>
</table>
</form>
</body>
</html>