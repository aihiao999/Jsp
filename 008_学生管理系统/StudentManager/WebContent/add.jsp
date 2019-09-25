<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加学生信息</title>
</head>
<body>
	<form action="AddServlet.action" method="post">
		<table border="1px" width="400px">
		<tr>
			<td>姓名:<input type="text" name="sname"></td>
		</tr>
		<tr>
			<td>性别:<input type="radio" name="gender" value="男">男<input type="radio" name="gender" value="女">女</td>
		</tr>
		<tr>
			<td>电话:<input type="text" name="phone"></td>
		</tr>
		<tr>
			<td>爱好:
				<input type="checkbox" name="hobby" value="旅游">旅游
				<input type="checkbox" name="hobby" value="美食">美食
				<input type="checkbox" name="hobby" value="游泳">游泳
				<input type="checkbox" name="hobby" value="唱歌">唱歌
			</td>
		</tr>
		<tr>
			<td>详情:<textarea rows="3" cols="20" name="info"></textarea></td>
		</tr>
		<tr>
			<td>出生年月日:<input type="text" name="birthday"></td>
		</tr>
		<tr><td><input type="submit"></td></tr>
		</table>
	</form>
</body>
</html>