<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h4 data-pr-prono="${professorMap.PRO_NO}">${professorMap.PRO_NAME }교수님</h4>
<ul>
	<li>
	     <a href='javascript:;' data-pr-url='<c:url value="/professor/searchLecture.do"/>'>강의조회</a>
	</li>
</ul>

<form name="professorForm" method="post" action="">
	<input type="hidden" name="pro_no" />
</form>
<script>
	$('a').click(function(){
		let pro_no = $('h4').data("prProno");
		let url = $(this).data("prUrl");
		$('input[name=pro_no]').val(pro_no);
		$('form[name=professorForm]').attr('action',url);
		$('form[name=professorForm]').submit();
	})
</script>