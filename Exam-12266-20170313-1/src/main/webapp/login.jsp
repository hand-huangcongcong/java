<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
</head>
<body>

			<form action="/Servlet" method="post">
			<table><tr><td>用户名</td><td><input type="text" class="text" name="username"></td></tr>
			<tr><td>密码</td><td><input type="password" name="pwd"></td></tr>
			</table>
					
		<input type="submit" value="登陆" >
			</form>

</body>
</html>