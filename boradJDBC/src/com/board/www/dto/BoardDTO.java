package com.board.www.dto;

import java.sql.Date;

public class BoardDTO {//게시판 DTO
	private int bno ; 
	private String btitle ;
	private String bcontent ;
	private String bwriter ; 
	private Date bdate ;
	
	//기본생성자
	public BoardDTO() {}
	
	public BoardDTO(int bno, String btitle, String bcontent, String bwriter, Date bdate) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bwriter = bwriter;
		this.bdate = bdate;
	}//insert 할때 주로 사용한다.
	
	//getter and setter method
	
	

	public int getBno() {
		return bno;
	}
	public String getBtitle() {
		return btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public String getBwriter() {
		return bwriter;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	
	
	

}//class end
