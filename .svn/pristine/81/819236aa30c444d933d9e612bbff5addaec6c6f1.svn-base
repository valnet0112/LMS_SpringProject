package kr.or.ddit.intro.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.common.paging.PaginationInfo;
import kr.or.ddit.intro.dao.IntroDAO;
import kr.or.ddit.intro.dao.IntroDAOImpl;

public class IntroServiceImpl implements IntroService {
	
	private IntroDAO dao = new IntroDAOImpl();
	
	@Override
	public List<Map<String, Object>> retrieveProfessorList(PaginationInfo paging) {
		int totalCount = dao.totalProfessor(paging);
		paging.setTotalRecord(totalCount);
		return dao.selectProfessorList(paging);
	}

	@Override
	public List<Map<String, Object>> retrieveStudentList(PaginationInfo paging) {
		int totalCount = dao.totalStudent(paging);
		paging.setTotalRecord(totalCount);
		return dao.selectStudentList(paging);
	}

}
