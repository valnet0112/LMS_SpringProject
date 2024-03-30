package kr.or.ddit.student.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import kr.or.ddit.common.paging.PaginationInfo;
@Mapper
public interface StudentDAO {
	
	public int selectTotalRecord(PaginationInfo paging);
	public List<Map<String, Object>> selectClassList(PaginationInfo paging);
	public int insertClass(@Param("stdNo") String stdNo, @Param("subCd") String subCd);
	
	public List<Map<String, Object>> selectScoreList(@Param("stdNo") String stdNo, PaginationInfo paging);
	
	
}
