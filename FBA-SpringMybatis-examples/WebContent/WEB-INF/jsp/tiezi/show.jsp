<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- Portfolio Grid Section -->
<form action="${pageContext.request.contextPath}/tiezi/huifu/add" method="post">
<section id="portfolio">
	<input type="hidden" name="tieziId" value="${tiezi.id }">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2>${tiezi.title }</h2>
				<hr>
				<h5>${tiezi.operateDate } BY ${tiezi.user }</h5>
			</div>
		</div>
		<div class="row">
			<textarea class="form-control" rows="3" readonly="readonly" >${tiezi.content}</textarea>
		</div>
		<br />
		<c:forEach var="item" items="${tiezi.huifus }">
			<div class="panel panel-success">
			  <div class="panel-heading">
			    <h3 class="panel-title"><font style="color: pink;">${item.user }</font> on ${item.operateDate }</h3>
			  </div>
			  <div class="panel-body">
			    ${item.content}
			  </div>
			</div>
		</c:forEach>
		<hr>
		<h4>发表评论</h4>
		<textarea class="form-control" rows="3" name="content"></textarea>
		<br />
		<div class="col-sm-12">
			<input type="submit" class="btn btn-default" value="保存" />
		</div>
	</div>
</section>
</form>