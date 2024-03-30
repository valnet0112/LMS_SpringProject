package kr.or.ddit.intro.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import kr.or.ddit.common.paging.BootstrapFormBasePaginationRenderer;
import kr.or.ddit.common.paging.PaginationInfo;
import kr.or.ddit.common.paging.PaginationRenderer;
import kr.or.ddit.intro.service.IntroService;
import kr.or.ddit.intro.service.IntroServiceImpl;

@WebServlet("/intro/professorList.do")
public class ProfessorController extends HttpServlet{
	
	private IntroService service = new IntroServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pageStr = req.getParameter("page");
		int currentPage = 1;
		if(StringUtils.isNumeric(pageStr)) {
			currentPage = Integer.parseInt(pageStr);
		}
		PaginationInfo paging = new PaginationInfo();
		paging.setCurrentPage(currentPage);
		List<Map<String, Object>> professorList = service.retrieveProfessorList(paging);
		PaginationRenderer renderer = new BootstrapFormBasePaginationRenderer("#pageForm");
		String pagingHTML = renderer.renderPagination(paging);
		req.setAttribute("pagingHTML", pagingHTML);
		req.setAttribute("professorList", professorList);	
		String logicalViewName = "intro/professor";
		req.getRequestDispatcher("/"+logicalViewName+".miles").forward(req, resp);
	}
}
