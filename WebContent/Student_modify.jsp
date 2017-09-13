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
<title>修改信息</title>
</head>
<body>
<form name="modifyForm" action="<%=path%>/student/Student_save.action" method="post">
	<table width="400">
	<tr>
		<td>姓名：</td>
		<td><input type="text" name="sno" value='<s:property value="#session.modify_student.Sno"/>' readonly="readonly"/></td>
	</tr>
	<tr>
		<td>学号：</td>
		<td><input type="text" name="sname" value='<s:property value="#session.modify_student.Sname"/>'/></td>
	</tr>
	<tr>
		<td>性别：</td>
		<td><input type="text" name="ssex" value='<s:property value="#session.modify_student.Ssex"/>'/></td>
	</tr>
	<tr>
		<td>学院：</td>
		<td><input type="text" name="sdep" value='<s:property value="#session.modify_student.Sdep"/>'/></td>
	</tr>
	<tr>
		<td>籍贯：</td>
		<td><input type="text" name="snav" value='<s:property value="#session.modify_student.Snav"/>'/></td>
	</tr>
	<tr>
		<td>邮箱：</td>
		<td><input type="text" name="semail" value='<s:property value="#session.modify_student.Semail"/>'/></td>
	</tr>
	<tr>
		<td>联系方式</td>
		<td><input type="text" name="sphone" value='<s:property value="#session.modify_student.Sphone"/>'/></td>
	</tr>
	<tr>
		<td colspan="2" align="center"><input type="submit" value="修改"></td>
	</tr>
</table>
</form>
</body>
</html>