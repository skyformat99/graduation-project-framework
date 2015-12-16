<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- Portfolio Grid Section -->
<section id="portfolio">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2>投票管理</h2>
				<a href="${pageContext.request.contextPath}/manage/toupiao/add">添加候选人</a>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-12 portfolio-item">
				<table class="table table-hover">
			  		<thead>
			  			<tr>
				  			<th>序号</th>
				  			<th>候选人</th>
				  			<th>得票数</th>
				  			<th>操作</th>	
			  			</tr>
			  		</thead>
			  		<tbody>
			  			<c:forEach items="${toupiaos }" var="item" varStatus="status">
				  			<tr>
						  		<td>${status.index }</td>
						  		<td>${item.username }</td>
						  		<td>${item.count }</td>
						  		<td><a href="${pageContext.request.contextPath}/manage/toupiao/del?id=${item.id}">删除</a></td>
					  		</tr>
			  			</c:forEach>
			  		</tbody>
				</table>
			</div>
		</div>
	</div>
</section>
