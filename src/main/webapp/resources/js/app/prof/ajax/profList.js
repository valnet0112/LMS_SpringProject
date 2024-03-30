
$(submitForm).on("submit", function(event){
	event.preventDefault();
	let form = this;
	let url = form.action;
	let method = form.method;
	let data = $(form).serialize();
	let $listBody = $(listBody);
	let $pagingArea = $(pagingArea);
	$.ajax({
		url:url
		, method:method
		, data : data
		, dataType : "json"
		, success:function(jsonObj){
			$listBody.empty();
			$pagingArea.empty();
			
			let dataList = jsonObj.memberList;
			let pagingHTML = jsonObj.pagingHTML;
			
			let trTags = null;
			
			if(dataList.length > 0){
				$.each(dataList, function(index, prof){
					trTags += `
						<tr>
							<td>${prof.proNo }</td>
							<td>${prof.proName }</td>
							<td>${prof.proMajor }</td>
							<td>${prof.proTelno }</td>
							<td>${prof.Resigned }</td>
						</tr>
					`;
				});
			}else{
				trTags = `
					<tr>
						<td colspan="6">조건에 맞는 교수가 없음.</td>
					</tr>
				`;
			}
			
			$listBody.append(trTags);
			$pagingArea.append(pagingHTML);
			
		}, error : function(jqXHR, txt, status){
			console.log(txt, status, jqXHR);
		}
	}).done(()=>{
		form.page.value="";
	});
	return false;
}).submit();