package kr.or.ddit.staff2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import kr.or.ddit.common.paging.PaginationInfo;
import kr.or.ddit.vo.ProfVO;

@Mapper
public interface ProfDAO {

	public int insertProf(ProfVO vo);

	public ProfVO selectProf(@Param("ProNo") String ProNo);

	public int selectTotalRecord(PaginationInfo paging);

	public List<ProfVO> selectProfList(PaginationInfo paging);

	public int updateProf(ProfVO vo);

	public int deleteProf(String ProNo);
}
