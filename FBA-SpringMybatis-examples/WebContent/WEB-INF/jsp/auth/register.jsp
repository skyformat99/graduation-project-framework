<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<script
	src="${pageContext.request.contextPath}/resources/js/contact_me.js"></script>

<section id="contact">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center top_50_margin">
				<h2>注册</h2>
				<hr class="star-primary">
			</div>
		</div>
		<div class="row">
			<div class="col-lg-8 col-lg-offset-2">
				<form action="${pageContext.request.contextPath}/auth/register" id="user_registerForm" novalidate method="post">
					<div class="row control-group">
						<div
							class="form-group col-xs-12 floating-label-form-group controls">
							<label>用户名</label> <input type="text" class="form-control"
								placeholder="用户名" id="username" name="username" required
								data-validation-required-message="用户名已经存在.">
							<p class="help-block text-danger"></p>
						</div>
					</div>
					<div class="row control-group">
						<div
							class="form-group col-xs-12 floating-label-form-group controls">
							<label>密码</label> <input type="password"
								class="form-control" placeholder="密码" id="password" name="password"
								required
								data-validation-required-message="请输入正确的密码.">
							<p class="help-block text-danger"></p>
						</div>
					</div>
					<div class="row control-group">
						<div
							class="form-group col-xs-12 floating-label-form-group controls">
							<label>再次输入密码</label> <input type="password"
								class="form-control" placeholder="再次输入密码" id="passwordAgain" name="passwordAgain"
								required
								data-validation-required-message="请再次输入正确的密码.">
							<p class="help-block text-danger"></p>
						</div>
					</div>
					<div class="row">
						<div class="form-group col-xs-12">
							<button type="submit" class="btn btn-success btn-lg">注册</button>
							<a href="${pageContext.request.contextPath}" class="btn btn-default btn-lg" >放弃</a>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</section>