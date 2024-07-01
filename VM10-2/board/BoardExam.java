package board;

import java.util.*;//Scanner 객체 불러오기

public class BoardExam {
	public static Scanner sc = new Scanner(System.in); // class3곳에서 전부 공통으로 사용하려고
	public static Member[] members = new Member[101]; // static 변수 = 클래스 변수 모든 인스턴스가 같은값을 갖는다, 3클래스에서 호출시 같은값을 갖음
	public static Board[] boards = new Board[1001]; // 첫 개시물 nft해서 팔면 팔리나? ㅋㅋ

	public static void main(String[] args) {
		Member member = new Member(); // 인스턴스 생성, 객체 사용가능.
		member.id = "master";
		member.pw = "P@ssw0rd";
		member.nick = "관리자";
		member.email = "id@naver.com";
		members[0] = member;
		
		member.menu(sc, members);

		// 관리자 정보 (null 지우는 버퍼 역할도 함)
		// id, pw 비교할때 전부 null이면 버그발생
		
		
		
		
		

	}//main method end

}//class end
