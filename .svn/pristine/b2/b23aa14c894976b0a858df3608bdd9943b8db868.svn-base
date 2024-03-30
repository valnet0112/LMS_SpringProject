/**
 * 
 */
// 			for(int i=0; i<propList.size();i++){
// 				PropertyVO vo = propList.get(i);
// 				String tr = String.format("<tr><td>%s</td><td>%s</td><td>%s</td></tr>",vo.getPropertyName(),vo.getPropertyValue(),vo.getDescription());
// 				out.println(tr);
// 			}
// 			propList.stream()
// 				.map(vo -> String.format("<tr><td>%s</td><td>%s</td><td>%s</td></tr>",vo.getPropertyName(),vo.getPropertyValue(),vo.getDescription()))
// 				.collect(Collectors.joining("\n"))
//			for(PropertyVO propVO : propList){
//				<tr>
//					<td><%=propVO.getPropertyName() %></td>
//					<td><%=propVO.getPropertyValue() %></td>
//					<td><%=propVO.getDescription() %></td>
//				</tr>
//			}
const cPath = document.body.dataset.contextPath;
const baseURI = `${cPath}/12/jdbcDesc.do`;

function fnCommFetch(url, options, fnResolve){
	fetch(url, options)
		.then(resp=>{
			if(resp.ok){
				return resp.json();
			}else{
				throw new Error(`상태코드 ${resp.status} 수신`, {cause:resp});
			}
		}).then(fnResolve)
		  .catch(err=>console.error(err));	
}

var fnRefreshDataLiTags = jsonObj => {
	let keyArray = jsonObj.keySet;
	let tbody = document.querySelector("tbody");
	let trs = keyArray.map(k => `
		<tr>
			<td>${k.property_name}</td>
			<td>${k.property_value}</td>
			<td>${k.description}</td>
		</tr>
	`).join("\n");
	tbody.innerHTML = trs;
	ulTag.classList.add("list-group");

};

var fnReadProperties = (event) => {
	fnCommFetch(baseURI, {
		headers: {
			"Accept": "application/json"
		}
	}, fnRefreshDataLiTags);
};
document.addEventListener("DOMContentLoaded", fnReadProperties);