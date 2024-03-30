<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div style="text-align: right;">
    <a class="btn btn-info" href="<url value='/staff/profInsert.do'/>">교수 등록</a>
</div>

<table class="table table-bordered text-center">
	<thead>
		<tr>
			<th>교수코드</th>
			<th>교수명</th>
			<th>전공</th>
			<th>교수번호</th>
			<th>퇴사여부</th>
		</tr>
	</thead>
	<tbody id=listBody>
	
	</tbody>
	<tfoot>
		<tr>
			<td colspan="6">
				<form id="submitForm"  method="get" class="border border-danger m-3 p-3">
					<input type="hidden" name="page" placeholder="page"/>
					<input type="hidden" name="searchType" placeholder="searchType"/>
					<input type="hidden" name="searchWord" placeholder="searchWord"/>
				</form>
				<div data-pg-role="searchUI" data-pg-target="#submitForm" 
						class="m-3 p-3 border border-primary row justify-content-center">
					<div class="col-auto">
						<select name="simpleCondition.searchType" class="form-select">
							<option value label="전체" />
							<option value="name" label="이름" />
						</select>
					</div>
					<div class="col-auto">
						<input type="text" name="searchWord"  class="form-control"/>
					</div>
					<div class="col-auto">
						<button type="button" data-pg-role="searchBtn" class="btn btn-primary">검색</button>
					</div>
				</div>
				<div id="pagingArea"></div>
			</td>
		</tr>
	</tfoot>
</table>
<script src="<url value='/resources/js/app/common/paging.js'/>"></script>
<script src="<c:url value='/resources/js/app/prof/ajax/profList.js'/>"></script>