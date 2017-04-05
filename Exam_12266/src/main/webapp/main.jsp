<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script type="text/javascript"> 
var totalpage,pagesize,cpage,count,curcount,outstr; 
//初始化 
cpage = 1; 
totalpage = 56; 
pagesize = 10; 
outstr = ""; 
function gotopage(target) 
{     
    cpage = target;        //把页面计数定位到第几页 
    setpage(); 
    //reloadpage(target);    //调用显示页面函数显示第几页,这个功能是用在页面内容用ajax载入的情况 
} 
function setpage() 
{ 
    if(totalpage<=10){        //总页数小于十页 
        for (count=1;count<=totalpage;count++) 
        {    if(count!=cpage) 
            { 
                outstr = outstr + "<a href='javascript:void(0)' onclick='gotopage("+count+")'>"+count+"</a>"; 
            }else{ 
                outstr = outstr + "<span class='current' >"+count+"</span>"; 
            } 
        } 
    } 
    if(totalpage>10){  //总页数大于十页 
        if(parseInt((cpage-1)/10) == 0) 
        {             
            for (count=1;count<=10;count++) 
            {    if(count!=cpage) 
                { 
                    outstr = outstr + "<a href='javascript:void(0)' onclick='gotopage("+count+")'>"+count+"</a>"; 
                }else{ 
                    outstr = outstr + "<span class='current'>"+count+"</span>"; 
                } 
            } 
            outstr = outstr + "<a href='javascript:void(0)' onclick='gotopage("+count+")'> next </a>"; 
        } 
        else if(parseInt((cpage-1)/10) == parseInt(totalpage/10)) 
        {     
            outstr = outstr + "<a href='javascript:void(0)' onclick='gotopage("+(parseInt((cpage-1)/10)*10)+")'>previous</a>"; 
            for (count=parseInt(totalpage/10)*10+1;count<=totalpage;count++) 
            {    if(count!=cpage) 
                { 
                    outstr = outstr + "<a href='javascript:void(0)' onclick='gotopage("+count+")'>"+count+"</a>"; 
                }else{ 
                    outstr = outstr + "<span class='current'>"+count+"</span>"; 
                } 
            } 
        } 
        else 
        {   www.jbxue.com
            outstr = outstr + "<a href='javascript:void(0)' onclick='gotopage("+(parseInt((cpage-1)/10)*10)+")'>previous</a>"; 
            for (count=parseInt((cpage-1)/10)*10+1;count<=parseInt((cpage-1)/10)*10+10;count++) 
            {         
                if(count!=cpage) 
                { 
                    outstr = outstr + "<a href='javascript:void(0)' onclick='gotopage("+count+")'>"+count+"</a>"; 
                }else{ 
                    outstr = outstr + "<span class='current'>"+count+"</span>"; 
                } 
            } 
            outstr = outstr + "<a href='javascript:void(0)' onclick='gotopage("+count+")'> next </a>"; 
        } 
    }     
    document.getElementById("setpage").innerHTML = "<div id='setpage'><span id='info'>共"+totalpage+"页|第"+cpage+"页<\/span>" + outstr + "<\/div>"; 
    outstr = ""; 
} 
  //调用分页 



//注册新增按钮的事件
$("#btn_add").click(function () {
 $("#myModalLabel").text("新增");
 $('#myModal').modal();
});
</script>
<title>Insert title here</title>
</head>
	<body leftmargin="2" topmargin="2" >
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px" function="gotopage();">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="6" >	
					<a href="queryAddress" data-toggle="popover" title="Example popover">
	新增
</a>
					</td> 
	
		
			
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
					<td width="15%">操作</td>
					<td width="15%">First_Name</td>
					<td width="15%">Last_Name</td>
					<td width="15%">Email</td>
					<td width="15%">Active</td>
					<td width="15%">Address_Name</td>
		        </tr>	
				<c:forEach items="${list}" var="customer">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						<a href="queryCustomerByid?customer_id=${customer.customer_id}">修改</a> <a href="delCustomer?customer_id=${customer.customer_id}">删除</a>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${customer.first_name}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${customer.last_name}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${customer.email}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${customer.active}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${customer.address_id}
					</td>
				</tr>
				</c:forEach>
			</table>
			

	</body>

</html>"