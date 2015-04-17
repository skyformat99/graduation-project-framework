<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- Portfolio Grid Section -->
<section id="portfolio">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2>帖子</h2><a href="${pageContext.request.contextPath}/tiezi/add">添加新帖子</a>
				<br />
				<br />
			</div>
		</div>
		<div class="row">
			<div class="col-sm-12 portfolio-item">
				<ul class="col-md-offset-2 col-md-8 nav nav-pills nav-stacked ">
					<c:if test="${tiezis!=null}">
						<c:forEach var="item" items="${tiezis }">
							<li style="text-align: center; background-color:#2c3e50; "><a href="${pageContext.request.contextPath}/tiezi/show?id=${item.id }">${item.title} - ${item.operateDate}</a></li>						
						</c:forEach>
					</c:if>
				</ul>
			</div>
			<div style="text-align: center;">
			<nav>
			  <ul class="pagination">
			  <% 
			  	int index = Integer.valueOf(request.getAttribute("index").toString());
			  	int count = Integer.valueOf(request.getAttribute("count").toString());
			  	for(int i=1;i<=count;i++){
			  		if(i==index){
			  			%>
					    <li class="active"><a href="${pageContext.request.contextPath}/tiezi/list?index=<%=i %>"><%=i %></a></li>
			  			<%
			  		}else{
			  			%>
					    <li><a href="${pageContext.request.contextPath}/tiezi/list?index=<%=i %>"><%=i %></a></li>
			  			<%
			  		}
			  	}
			  %>
			  </ul>
			</nav>
			</div>
		</div>
	</div>
</section>
