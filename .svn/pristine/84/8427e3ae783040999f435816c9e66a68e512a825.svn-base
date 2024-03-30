<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
 
<table class="table table-bordered">
	<thead>
		<tr>
			<th>번호</th>
			<th>과목명</th>
			<th>과목코드</th>
			<th>강의시간</th>
			<th>강의실</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${lectureList}" var="list">
			<tr>
				<td><a href="javascript:;" data-pr-pro-no="${thisPro}">${list.RNUM}</a></td>			
				<td>${list.SUB_NAME}</td>			
				<td>${list.SUB_CD}</td>			
				<td>${list.LEC_TIME}</td>			
				<td>${list.LEC_ROOM}</td>			
			</tr>
		</c:forEach>
	</tbody>
</table>
<form name="loginForm" method="post" action="${pageContext.request.contextPath}/professor/findStudent.do">
	<input type="hidden" name="pro_no" />
</form>
<script>
	$('a').click(function(){
		let pro_no = $(this).data("prProNo");
		$('input[name=pro_no]').val(pro_no);
		$('form[name=loginForm]').submit();
	})
</script>