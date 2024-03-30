package kr.or.ddit.student.servlet;

import java.io.IOException;
import java.util.Enumeration;
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
import kr.or.ddit.common.paging.SearchCondition;
import kr.or.ddit.student.service.StudentService;
import kr.or.ddit.student.service.StudentServiceImpl;

@WebServlet("/student/class.do")
public class StudentClassServlet extends HttpServlet {
	StudentService service = new StudentServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String stdNo = req.getParameter("stdNo");
		Enumeration<String> attributes = req.getAttributeNames();
		while(attributes.hasMoreElements()) {
			if(attributes.nextElement().equals("stdNo")) {
				stdNo = (String) req.getAttribute("stdNo");
			}
		}
		
		
		String searchType = req.getParameter("searchType");
		String searchWord = req.getParameter("searchWord");
		SearchCondition simpleCondition = new SearchCondition(searchType, searchWord);
		req.setAttribute("condition", simpleCondition);
		String pageStr = req.getParameter("page");
		
		int currentPage = 1; 
		if(StringUtils.isNumeric(pageStr)) {
			currentPage = Integer.parseInt(pageStr);
		}
		PaginationInfo paging = new PaginationInfo();
		paging.setCurrentPage(currentPage);
		paging.setSimpleCondition(simpleCondition);
		List<Map<String, Object>> classList = service.retrieveClassList(paging);
		
		PaginationRenderer renderer = new BootstrapFormBasePaginationRenderer("#submitForm");
		
		String pagingHTML = renderer.renderPagination(paging);
		
		
		req.setAttribute("classList", classList);
		req.setAttribute("pagingHTML", pagingHTML);
		req.setAttribute("stdNo", stdNo);
		String logicalViewName = "student/class";
		req.getRequestDispatcher("/"+logicalViewName+".miles").forward(req, resp);
	}
}
