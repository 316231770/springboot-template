<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
<title>userList</title>
</head>
<body>
	<!-- jQuery-->
	<script src="${pageContext.request.contextPath}/jquery/jquery.min.js"></script>
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
		src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
	<div class="container">
		<div class="row" style="margin-bottom: 15px">
		<div class="col-md-4 col-md-offset-5">
		<h3>
		用户表单
		<span class="glyphicon glyphicon-user" aria-hidden="true">
		</span>
		
		</h3>
		</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th>id</th>
							<th>username</th>
							<th>password</th>
							<th>age</th>
							<th>birth</th>
							<th>email</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${users}" var="user">
							<tr>
								<td>${user.id}</td>
								<td>${user.username}</td>
								<td>${user.password}</td>
								<td>${user.age}</td>
								<td><fmt:formatDate value="${user.birth}"
										pattern="yyyy年MM月dd日" /></td>
								<td>${user.email}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>