<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
			<div style="text-align: center;">
			<nav>
			  <ul class="pagination">
			  <% 
			  	int index = Integer.valueOf(request.getAttribute("index").toString());
			  	int count = Integer.valueOf(request.getAttribute("count").toString());
			  	for(int i=1;i<=count;i++){
			  		if(i==index){
			  
			  			%>
					    <li class="active"><a href="${pageContext.request.contextPath}/xinwen/list?index=<%=i %>"><%=i %></a></li>
			  			<%
			  		}else{
			  			%>
					    <li><a href="${pageContext.request.contextPath}/xinwen/list?index=<%=i %>"><%=i %></a></li>
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
