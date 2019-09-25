<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>更新学生页面</title>
</head>
<body>
<form action="UpdateServlet.action" method="post">
	<input type="hidden" name="sid" value="${student.sid}">
	<table border="1" width="600px">
	<tr>
		<td>姓名</td>
		<td><input type="text" name="sname" value="${student.sname}"></td>
  	</tr>
  	<tr>
		<td>性别</td>
		<td>
			<input type="radio" name="gender" value="男" <c:if test="${student.gender == '男'}">checked</c:if>>男
			<input type="radio" name="gender" value="女" <c:if test="${student.gender == '女'}">checked</c:if>>女
		</td>
 	</tr>
  	<tr>
		<td>电话</td>
		<td><input type="text" name="phone" value="${student.phone}"></td>
  	</tr>
  	<tr>
		<td>生日</td>
		<td><input type="text" name="birthday" value="${student.birthday}"></td>
  	</tr>
  	<tr>
	<td>爱好</td>
	<td>
		<input type="checkbox" name="hobby" value="旅游" <c:if test="${fn:contains(student.hobby,'旅游') }">checked</c:if>>旅游
		<input type="checkbox" name="hobby" value="美食" <c:if test="${fn:contains(student.hobby,'美食') }">checked</c:if>>美食
		<input type="checkbox" name="hobby" value="游泳" <c:if test="${fn:contains(student.hobby,'游泳') }">checked</c:if>>游泳
		<input type="checkbox" name="hobby" value="唱歌" <c:if test="${fn:contains(student.hobby,'唱歌') }">checked</c:if>>唱歌
	</td>
  </tr>
  <tr>
	<td>简介</td>
	<td><textarea name="info" rows="3" cols="20">${student.info }</textarea></td>
  </tr>
  <tr>
	<td colspan="2"> <input type="submit" value="更新"> </td>
  </tr>
	</table>
</form>
</body>
</html>