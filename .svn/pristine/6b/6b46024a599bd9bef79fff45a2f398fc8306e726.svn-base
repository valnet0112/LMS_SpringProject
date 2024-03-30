<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<c:choose>
	<c:when test="${not empty message }">
		<pre>
		message = ${message }
		member = ${member }
		errors = ${errors }
			<c:remove var="message" scope="session"/>
		</pre>
	</c:when>
	<c:otherwise>
		메시지 없음.
	</c:otherwise>
</c:choose>	
<form method="post" action='<c:url value="/staff/studentCreate.do" />'>
	<table class="table table-bordered">
		<tr>
			<th>학번</th>
			<td>
				<input type="text" name="stdNo" value="${studentMap.stdName }" required/>
				<span class="text-danger">${errors.stdNo}</span>
			</td>
		</tr>
		<tr>
			<th>이름</th>
			<td>
				<input type="text" name="stdName" value="${studentMap.stdName }" required/>
				<span class="text-danger">${errors.stdName}</span>
			</td>
		</tr>
		<tr>
			<th>주민번호</th>
			<td>
				<input type="text" name="stdId" value="${studentMap.stdName }" required/>
				<span class="text-danger">${errors.stdId}</span>
			</td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td>
				<input type="text" name="stdTelno" value="${studentMap.stdTelno }" required/>
				<span class="text-danger">${errors.stdTelno}</span>
			</td>
		</tr>
		<tr>
			<th>주소</th>
			<td>
				<input type="text" name="stdAddress" value="${studentMap.stdAddress }" required/>
				<span class="text-danger">${errors.stdAddress}</span>
			</td>
		</tr>
		<tr>
			<th>담당교수</th>
			<td>
				<input type="text" name="proNo" value="${studentMap.proNo }" required/>
				<span class="text-danger">담당교수는 교수코드로 입력${errors.proNo}</span>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<button type="submit" class="btn btn-primary">추가</button>
				<button id="back" class="btn btn-danger">뒤로가기</button>
			</td>
		</tr>
	</table>
</form>


<script>
	$(document).ready(function() {
		$(back).on("click", function(){
			history.go(-1);
		});
	});
</script>