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
<title>query_success</title>
<style type="text/css">
	a{
		text-decoration: none;
		color: #0000EE;
	}
</style>
</head>
<body>
<table align="center" width="1000" border="1">
				<tr>
					<td align="center" colspan="9">
						<h2>学生信息</h2>
					</td>
				</tr>
				<tr>
					<td align="center"><b>姓名</b></td>
					<td align="center"><b>学号</b></td>
					<td align="center"><b>性别</b></td>
					<td align="center"><b>学院</b></td>
					<td align="center"><b>籍贯</b></td>
					<td align="center"><b>邮箱</b></td>
					<td align="center"><b>联系方式</b></td>
					<td  align="center" colspan="2"><b>操作</b></td>
				</tr>
				<s:iterator value="#session.student_list" var="stu">
				<tr>  
					<td align="center"><b><s:property value="#stu.Sno"/></b></td>
					<td align="center"><b><s:property value="#stu.Sname"/></b></td>
					<td align="center"><b><s:property value="#stu.Ssex"/></b></td>
					<td align="center"><b><s:property value="#stu.Sdep"/></b></td>
					<td align="center"><b><s:property value="#stu.Snav"/></b></td>
					<td align="center"><b><s:property value="#stu.Semail"/></b></td>
					<td align="center"><b><s:property value="#stu.Sphone"/></b></td>
					<td align="center"><b><a href="<%=path%>/student/Student_delete.action?Sno=<s:property value="#stu.Sno"/>" onclick="javascript:return confirm('真的要删除吗？');">删除</a></b></td>
					<td align="center"><b><a href="<%=path%>/student/Student_modify.action?Sno=<s:property value="#stu.Sno"/>">修改</a></b></td>
				</tr>
				</s:iterator>
				</table>
</body>
</html>