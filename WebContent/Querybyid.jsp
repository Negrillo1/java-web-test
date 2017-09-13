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
<title>Insert title here</title>
</head>
<body>
<form name="modifyForm">
	<table width="400">
	<tr>
		<td>姓名：</td>
		<td><input type="text" name="sno" value='<s:property value="#session.query_student.Sno"/>' readonly="readonly"/></td>
	</tr>
	<tr>
		<td>学号：</td>
		<td><input type="text" name="sname" value='<s:property value="#session.query_student.Sname"/>' readonly="readonly"/></td>
	</tr>
	<tr>
		<td>性别：</td>
		<td><input type="text" name="ssex" value='<s:property value="#session.query_student.Ssex"/>' readonly="readonly"/></td>
	</tr>
	<tr>
		<td>学院：</td>
		<td><input type="text" name="sdep" value='<s:property value="#session.query_student.Sdep"/>' readonly="readonly"/></td>
	</tr>
	<tr>
		<td>籍贯：</td>
		<td><input type="text" name="snav" value='<s:property value="#session.query_student.Snav"/>' readonly="readonly"/></td>
	</tr>
	<tr>
		<td>邮箱：</td>
		<td><input type="text" name="semail" value='<s:property value="#session.query_student.Semail"/>' readonly="readonly"/></td>
	</tr>
	<tr>
		<td>联系方式</td>
		<td><input type="text" name="sphone" value='<s:property value="#session.query_student.Sphone"/>' readonly="readonly"/></td>
	</tr>
</table>
</form>
</body>
</html>