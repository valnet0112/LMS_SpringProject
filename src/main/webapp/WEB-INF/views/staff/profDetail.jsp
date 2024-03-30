<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	

<table class="table table-bordered">
	<tr>
		<th>교수코드</th>
		<td>${profInfo.proNo }</td>
	</tr>
	<tr>
		<th>교수명</th>
		<td>${profInfo.proName}</td>
	</tr>
	<tr>
		<th>전공</th>
		<td>${profInfo.proMajor}</td>
	</tr>
	<tr>
		<th>교수번호</th>
		<td>${profInfo.proTelno}</td>
	</tr>
	<tr>
		<th>퇴사여부</th>
		<td>${profInfo.resigned}</td>
	</tr>
	<tr>
		<td colspan="2">
			<a class="btn btn-primary" href='<c:url value="/staff/profMod.do?proNo=${profInfo.proNo }"/>'>정보 수정</a>
			<a class="btn btn-dark" href='<c:url value="/staff/profList.do"/>'>목록으로</a>
		</td>
	</tr>
</table>
<form name="deleteForm" method="post" action="${pageContext.request.contextPath }/member/memberDelete.do">
	<input type="hidden" name="password" />
</form>
