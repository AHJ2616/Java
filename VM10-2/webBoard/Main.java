package webBoard;

import webBoard.DTO.Member;

public class Main {
	
	public static void main(String[] args) {
		webBoard.DTO.Member member = new webBoard.DTO.Member(); //멤버 DTO 인스턴스 생성
		webBoard.service.MemberMenu memberMenu = new webBoard.service.MemberMenu(); //멤버 메서드 인스턴스 생성
		member.sample(); //샘플 집어넣기 매니저 객체
		memberMenu.titleMenu();//메인 메뉴
	

		
		
	}//main method end

}// class end
