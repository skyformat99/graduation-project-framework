<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- Portfolio Grid Section -->
<section id="portfolio">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2>${xinwen.title }</h2>
				<hr>
				<h5>${xinwen.operateDate }</h5>
			</div>
		</div>
		<div class="row">
			<div class="row">
				<textarea class="form-control" rows="20" name="content" readonly="readonly" >${xinwen.content}</textarea>
			</div>
		</div>
	</div>
</section>
