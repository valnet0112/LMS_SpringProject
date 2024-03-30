<%@page import="kr.or.ddit.vo.ProfVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form method="post">
	<table>
		<tr>
			<th>교수코드</th>
			<td><input type="text" name="proNo" value="${profInfo.proNo }" 
			required class="form-control" readonly="readonly"/><span
				class="text-danger">${errors.proNo}</span></td>
		</tr>
		<tr>
			<th>교수이름</th>
			<td><input type="text" name="proName" value="${profInfo.proName}"
				class="form-control" /><span class="text-danger">${errors.proName}</span></td>
		</tr>
		<tr>
			<th>전공</th>
			<td><input type="text" name="proMajor"
				value="${profInfo.proMajor}" class="form-control" /><span
				class="text-danger">${errors.proMajor}</span></td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td><input type="text" name="proTelno"
				value="${profInfo.proTelno}" class="form-control" /><span
				class="text-danger">${errors.proTelno}</span></td>
		</tr>
		<tr>
			<th>퇴사여부</th>
			<td><input type="text" name="resigned"
				value="${profInfo.resigned}" class="form-control" /><span
				class="text-danger">${errors.resigned}</span></td>
		</tr>
		<tr>
			<td colspan="2">
				<button type="submit" class="btn btn-primary">수정</button>
				<button type="button" class="btn btn-danger" onclick="goBack()">취소</button>
			</td>
		</tr>
	</table>
</form>
<script>
function goBack() {
  window.history.back();
}
</script>