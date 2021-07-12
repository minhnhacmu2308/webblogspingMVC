<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
	<div id="body">
			<div class="header">
				<div>
					<h1>Single Post</h1>
				</div>
			</div>
			<div class="singlepost">
				<div class="featured">
					<img src="<c:url value="/images/${detailBlog.image }"/>" alt="">
					<h1>${detailBlog.title }</h1>
					<span>By ${detailBlog.author } on ${detailBlog.createTime }</span>
					<p>${detailBlog.detail}</p>
					
					<a href="<%=request.getContextPath()%>/blogs" class="load">back to blog</a>
				</div>
				<div class="sidebar">
					<h1>Recent Posts</h1>
					<img src="<c:url value="/images/1624804979450images (1).jpg"/>" alt="">
					<h2>ON THE DIET</h2>
					<span>By Admin on November 28, 2023</span>
					<p>You can replace all this text with your own text. You can remove any link to our website from this website template.</p>
					<a href="singlepost.html" class="more">Read More</a>
				</div>
			</div>
		</div>