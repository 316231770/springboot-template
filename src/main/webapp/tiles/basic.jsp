<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--移动端：流式布局的视口适配-->
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=0">
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
<title><tiles:getAsString name="title" /></title>
</head>
<body style="padding-top: 70px;">
	<!-- jQuery-->
	<script src="${pageContext.request.contextPath}/jquery/jquery.min.js"></script>
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
	<!-- Header -->
	<tiles:insertAttribute name="header" />
	<!-- Body -->
	<tiles:insertAttribute name="body" />
	<!-- Footer -->
	<tiles:insertAttribute name="footer" />
</body>
</html>