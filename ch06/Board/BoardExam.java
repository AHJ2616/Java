package ch06.Board;
import java.util.*;
public class BoardExam {
public static Scanner sc = new Scanner(System.in);//스테틱 메서드에서만 사용 가능
public static Member[] members = new Member[100]; //스테틱 메서드에서만 사용 가능(100개 저장가능)
public static Board[] boards = new Board[1000];

//인스턴스 변수앞에 static을 붙이면 클래스변수가 된다. 모든 인스턴스가 공통된 static변수 값을 갖는다.

	public static void main(String[] args) {// 게시판 display
	
				Member member = new Member();//인스턴스 만들어서 Member 클래스 불러오기
				
				member.id = "master";
				member.pw = "P@ssw0rd";
				member.nick = "운영자";
				member.email = "id@naver.com";
				members[0] = member;
				System.out.println("관리자 정보 저장");
				
				member.menu(sc, members);
				
				
				
				
				
				
		

		
		

	}//main method end

}//class end
