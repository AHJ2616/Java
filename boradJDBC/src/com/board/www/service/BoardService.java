package com.board.www.service;

import java.sql.Connection;
import java.util.Scanner;

import com.board.www.dao.BoardDAO;

public class BoardService {//게시판 Service
	private static Scanner sc = new Scanner(System.in);

	public void list(Connection con) {//게시판 메뉴(게시물 목록 보기)
		boolean run = true;
		while(run) {
		System.out.println("----------------------------------------");
		System.out.println("|              대나무숲 게시판              |");
		System.out.println("----------------------------------------");
		System.out.println("게시물 목록>");
		System.out.println("번호\t제목\t\t작성자\t작성일");
		System.out.println("----------------------------------------");
		int x=2 ; int y = 17; int z =1;
		BoardDAO bdao = new BoardDAO();
		bdao.list(con,x,y);
		System.out.println("--------------------"+z+"번 페이지"+"--------------------");
		System.out.println("메뉴선택>");
		System.out.println("1.다음 페이지| 2.이전 페이지");
		System.out.println("1.게시물보기|2.게시물작성|3.게시물수정|4.게시물삭제|5.게시물보기");
		System.out.println("6.게시물 제목+내용 검색|7.뒤로가기");
		}
		String select = sc.next();
	}//게시판 메뉴 method end
	
}//class end
