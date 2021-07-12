<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="header">
			<div>
				<a href="<%=request.getContextPath()%>/" class="logo"><img style="height: 70px;width: 100px" src="<c:url value="/images/1624804979450images (1).jpg"/>"  alt=""></a>
				<ul id="navigation">
					<li class="selected">
						<a href="<%=request.getContextPath()%>/">HOME</a>
					</li>
					<li class="menu">
						<a href="about.html">About</a>
						<ul class="primary">
							<li>
								<a href="product.html">Product</a>
							</li>
						</ul>
					</li>
					<li class="menu">
						<a href="blogs">Blog</a>
						<ul class="secondary">
							<li>
								<a href="singlepost.html">Single post</a>
							</li>
							
						</ul>
					</li>
					<li>
						<a href="contact.html">Contact</a>
					</li>
				</ul>
			</div>
		</div>
</body>
</html>