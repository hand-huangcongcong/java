<%@ page language="java" pageEncoding="UTF-8" %>
 <head> 
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" /> 
<html>
<body>

<li><a href = "login.jsp">登陆</a>    
</li>
<li>
<a href = "query.jsp">查找</a> 
   </li> 
<li>
 <a href = "<%=request.getContextPath()%>/ListServlet">电影列表</a>
</li> 
<li>
 <a href ="login.jsp">注销</a>
</li> 
</body>
</html>
