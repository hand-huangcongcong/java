<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<form action="insertCustomer" method="post"  >
		       <table align="center">
		<tr><td><h3>基本信息</h3></td></tr>
		<tr><td>first name:</td><td><input style="width: 180px" type="text"	name="first_name" /></td></tr>
		<tr><td>last_name:</td><td><input style="width: 180px"	type="text" name="last_name" /></td></tr>
		<tr><td>Email:</td><td><input style="width: 180px"	type="text" name="email" /></td></tr>
		<tr><td>address:</td><td>
		
		<select name="address_id"  style="width: 180px"	>
    <option value="address">选择地址</option>
    <c:forEach items="${list}" var="address">
<option value=${address.address_id }>${address.address }</option>
 </c:forEach>

    </select>
   </td></tr>
		<tr><td><input type="submit" value="提交" />&nbsp;&nbsp;<input type="submit" value="取消" /></td></tr>
		</table>    
	</form>
</body>
</html>