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

<h2> 파일 검색 </h2>

<form action="/myfilelist"  method=post>
전송자<input type="text" name = "name">
<input type="submit" value="조회">
</form>
</body>
</html>