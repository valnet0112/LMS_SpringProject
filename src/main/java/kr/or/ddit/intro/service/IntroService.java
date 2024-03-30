package kr.or.ddit.intro.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.common.paging.PaginationInfo;

public interface IntroService {
	public List<Map<String,Object>> retrieveProfessorList(PaginationInfo paging);
	public List<Map<String,Object>> retrieveStudentList(PaginationInfo paging);
}
