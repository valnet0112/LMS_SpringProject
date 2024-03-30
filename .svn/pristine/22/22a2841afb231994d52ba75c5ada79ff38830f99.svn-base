package kr.or.ddit.common.paging;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 페이징 처리와 관련된 속성을 가진 객체
 * 
 */

@Getter
@NoArgsConstructor
@ToString
public class PaginationInfo {
	
	public PaginationInfo(int screenSize, int blockSize) {
		super();
		this.screenSize = screenSize;
		this.blockSize = blockSize;
	}

	private int totalRecord; // 데이터베이스 조회
	private int screenSize = 10; // 임의 결정
	private int blockSize = 5 ; // 임의 결정
	private int currentPage; // 사용자 결정(요청 파라미터)
	private int totalPage; // 계산식 필요
	private int startRow; // 계산식 필요
	private int endRow; // 계산식 필요
	private int startPage; // 계산식 필요
	private int endPage; // 계산식 필요
	
	private SearchCondition simpleCondition;	// 단순 키워드 검색용
	private Map<String, Object> detailCondition = new LinkedHashMap<>();
	
	public void addDetailCodition(String key, Object value) {
		detailCondition.put(key,value);
	}
	
	public void setDetailCondition(Map<String, Object> detailCondition) {
		this.detailCondition = detailCondition;
	}
	public void setSimpleCondition(SearchCondition simpleCondition) {
		this.simpleCondition = simpleCondition;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
		totalPage = (totalRecord + (screenSize - 1)) / screenSize;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
		startRow = currentPage * screenSize - (screenSize - 1);
		endRow = currentPage * screenSize;
//		startPage = (currentPage - 1 / blockSize) * blockSize + 1;			//계산 오류
//		endPage = (currentPage - 1 / blockSize) * blockSize + blockSize;	//계산 오류
		endPage = (( currentPage + (blockSize -1) ) / blockSize) * blockSize;
		startPage = endPage - (blockSize -1); 
	}
	
	public int getEndPage() {
		return endPage > totalPage ? totalPage : endPage;
	}
}
