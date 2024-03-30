<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<table class="table table-bordered">
	<thead>
		<tr>
			<th>학점관리</th>
			<th>학번</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>주소</th>
			<th>학점</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${studentList}" var="list">
			<tr>
				<td><a class="score" href="javascript:;" data-pr-subno="${list.SUB_CD}" data-pr-stdno="${list.STD_NO }">학점관리</a></td>			
				<td>${list.STD_NO}</td>			
				<td>${list.STD_NAME}</td>			
				<td>${list.STD_TELNO}</td>			
				<td>${list.STD_ADDRESS}</td>
				<td>${list.CLS_SCORE}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<form >
	
</form>

<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h1 class="modal-title fs-5" id="exampleModalLabel">점수</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <form name="loginForm" method="post" action="${pageContext.request.contextPath}/professor/score.do">
	      <div class="modal-body">
	        <input type="text" name="point" class="form-control" value="${list.CLS_SCORE}" placeholder="점수"/>
	        <input type="hidden" name="std_no" class="form-control"/>
			<input type="hidden" name="sub_cd" class="form-control"/>
			<input type="hidden" name="pro_no" class="form-control" value="${thisPro}"/>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
	        <button type="submit" class="btn btn-primary">UPDATE</button>
	      </div>
      </form>
    </div>
  </div>
</div>


<script>
	$('a.score').click(function(){
		var modal = new bootstrap.Modal(document.getElementById('exampleModal'));
		let subNo = $(this).data("prSubno");
		$('input[name=sub_cd]').val(subNo);
		let stdNo = $(this).data("prStdno");
		$('input[name=std_no]').val(stdNo);
		modal.show();
		$('button[type="submit"]').on('click',function(event){
			event.preventDefault();
			$('form[name=loginForm]').submit();
			modal.hide();
		});
	})
</script>