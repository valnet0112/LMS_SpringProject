<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<table class="table table-bordered">
	<thead>
		<tr>
			<th>학번</th>
			<th>이름</th>
			<th>주소</th>
			<th>전화번호</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${studentList}" var="list">
			<tr>
				<td><a class="stdNo" href="javascript:;" data-std-name="${list.STD_NAME}">${list.STD_NO}</a></td>
				<td>${list.STD_NAME}</td>
				<td>${list.STD_ADDRESS}</td>
				<td>${list.STD_TELNO}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<form id="stdForm" action='<c:url value="/student/mypage.do"/>' method="post">
	<input type="hidden"  name="stdNo" value="" >
	<input type="hidden"  name="stdName" value="" >
</form>
<form id="pageForm"  method="get" action="${pageContext.request.contextPath}/intro/studentList.do">
	<input type='hidden' name='page' />
</form>
${pagingHTML}
<script src='<c:url value="/resources/js/app/common/paging.js"/>'></script>
<script type="text/javascript">
	$("a.stdNo").on("click", function(){
	    let aTag = $(this).text();
	    let td = $(this).data("stdName");
	    $("input[name=stdNo]").val(aTag); 
	    $("input[name=stdName]").val(td); 
	    $("#stdForm").submit();
	 });
</script>