<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<ul>
	<li>
	     <a href='<c:url value="/index.do"/>'>INDEX</a>
	</li>
	<li>
	     <a href='<c:url value="/intro/professorList.do"/>'>교수</a>
	</li>
	<li>
	   <a href='<c:url value="/intro/studentList.do"/>'>학생</a>
	</li>
	<li>
	   <a href="javascript:;" data-go-link="/staff/index.do">교직원</a>
	</li>
	<li>
		<a href="javascript:;" data-go-link="/staff/profList.do">교수 조회</a>
	</li>
	<li>
		<a href="javascript:;" data-go-link="/staff/studentList.do">학생 조회</a>
	</li>
</ul>