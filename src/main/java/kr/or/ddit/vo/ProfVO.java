package kr.or.ddit.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode(of = "proNo")
@Data
public class ProfVO {
	private String proNo;
	private String proName;
	private String proMajor;
	private String proTelno;
	private String Resigned;
	
	
	public ProfVO(String proNo, String proName, String proMajor, String proTelno) {
		super();
		this.proNo = proNo;
		this.proName = proName;
		this.proMajor = proMajor;
		this.proTelno = proTelno;
	}
}
