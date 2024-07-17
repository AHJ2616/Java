package com.board.www.dto;

import java.sql.Date;

public class MemberDTO {
	
	//필드
	private int mno;
	private String mid;
	private String mpw;
	private Date mdate;
	
	
	//생성자
	public MemberDTO() {} //기본 생성자

	
	
	// 메서드 getter / setter

	public int getMno() {
		return mno;
	}

	public String getMid() {
		return mid;
	}

	public String getMpw() {
		return mpw;
	}

	public Date getMdate() {
		return mdate;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public void setMpw(String mpw) {
		this.mpw = mpw;
	}

	public void setMdate(Date mdate) {
		this.mdate = mdate;
	}
	
	@Override//테스트 코드
	public String toString() {
		return "MemberDTO [mno=" + mno + ", mid=" + mid + ", mpw=" + mpw + ", mdate=" + mdate + "]";
	}


}// class end
