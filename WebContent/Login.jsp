<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
<style type="text/css">
		#head{
			height: 100px;
			border: 1px black solid;
			background:url(./Pic/bg.png);
		}
		#content{
			height: 600px;
			border: 1px black solid;
		}
		#right,#left{
			border:1px gray solid;
			position: relative;
			top:100px;
			left: 250px;
			float: left;
			width: 450px;
			height: 400px; 
			
		}
		#left {
			font-size: 25px;
			text-align: center;	 
			
		}
		#login_icon{
			width: 200px;
			height:200px;
			
			background:url(./Pic/login.png);
			position:relative;
			left:120px;
			top:100px;
		}
		#left span{
			position: relative;
			top:80px;
		}
		#right {
			
			text-align: center;
			
		}
		
		#foot{
			height: 100px;
			border: 1px black solid;
			text-align: right;
			background:black;
			
		}
		#foot span{
			position: relative;
			right: 20px;
			top:70px;
			color:#ffffff;
		}
		table{
			position: relative;
			top: 100px;
		}
		#btn{
			position:relative;
			width: 100px;
			top:10px; 
		}
		#tip{
			position:relative;
			top:130px;
			left:80px;
			width:250px;
			height:100px;
		}
	</style>
</head>
<body>
<div id="head">
	<h2>&nbsp;&nbsp;学生信息系统</h2>
</div>
<div id="content">
	<div id="left">
		<span>用户登录<br>LOGIN</span>
		<div id=login_icon></div>
	</div>
	<div id="right">
		<form name="loginForm" action="<%=path%>/User_login.action" method="post">
			<table align="center" >
				<tr align="center">
					<td align="right">用户名：</td>
					<td><input type="text" name="username" class="form-input"/></td>
				</tr>
				<tr align="center">
					<td align="right">密&nbsp;&nbsp;&nbsp;码：</td>
					<td><input type="password" name="pwd" class="form-input"/></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="登录" id="btn"></td>
				</tr>
			</table>
		</form>
		<div id="tip">
			<s:fielderror/>
		</div>
	</div>
</div>
<div id="foot">
	<span>作者：林敬凯</span>
</div>
</body>
</html>