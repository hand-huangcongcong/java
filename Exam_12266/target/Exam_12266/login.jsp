<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="<%=path %>/css/style.css">
<title>登录</title>
    <style type="text/css">
    body 
    {
	   margin-left: 0px;
	   background-image: url(<%=path %>/img/login.jpg);
    }
    .style2 {color: #990000}
    .input2 
    {
 	   font-size: 12px;
	   border: 3px double #A8D0EE;
	   color: #344898;
    }
    .submit1 
    {
	   border: 3px double #416C9C;
	   height: 22px;
	   width: 45px;
	   background-color: #F2F2F2;
	   font-size: 12px;
	   padding-top: 0px;
	   cursor: hand;
    }
    .STYLE12 {font-family: Georgia, "Times New Roman", Times, serif}
    .STYLE13 {color: #316BD6; }
    .STYLE15 {color: #fdsere; font-size: 9pt; }
 </style>
 <script type='text/javascript' src='<%=path %>/dwr/interface/loginService.js'></script>
 <script type='text/javascript' src='<%=path %>/dwr/engine.js'></script>
 <script type='text/javascript' src='<%=path %>/dwr/util.js'></script>
 <script language="javascript">

 </script>
</head>
<body>
	<table width="559" height="423" border="0" align="center" cellpadding="0" cellspacing="0"  background="<%=path %>/img/login.jpg">
	<tr><h3>12266 黄聪聪</h3></tr>
	
	 <tr>
		<td width="559">
			<form name="ThisForm" action="login" method="post">
				<table width="410" height="100" border="0" align="right" cellpadding="0" cellspacing="0">
					<tr>
						<td height="10" colspan="2"></td>
					</tr>
			        <tr>
					    <td width="54" height="22" valign="bottom">
						    <span class="STYLE15" >用户名：</span>
						</td>
						<td width="356" valign="bottom">
					        <input name="first_name"  type="text" class="input2" onMouseOver="this.style.background='#F0DAF3';" onMouseOut="this.style.background='#FFFFFF'">
						</td>
					</tr>
					<tr>
						<td height="10" colspan="2" valign="bottom"></td>
					</tr>
					<tr>
						<td height="31" colspan="2" valign="top" class="STYLE15">
						     密&nbsp;&nbsp;&nbsp;&nbsp;码：
							<input name="password" type="password" size="21" class="input2" align="bottom" onMouseOver="this.style.background='#F0DAF3';" onMouseOut="this.style.background='#FFFFFF'">
						</td>
					</tr>
					
					<tr>
						<td height="10" colspan="2" valign="bottom"></td>
					</tr>
					
					
					<tr>
						<td height="10" colspan="2" valign="bottom"></td>
					</tr>
					<tr>
						<td colspan="2" valign="top">&nbsp; &nbsp; &nbsp; &nbsp;
							<input name="button" type="submit" class="submit1" value="登录" > &nbsp;
							<input name="Submit2" type="reset" class="submit1" value="重置">
							
						</td>
				    </tr>
                </table>
	        </form>
        </td>
     </tr>
    </table>
</body>
</html>