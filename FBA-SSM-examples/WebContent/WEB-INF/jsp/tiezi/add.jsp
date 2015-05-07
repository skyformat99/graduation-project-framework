<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- Portfolio Grid Section -->
<section id="portfolio">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2>添加新帖子</h2>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-12 portfolio-item">
				<form action="${pageContext.request.contextPath}/tiezi/add" method="post">
				<br />
				<br />
				<h4>标题</h4>
				<textarea class="form-control" rows="1" name="title"></textarea>
				<h4>内容</h4>
				<textarea class="form-control" rows="25" name="content"></textarea>
				<br />
				<br />
				<div class="col-sm-12" style="text-align: center;" >
					<input type="submit" class="btn btn-default" value="保存" />
				</div>
				</form>
			</div>
		</div>
	</div>
</section>
