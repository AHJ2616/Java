package com.board.www.service;

import java.sql.Connection;
import java.util.Scanner;

import com.board.www.BoardMain;
import com.board.www.dao.MemberDAO;
import com.board.www.dto.MemberDTO;

public class MemberService {
	private static Scanner sc = new Scanner(System.in);
	// 회원가입(C) , 로그인(R) , 회원정보수정(U), 회원탈퇴(D)
	public MemberDAO mdao = new MemberDAO();
	
	public void list(Connection con) {//맴버메뉴
		boolean run = true;
		while(run) {
		System.out.println("----------------------------------------");
		System.out.println("|              대나무숲 회원메뉴             |");
		System.out.println("----------------------------------------");
		System.out.println("1.회원가입|2.로그인|3.회원정보수정|4.회원탈퇴|5.뒤로가기");
		System.out.print(">>>>");
		String select = sc.next();
			switch(select) {
			case "1" : register(con);
				break;
			case "2" : 
				login(con);
				break;
			case "3" : 
				try {BoardMain.loginMember.getMid();}
				catch(NullPointerException e) 
				{System.out.println("로그인 후 이용가능한 메뉴입니다.\n로그인을 먼저해주세요");
				break;
				}
				modify(con);
				break;
			case "4" :
				try {BoardMain.loginMember.getMid();}
				catch(NullPointerException e) 
				{System.out.println("로그인 후 이용가능한 메뉴입니다.\n로그인을 먼저해주세요");
				break;}
				delete(con);
				break;
			case "5" : run=false; System.out.println("메인메뉴로 이동합니다.");
				break;
			default : System.out.println("잘못입력 하셨습니다.");
			
			}//switch end
		}//while end
	}//method end
	
	public void register(Connection con) {//회원가입(C)
		MemberDTO mdto = new MemberDTO();
		MemberDAO mdao = new MemberDAO();
		System.out.println("----------------------------------------");
		System.out.println("|              대나무숲 회원가입             |");
		System.out.println("----------------------------------------");
		boolean run = true, run2=true;
		while(run) {
		System.out.print("아이디를 입력해 주세요 : ");
		mdto.setMid(sc.next());
		run =  mdao.checkId(con, mdto);
		}//while end
		
		while(run2) {
		System.out.print("패스워드를 입력해 주세요 : ");
		mdto.setMpw(sc.next());
		System.out.println("보안을 위해 동일한 패스워드를 다시 입력해 주세요");
		String pw2 = sc.next();
		if(mdto.getMpw().equals(pw2)) {System.out.println("비밀번호 확인 완료");
		run2=false;
		} else {System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");}
		
		}//while end
		mdao.register(con, mdto);
		System.out.println(mdto.getMid()+ "님의 가입이 완료되었습니다");
	}//회원가입 method end
	
	
	public void login(Connection con) {//로그인(R)
		boolean run = true;
		while(run) {
		System.out.println("----------------------------------------");
		System.out.println("|              대나무숲 로그인              |");
		System.out.println("----------------------------------------");
		
		
		System.out.print("아이디를 입력해 주세요 : ");
		String idS = sc.next();
		System.out.print("비밀번호를 입력해 주세요 : ");
		String pwS = sc.next();
		run = mdao.login(con, idS, pwS);
		
		}//while end
		
	}//로그인 method end
	
	public void modify(Connection con) {//회원정보수정(U)
		MemberDTO mdto = new MemberDTO();
		System.out.println("----------------------------------------");
		System.out.println("|              대나무숲 회원정보수정          |");
		System.out.println("----------------------------------------");
		System.out.println("고객 확인을 위해 비밀번호를 입력해 주세요");
		String pw2 = sc.next();
		if(BoardMain.loginMember.getMpw().equals(pw2)) {
			System.out.println("정상확인 되었습니다.");
			boolean run = true;
			while(run) {
			System.out.println("변경하실 비밀번호를 입력해주세요");
			mdto.setMpw(sc.next()); 
			System.out.println("보안을 위해 동일한 패스워드를 다시 입력해 주세요");
			String pw3 = sc.next();
			if(mdto.getMpw().equals(pw3)) {System.out.println("비밀번호 확인 완료");
			run=false;
			} else {System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");}
			
			}//while end
			MemberDAO mdao = new MemberDAO();
			mdao.modify(con,mdto);
			
			
		}//if end
		else {System.out.println("비밀번호가 일치 하지않습니다");}
	}//회원정보수정 method end
	
	public void delete(Connection con) {//회원탈퇴(D)
		System.out.println("----------------------------------------");
		System.out.println("|              대나무숲 회원탈퇴             |");
		System.out.println("----------------------------------------");
		System.out.println("고객 확인을 위해 비밀번호를 입력해 주세요");
		String pw2 = sc.next();
		if(BoardMain.loginMember.getMpw().equals(pw2)) {
			System.out.println("정상확인 되었습니다.");
			System.out.println("탈퇴를 원하시면 \"탈퇴합니다\"를 입력해주세요");
			String x = sc.next();
			if(x.equals("탈퇴합니다")) {
				MemberDAO mdao = new MemberDAO();
				mdao.delete(con);
				BoardMain.loginMember=null;
				System.out.println("회원탈퇴되어 로그아웃 처리됩니다");
			} else {System.out.println("회원탈퇴가 실패하였습니다");}
		}//if end
			
		
	}//회원탈퇴 method end
	
}//class end
