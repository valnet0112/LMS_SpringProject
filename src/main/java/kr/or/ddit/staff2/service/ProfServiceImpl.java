package kr.or.ddit.staff2.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.or.ddit.common.exception.PKNotFoundException;
import kr.or.ddit.common.paging.PaginationInfo;
import kr.or.ddit.enumpkg.ServiceResult;
import kr.or.ddit.staff2.dao.ProfDAO;
import kr.or.ddit.vo.ProfVO;


@Service
public class ProfServiceImpl implements ProfService {
	
	@Inject
	ProfDAO dao;

	@Override
	public ServiceResult createProf(ProfVO vo) {
		ServiceResult result = null;
		if (dao.selectProf(vo.getProNo()) == null) {
			result = dao.insertProf(vo) > 0 ? ServiceResult.OK : ServiceResult.FAIL;
		} else {
			result = ServiceResult.PKDUPLICATED;
		}
		return result;
	}

	@Override
	public ProfVO retrieveProf(String ProNo) {
		ProfVO vo = dao.selectProf(ProNo);
		if (vo == null)
			throw new PKNotFoundException(String.format("%s 에 해당하는 사용자 없음.", ProNo));
		return vo;
	}

	@Override
	public List<ProfVO> retrieveProfrList(PaginationInfo paging) {
		int totalRecord = dao.selectTotalRecord(paging);
		paging.setTotalRecord(totalRecord);
		return dao.selectProfList(paging);
	}

	@Override
	public ServiceResult modifyProf(ProfVO vo) {
		ServiceResult result = null;
		result = dao.updateProf(vo) > 0 ? ServiceResult.OK : ServiceResult.FAIL;
		return result;
	}

	@Override
	public ServiceResult removeProf(String proNo) {
		ServiceResult result = null;
		result = dao.deleteProf(proNo) > 0 ? ServiceResult.OK : ServiceResult.FAIL;
		return result;
	}

}
