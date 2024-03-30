package kr.or.ddit.student.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.common.paging.PaginationInfo;

public interface StudentService {
	
	public List<Map<String, Object>> retrieveClassList(PaginationInfo paging);
	public int createClass(String stdNo, String subCd);
	
	public List<Map<String, Object>> retrieveScoreList(String stdNo, PaginationInfo paging);
}
