package com.board.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.board.www.dao.BoardDAO;
import com.board.www.dto.MemberDTO;
import com.board.www.service.BoardService;
import com.board.www.service.MemberService;

public class BoardMain {
	
	private static Scanner sc = new Scanner(System.in);
	public static Connection con = null;
	public static MemberDTO loginMember; //로그인 정보를 갖고있는 세션
	
	
	public BoardMain() {//생성자
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.111.103:1521:orcl","board1a","gmlwns");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("오류 : url,id,pw,query에 문제발생");
			e.printStackTrace();
			System.exit(0);//프로그램 강제종료 (오류발생시 connection을 close 해야해서)
		}
		
		
	}//생성자 end
	
	public static void main(String[] args) {
		//기본적인 설정 : driver Class 불러오기 , 주메뉴 생성해주기
	
		
		BoardMain main = new BoardMain(); // 생성자 호출= driver 연결, connection 1개 생성
		boolean run = true;
		while(run) {
		System.out.println("MBC 아카데미 대나무숲 오신걸 환영합니다.");
		System.out.println("-------------------------------");
		System.out.println(" 1.회원 | 2.게시판 | 3.종료 ");
		System.out.print(">>>");
		String select = sc.next();
		switch(select) {
		case "1" :  
			MemberService mService = new MemberService();
			mService.list(con);
			break;
		case "2" :
			try {BoardMain.loginMember.getMid();}
			catch(NullPointerException e) 
			{System.out.println("로그인 후 이용가능한 메뉴입니다.\n로그인을 먼저해주세요");
			break;}
			BoardService bService = new BoardService();
			bService.list(con);
			break;
		case "3" : run=false; System.out.println("시스템 종료"); 
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			break;
		default : System.out.println("범위 안에서 선택하여 주세요");
		}//switch end
		}//while end

	}//main method end

}//class end
