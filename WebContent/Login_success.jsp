<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录成功</title>
<style type="text/css">
		#head{
			border: 1px black solid;
			height: 100px;
			background:url(./Pic/bg.png);
		}
		#content{
			height: 600px;
			border: 1px black solid;
		}
		#nav{
			background:url(./Pic/bg2.png);
			width: 200px;
			height: 600px;
			border: 1px black solid;
		}
		#right{
			width: 1127px;
			height: 600px;
			border: 1px black solid;
		}
		#search{
			background:url(./Pic/bg2.png);
			height: 100px;
			border: 1px black solid;
		}
		#info{
			height: 497px;
			border: 1px black solid;
		}
		#nav,#right{
			float: left;

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
		.navitem{
			cursor:pointer;
			text-align: center;
			border: 1px black solid;
			height: 30px;
			line-height:30px;
		}
		.navitem a{
			text-decoration: none;
			color:#000000;		
		}
		#welcome{
			border: 1px black solid;
			position: relative;
			height: 20px;
			width: 120px;
			left: 1200px;
			bottom:20px;
			font-size: 13px;
		}
		#logout{
			border: 1px black solid;
			position: relative;
			width: 120px;
			height: 20px;
			left: 1200px;
			bottom:20px;
			font-size: 13px;

		}
		#logout a{
			text-decoration: none;
			color: #000000;
		}
		iframe{
			width:1120px;
			height:492px;
		}
		#addlink a{
			text-decoration: none;
			color:#0000EE;
		}
	</style>
	<script type="text/javascript">
	var i=0;
		function show1(){
			if(i==0){
				document.getElementById("1").style.display="block";
				document.getElementById("2").style.display="block";
				document.getElementById("3").style.display="block";
				document.getElementById("4").style.display="block";
				i=1;
			}else if(i==1){
				document.getElementById("1").style.display="none";
				document.getElementById("2").style.display="none";
				document.getElementById("3").style.display="none";
				document.getElementById("4").style.display="none";
				i=0;
			}
		}
	</script>
</head>
<body>
<div id="head">
<h2>&nbsp;&nbsp;学生信息管理系统</h2>
<div id="welcome">欢迎:${sessionScope.loginUserName}</div>
<div id="logout"><a href="<%=path%>/User_logout.action">安全退出</a></div>
</div>
<div id="content">
	<div id="nav">
		<div class="navitem" onclick="show1();">主菜单</div>
		<div class="navitem" style="display:none" id="1">基础信息</div>
		<div class="navitem" style="display:none" id="2">班级信息</div>
		<div class="navitem" style="display:none" id="3"><a href="student/Student_query.action" target="contents">学生信息</a></div>
		<div class="navitem" style="display:none" id="4">个人信息</div>
	</div>
	<div id="right">
		<div id="search">
			<div id="addlink"><a href="Student_add.jsp" target="contents">添加</a></div>
			<div>
				<form action="<%=path%>/student/Student_querybyid.action" method="post" target="contents">
					<table>
						<tr>
							<td><input type="text" name="Sno" placeholder="张三"></td>
							<td><input type="submit" value="查询"></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<div id="info">
			<iframe name="contents" src="">				
			</iframe>
		</div>
	</div>
</div>
<div id="foot">
	<span>作者：林敬凯</span>
</div>
</body>
</html>