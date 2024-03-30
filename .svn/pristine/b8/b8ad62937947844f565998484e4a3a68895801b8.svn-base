<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-bordered">
	<tr>
		<th>학번</th>
		<td>${studentMap.stdNo }</td>
	</tr>
	<tr>
		<th>이름</th>
		<td>${studentMap.stdName }</td>
	</tr>
	<tr>
		<th>주민번호</th>
		<td>${studentMap.stdId }</td>
	</tr>
	<tr>
		<th>전화번호</th>
		<td>${studentMap.stdTelno }</td>
	</tr>
	<tr>
		<th>주소</th>
		<td>${studentMap.stdAddress }</td>
	</tr>
	<tr>
		<th>담당교수</th>
		<td>${studentMap.proName }</td>
	</tr>
	<tr>
		<th>제적여부</th>
		<td>${studentMap.deleted }</td>
	</tr>

	<tr>
		<td colspan = "2">
			<button class="btn btn-danger" id="delBtn">삭제</button>
			<a class="btn btn-primary" href='<c:url value="/staff/studentModify.do?stdNo=${studentMap.stdNo }"/>' >정보수정</button>
			<!-- c:url : client side 절대경로 생성 -->
		</td>
	</tr>
</table>

<form name="deleteForm" method="post" action='<c:url value="/staff/studentDelete.do" />'>
	<input type="hidden" name="stdNo" >
</form>

<script>
	$(document).ready(function() {
		$(delBtn).on("click", function(){
			let flag= confirm("해당 학생을 제적 처리 하시겠습니까?")
			if(flag){
				document.deleteForm.stdNo.value = "${studentMap.stdNo}";
				document.deleteForm.submit();
			}
		});
	});
</script>