<%@page import="kr.or.ddit.vo.ProfVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- <pre>
message = ${message }
member = ${member }
contentPage = <%=request.getAttribute("contentPage")%>, ${contentPage }
errors = ${errors }
</pre> --%>
<form method="post" action="<c:url value='/staff/profInsert.do'/>">
	<table>
		<tr>
			<th>교수코드</th>
			<td>
				<input type="text" name="proNo" required value="${prof.proNo}" class="form-control" />
				<span class="text-danger">${errors.proNo}</span>
			</td>
		</tr>
		<tr>
			<th>교수명</th>
			<td>
				<input type="text" name="proName" required value="${prof.proName}" class="form-control" />
				<span class="text-danger">${errors.proName}</span>
			</td>
		</tr>
		<tr>
			<th>전공</th>
			<td>
				<input type="text" name="proMajor" required value="${prof.proMajor}" class="form-control" />
				<span class="text-danger">${errors.proMajor}</span>
			</td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td>
				<input type="text" name="proTelno" required value="${prof.proTelno}" class="form-control" />
				<span class="text-danger">${errors.proTelno}</span>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<button type="submit" class="btn btn-primary">추가</button>
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