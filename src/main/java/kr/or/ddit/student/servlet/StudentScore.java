package kr.or.ddit.student.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.ddit.common.paging.BootstrapFormBasePaginationRenderer;
import kr.or.ddit.common.paging.PaginationInfo;
import kr.or.ddit.common.paging.PaginationRenderer;
import kr.or.ddit.student.service.StudentService;
@Controller
@RequestMapping("/student/score.do")
public class StudentScore{
	@Inject
	StudentService service;
	
	@GetMapping
	public String doGet(
			@ModelAttribute("stdNo") String stdNo,
			@RequestParam(name="page",required = false,defaultValue = "1") int currentPage,
			Model model
		){
		PaginationInfo paging = new PaginationInfo();
		paging.setCurrentPage(currentPage);
		List<Map<String, Object>> scoreList = service.retrieveScoreList(stdNo, paging);
		PaginationRenderer renderer = new BootstrapFormBasePaginationRenderer("#submitForm");
		String pagingHTML = renderer.renderPagination(paging);
		model.addAttribute("scoreList", scoreList);
		model.addAttribute("pagingHTML", pagingHTML);
		model.addAttribute("stdNo", stdNo);
		return "student/score";
 	}
}
