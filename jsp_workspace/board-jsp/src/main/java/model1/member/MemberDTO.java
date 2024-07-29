package model1.member;

import java.sql.Date;

public class MemberDTO {

	private String id;
	private String pw;
	private String name;
	private Date regdate;

	// 기본생성자
	public MemberDTO() {
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
}
