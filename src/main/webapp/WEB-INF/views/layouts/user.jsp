<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!doctype html>
<!-- Website template by freewebsitetemplates.com -->
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Frozen Yogurt Shop</title>
	<link rel="stylesheet" href="<c:url value="/assets/user/css/style.css"/>" type="text/css">
	<link rel="stylesheet" type="text/css" href="<c:url value="/assets/user/css/mobile.css"/>">
	<script src="<c:url value="/assets/user/mobile.js"/>" type="text/javascript"></script>
</head>
<body>
	<div id="page">
	 <%@include file="/WEB-INF/views/layouts/user/header.jsp"  %>
	  <decorator:body />
	<%@include file="/WEB-INF/views/layouts/user/footer.jsp"  %>
	</div>
</body>
</html>
