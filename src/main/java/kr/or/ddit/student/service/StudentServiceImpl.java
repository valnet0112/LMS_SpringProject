package kr.or.ddit.student.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.or.ddit.common.paging.PaginationInfo;
import kr.or.ddit.student.dao.StudentDAO;
@Service
public class StudentServiceImpl implements StudentService {
	@Inject
	StudentDAO dao;
	
	@Override
	public List<Map<String, Object>> retrieveClassList(PaginationInfo paging) {
		int totalRecord = dao.selectTotalRecord(paging);
		paging.setTotalRecord(totalRecord);
		return dao.selectClassList(paging);
	}
	
	@Override
	public int createClass(String stdNo, String subCd) {
		return dao.insertClass(stdNo, subCd);
	}

	@Override
	public List<Map<String, Object>> retrieveScoreList(String stdNo, PaginationInfo paging) {
		return dao.selectScoreList(stdNo, paging);
	}
}
