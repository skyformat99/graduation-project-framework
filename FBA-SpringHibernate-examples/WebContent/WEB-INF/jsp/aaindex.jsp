<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- Header -->
<header>
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="intro-text">
					<span class="name">通知</span>
					<hr class="star-light">
					<span class="skills">${ message.notify}</span>
				</div>
			</div>
		</div>
	</div>
</header>

<!-- Portfolio Grid Section -->
<section id="portfolio">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2>新闻</h2>
				<hr class="star-primary">
			</div>
		</div>
		<div class="row">
			<div class="col-sm-12 portfolio-item">
				<ul class="col-md-offset-2 col-md-8 nav nav-pills nav-stacked ">
					<c:if test="${xinwens!=null}">
						<c:forEach var="item" items="${xinwens }">
							<li style="text-align: center; background-color: #2c3e50; "><a href="${pageContext.request.contextPath}/xinwen/show?id=${item.id }">${item.title} - ${item.operateDate}</a></li>						
						</c:forEach>
					</c:if>
				</ul>
			</div>
			<div class="col-md-offset-5 col-md-2" style="text-align: center;">
			<a href="${pageContext.request.contextPath}/xinwen/list">查看更多</a>
			</div>
		</div>
	</div>
</section>
