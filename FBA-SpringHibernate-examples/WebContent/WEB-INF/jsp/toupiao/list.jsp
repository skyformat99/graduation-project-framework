<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- Portfolio Grid Section -->
<section id="portfolio">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2>投票</h2>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-12 portfolio-item">
				<ul class="col-md-12 nav nav-pills nav-stacked ">
					<c:forEach var="item" items="${toupiaos }">
					 <li>
					 	<div class="progress-bar progress-bar-info progress-bar-striped" style="width: ${item.count }%;">
					    ${item.count }
					  	</div>
					  	${item.username} - <a href="${pageContext.request.contextPath}/toupiao/update?id=${item.id }">投票</a>
					 </li>
					</c:forEach>
				</ul>
			</div>
		</div>
	</div>
</section>
