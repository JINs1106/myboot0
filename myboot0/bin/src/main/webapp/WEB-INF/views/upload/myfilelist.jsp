<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${list}" var="uploadVO">
	<h3></h3><a href="http://localhost:9009/upload/${uploadVO.filename1}" > ${uploadVO.filename1} </a> <a href="http://localhost:9009/upload/${uploadVO.filename2}">	${uploadVO.filename2}</a>
	
</c:forEach>

</body>
</html>