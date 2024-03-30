<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table class="table table-bordered">
	<tr>
	<a class="btn btn-primary" href='<c:url value="/staff/studentCreate.do"/>' >학생정보입력</button>
	</tr>
	<thead>
		<tr>
			<th>구분</th>
			<th>학번</th>
			<th>이름</th>
			<th>주민번호</th>
			<th>전화번호</th>
			<th>주소</th>
			<th>담당교수</th>
			<th>제적여부</th>
		</tr>
	</thead>
	<tbody>
		<c:choose>
			<c:when test="${not empty studentList }">
				<c:forEach items="${studentList}" var="stud">
					<tr>
						<td>${stud.rnum}</td>
						<td><a href='<c:url value="/staff/studentDetail.do" />?stdNo=${stud.stdNo }'>${stud.stdNo}</a></td>
						<td>${stud.stdName}</td>
						<td>${stud.stdId}</td>
						<td>${stud.stdTelno}</td>
						<td>${stud.stdAddress}</td>
						<td>${stud.proName}</td>
						<td>${stud.deleted}</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="6">
						조건에 맞는 학생이 없음.
					</td>
				</tr>
			</c:otherwise>		
		</c:choose>
	</tbody>
	<tfoot>
		<tr>
			<td colspan="6">
				<form id="searchForm" action="<c:url value='/staff/studentList.do' />">
					<input type="hidden" name="page"/>
					<input type="hidden" name="stdNo" 		value="${condition.stdNo }" />
					<input type="hidden" name="stdName" 	value="${condition.stdName }" />
					<input type="hidden" name="stdId" 		value="${condition.stdId }" />
					<input type="hidden" name="stdAddress" 	value="${condition.stdAddress }" />
					<input type="hidden" name="stdTelno"	value="${condition.stdTelno }" />
					<input type="hidden" name="proName"	value="${condition.proName }" />
				</form>
				<div data-pg-role="searchUI" data-pg-target="#searchForm" >
					학번 <input type="text" name="stdNo" value="${condition.stdNo }" />
					이름 <input type="text" name="stdName" value="${condition.stdName }" />
					주민번호 <input type="text" name="stdId" value="${condition.stdId }" />
					전화번호 <input type="text" name="stdTelno" value="${condition.stdTelno }" />
					주소 <input type="text" name="stdAddress" value="${condition.stdAddress }" />
					담당교수 <input type="text" name="proName" value="${condition.proName }" />
					<button type="button" data-pg-role="searchBtn">검색</button>
				</div>
				${pagingHTML }
			</td>
		</tr>
	</tfoot>
</table>
<script src="<c:url value='/resources/js/app/common/paging.js' />"></script>