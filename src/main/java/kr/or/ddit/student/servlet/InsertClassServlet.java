package kr.or.ddit.student.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.student.service.StudentService;
import kr.or.ddit.student.service.StudentServiceImpl;


@WebServlet("/student/insertClass.do")
public class InsertClassServlet extends HttpServlet {
	
	private StudentService service = new StudentServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		String stdNo = req.getParameter("stdNo");
		String subCd = req.getParameter("formSubCd");
		
		req.setAttribute("stdNo", stdNo);
		req.setAttribute("subCd", subCd);
		
		int cnt = service.createClass(stdNo, subCd);
		
		req.setAttribute("cnt", cnt);
		req.setAttribute("stdNo", stdNo);
		req.getRequestDispatcher("/student/class.do").forward(req, resp);
	}
}
