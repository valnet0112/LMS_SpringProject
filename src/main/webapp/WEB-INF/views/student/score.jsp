
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   


<!-- <script type="text/javascript"> -->
<%--	<c:if test="${not empty cnt }"> --%>
<%-- 	alert(`${stdNo}님 ${subCd} 수강신청 완료!`) --%>
<%--  	</c:if> --%>
<!-- </script> -->

<%-- <c:if test="${not empty cnt }"> --%>
<!-- 	<script type="text/javascript"> -->
<%--  		if(confirm(`${stdNo}님 ${subCd} 수강신청 완료!`)){ --%>
			
<%--  			location.href = ${pageContext.request.contextPath}+"/student/class.do"; --%>
<!--  		} -->
<!-- 	</script> -->
<%-- </c:if> --%>


<table class="table table-bordered">
	<thead>
		<tr>
			<th>학번</th>
			<th>과목명</th>
			<th>점수</th>
			<th>등급</th>
			<th>학점</th>
		</tr>
	</thead>
	<tbody>
		<c:if test="${not empty scoreList }">
			<c:forEach items="${scoreList }" var="score">
				<tr>
					<td>${score.subCd}</td>
					<td>${score.subName}</td>
					<td>${score.clsScore}</td>
					<td>${score.grade}</td>
					<td>${score.subCredit}</td>
				</tr>
			</c:forEach>
		</c:if>
		
		<c:if test="${empty scoreList }">
			<tr>
				<td colspan="4">조회된 성적이 없음.</td>
			</tr>
		</c:if>
	</tbody>
	<tfoot>

	</tfoot>
</table>

<script src="<c:url value='/resources/js/app/common/paging.js'/>"></script>