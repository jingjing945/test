<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
		<c:forEach items="${student}" var="student">
			<tr>
				<td>${student.name }</td>
				<td>${student.sex }</td>
				<td>${student.score }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>