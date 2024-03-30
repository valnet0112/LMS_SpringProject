$("a[data-go-link]").each((index,aTag)=>{
	const contextPath = $("body").data("contextPath");
	let fullUrl = contextPath + $(aTag).data("goLink");
	$(aTag).attr('href', fullUrl);
});