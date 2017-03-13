<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="service.File_List,java.util.*"%>

<html>
<head>
<base href=request.getRealPath("")>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  List<File_List> list=(List<File_List>)request.getAttribute("list");
%>
<table border="1">
<tr><td colspan="5"><a href="insert.jsp">新增</a></td>
</tr>
<tr><td>电影名称</td><td>电影描述</td><td>语言</td><td>编辑</td><td>删除</td>
</tr>
               <%
               if(list!=null){
		for(int i=0;i<list.size();i++){
			File_List filelist=list.get(i);
		%>	    
                 <tr>
                          <td><%=filelist.getTitle() %></td>
                          <td><%=filelist.getDescription() %></td>
                          <td><%=filelist.getLanguage()%></td>
                    	  <td><a href="edit.jsp?file_id=<%=filelist.getFile_id()%>&title=<%=filelist.getTitle()%>&description=<%=filelist.getDescription()%>&language=<%=filelist.getLanguage()%>">编辑</a></td>
                    	  <td><a href="/DelServlet?file_id=<%=filelist.getFile_id()%>">删除</a></td>                
           		 </tr>    
<%}} %>      

</table>
</body>
</html>