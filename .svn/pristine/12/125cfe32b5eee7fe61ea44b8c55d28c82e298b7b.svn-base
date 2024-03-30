
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   


<script type="text/javascript">
	<c:if test="${not empty cnt }">
		alert(`${stdNo}님 ${subCd} 수강신청 완료!`)
	</c:if>
</script>

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
			<th>No</th>
			<th>신청</th>
			<th>과목코드</th>
			<th>과목구분</th>
			<th>과목명</th>
			<th>강의요일</th>
			<th>강의시간</th>
			<th>강의실</th>
			<th>교수명</th>
			<th>학점</th>
		</tr>
	</thead>
	<tbody>
		<c:if test="${not empty classList }">
			<c:forEach items="${classList }" var="lec">
				<tr>
					<td>${lec.rowNum}</td>
					<td>
						<input name="regiBtn" type="button" data-sub-cd="${lec.subCd}" value="신청">
					</td>
					<td>${lec.subCd}</td>
					<td>${lec.subGubun}</td>
					<td>${lec.subName}</td>
					<td>${lec.lecDay}</td>
					<td>${lec.lecTime}</td>
					<td>${lec.lecRoom}</td>
					<td>${lec.proName}</td>
					<td>${lec.subCredit}</td>
				</tr>
			</c:forEach>
		</c:if>
		
		<c:if test="${empty classList }">
			<tr>
				<td colspan="10">신청 가능한 과목이 없음.</td>
			</tr>
		</c:if>
	</tbody>
	<tfoot>
		<tr>
			<td colspan="10">
				<form id="submitForm" action=""> <!-- 전송용 form => 입력UI와 항상 세트 -->
					<input type="hidden" name="page">
					<input type="hidden" name="searchType" value="${condition.searchType }" />
					<input type="hidden" name="searchWord" value="${condition.searchWord }"/>
				</form>

				<div data-pg-role="searchUI" data-pg-target="#submitForm"> <!-- 입력UI -->
<%-- 				<select name="prodLgu" data-pg-init-value="${condition.prodLgu }"> --%>
<!-- 					<option value>구분선택</option> -->
<!-- 					<option value="P101">전자제품</option> -->
<!-- 				</select> -->
					<select name="searchType" data-pg-init-value="${condition.searchType }">
						<option value>전체</option>
<!-- 						<option value="proName">교수명</option> -->
						<option value="subName">과목명</option>
						<option value="lecRoom">강의실</option>
					</select>
					<input type="text" name="searchWord" value="${condition.searchWord }">
					<button type="button" data-pg-role="searchBtn">검색</button>
			</div>
				${pagingHTML }
			</td>
		</tr>
	</tfoot>
</table>



<form method="post" id="regiForm" action='<c:url value="/student/insertClass.do"/>'>
	<input type="hidden" name="stdNo" value="${stdNo }">
	<input type="hidden" name="formSubCd">
</form>

<script>
	$("[name='regiBtn']").on("click", function(){
		let subCdVal = $(this).data("sub-cd")
		$("[name='formSubCd']").val(subCdVal);
		$("#regiForm").submit();
		console.log(subCdVal);
	});
</script>
<script src="<c:url value='/resources/js/app/common/paging.js'/>"></script>