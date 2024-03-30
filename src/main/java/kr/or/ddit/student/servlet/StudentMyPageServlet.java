package kr.or.ddit.student.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.vo.StudentVO;

@WebServlet("/student/mypage.do")
public class StudentMyPageServlet extends HttpServlet {


	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String stdNo = req.getParameter("stdNo");
		String stdName = req.getParameter("stdName");
		StudentVO student = new StudentVO();
		student.setStdNo(stdNo);
		student.setStdName(stdName);
		
		req.setAttribute("student", student);
		String logicalViewName = "student/mypage";
		req.getRequestDispatcher("/"+logicalViewName+".miles").forward(req, resp);
	}
}
