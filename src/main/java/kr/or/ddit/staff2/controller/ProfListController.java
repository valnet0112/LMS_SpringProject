package kr.or.ddit.staff2.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.ddit.common.paging.BootstrapFormBasePaginationRenderer;
import kr.or.ddit.common.paging.PaginationInfo;
import kr.or.ddit.common.paging.PaginationRenderer;
import kr.or.ddit.staff2.service.ProfService;
import kr.or.ddit.staff2.service.ProfServiceImpl;
import kr.or.ddit.vo.ProfVO;


@Controller
@RequestMapping("/staff/profList.do")
public class ProfListController{
	private ProfService service = new ProfServiceImpl();

	@GetMapping
	public String list(
			@ModelAttribute("paging") PaginationInfo paging
			, @RequestParam(name="page", required = false, defaultValue = "1") int currentPage
			, Model model
			){
		paging.setCurrentPage(currentPage);
		List<ProfVO> profList = service.retrieveProfrList(paging);
		
		PaginationRenderer renderer = new BootstrapFormBasePaginationRenderer("#submitForm");
		
		String pagingHTML = renderer.renderPagination(paging);
		
		model.addAttribute("profList", profList);
		model.addAttribute("pagingHTML", pagingHTML);
		
		return "staff/profList";
	}

}
