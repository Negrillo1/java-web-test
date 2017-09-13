<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加学生信息</title>
</head>
<body>
<form name="addForm" action="<%=path%>/student/Student_add.action" method="post">
<table width="400">
	<tr>
		<td>姓名：</td>
		<td><input type="text" name="Sno"/></td>
	</tr>
	<tr>
		<td>性别：</td>
		<td><input type="text" name="Ssex"/></td>
	</tr>
	<tr>
		<td>学院：</td>
		<td><input type="text" name="Sdep"/></td>
	</tr>
	<tr>
		<td>籍贯：</td>
		<td><input type="text" name="Snav"/></td>
	</tr>
	<tr>
		<td>邮箱：</td>
		<td><input type="text" name="Semail"/></td>
	</tr>
	<tr>
		<td>联系方式</td>
		<td><input type="text" name="Sphone"/></td>
	</tr>
	<tr>
		<td clospan=2" align="center"><input type="submit" value="添加"></td>
	</tr>
</table>
</form>
</body>
</html>