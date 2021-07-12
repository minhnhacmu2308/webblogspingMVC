<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<div id="body">
			<div class="header">
				<div>
					<h1>Blogs</h1>
				</div>
			</div>
			<div class="blog">
				<div class="featured">
					<ul>
					<c:forEach var="item" items="${ listBlogs}" varStatus="index">
						<li>
								<img src="<c:url value="/images/${item.image }"/>" alt="">
								<div style="margin-top: 10px">
									<h1>${item.title }</h1>
									<span>By ${item.author } ${item.createTime }</span>
									<p>${item.detail}</p>
									<a href="detailblog?id=${item.id}" class="more">Read More</a>
								</div>
							</li>
					</c:forEach>
						
					
					</ul>
					<a href="blog.html" class="load">Load More</a>
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