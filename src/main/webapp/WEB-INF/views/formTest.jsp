<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "include/header.jsp" %>




<form class="container" action="formActions" method="post">
	<div class="mb-3">
		<label class="form-label">제목</label>
		<input class="form-control" type="text" name="title">
	</div>
	<div class="mb-3">
		<label class="form-label">내용</label>
		<textarea class="form-control" rows="3" name="content"></textarea>
	</div>
	<button type="submit" class="btn btn-primary">제출</button>
</form>




<%@ include file = "include/footer.jsp" %>