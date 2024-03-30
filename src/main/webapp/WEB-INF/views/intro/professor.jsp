<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table class="table table-bordered">
	<thead>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>전공</th>
			<th>전화번호</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${professorList}" var="list">
			<tr>
				<td><a class="rnum" href="javascript:;" data-pr-pro-no="${list.PRO_NO}">${list.RNUM}</a></td>
				<td>${list.PRO_NAME}</td>
				<td>${list.PRO_MAJOR}</td>
				<td>${list.PRO_TELNO}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<form name="loginForm" method="post" action="${pageContext.request.contextPath}/professor/login.do">
	<input type="hidden" name="pro_no" />
</form>
<form id="pageForm" method="get" action="${pageContext.request.contextPath}/intro/professorList.do">
	<input type='hidden' name='page' />
</form>
${pagingHTML}
<script src='<c:url value="/resources/js/app/common/paging.js"/>'></script>
<script>
	$('a.rnum').click(function(){
		let pro_no = $(this).data("prProNo");
		$('input[name=pro_no]').val(pro_no);
		$('form[name=loginForm]').submit();
	})
</script>
