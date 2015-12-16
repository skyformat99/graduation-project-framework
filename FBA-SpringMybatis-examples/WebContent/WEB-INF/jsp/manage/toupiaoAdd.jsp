<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- Portfolio Grid Section -->
<section id="portfolio">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2>添加候选人</h2>
				<hr>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-12 portfolio-item">
				<form action="${pageContext.request.contextPath}/manage/toupiao/add" method="post">
				<h5>候选人姓名</h5>
				<textarea class="form-control" rows="1" name="username"></textarea>
				<br />
				<div class="col-sm-12" style="text-align: center;" >
					<input type="submit" class="btn btn-default" value="保存" />
				</div>
				</form>
			</div>
		</div>
	</div>
</section>
