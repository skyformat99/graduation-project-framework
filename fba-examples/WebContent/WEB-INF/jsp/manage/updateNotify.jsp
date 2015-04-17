<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- Portfolio Grid Section -->
<section id="portfolio">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2>修改通知</h2>
				
			</div>
		</div>
		<div class="row">
			<div class="col-sm-12 portfolio-item">
				<form action="${pageContext.request.contextPath}/manage/notify/update" method="post">
				<h2>通知内容</h2>
				<textarea class="form-control" rows="1" name="notify"></textarea>
				<br />
				<div class="col-sm-12" style="text-align: center;" >
					<input type="submit" class="btn btn-default" value="保存" />
				</div>
				</form>
			</div>
		</div>
	</div>
</section>
