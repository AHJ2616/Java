package ch06.Shop;

import java.util.*; //스캐너 import

public class shopExam {
	public static Scanner sc = new Scanner(System.in);// 클래스 전체에서 사용가능한 스캐너 생성

	public static Member[] members = new Member[100];
	public static Item[] items = new Item[100];

//멤버와 아이템 100개까지 담을 수 있는 행렬

	public static void main(String[] args) {
		// 0.매니저 아이디 1. 로고띄우기 2. 로그인 , 회원가입
		Member member = new Member();
		member.id = "manager";
		member.pw = "javaiseasy";
		member.nick = "관리자";
		member.number = 0;
		member.email = "id@gmail.com";
		members[0] = member;// 관리자 정보 members[0]에 저장 , null버퍼 및 관리자 모드 진입용

		Member member2 = new Member();
		member2.id = "user";
		member2.pw = "qqqq1111";
		member2.nick = "안희준";
		member2.number = 1;
		member2.email = "id@gmail.com";
		members[1] = member2;// 

		Item item1 = new Item();// 상품 샘플 + null버그 방지용 버퍼
		item1.name = "물티슈";
		item1.intro = "가성비 goat 물티슈 100매";
		item1.detail = "제조사 : 다이소코리아\n유통기한 : 2027/01/01";
		item1.price = 1000;
		item1.quantity = 100;
		item1.itemNum = 0;
		items[0] = item1;

		Item item2 = new Item();
		item2.name = "티슈";
		item2.intro = "가성비 goat 뽑아쓰는 곽티슈 100매";
		item2.detail = "제조사 : 다이소코리아\n유통기한 : 2027/01/01";
		item2.price = 2000;
		item2.quantity = 50;
		item2.itemNum = 1;
		items[1] = item2;

		Item item3 = new Item();
		item3.name = "USB 선풍기";
		item3.intro = "가성비 goat 선풍기";
		item3.detail = "제조사 : 다이소코리아\n유통기한 : 2027/01/01";
		item3.price = 5000;
		item3.quantity = 100;
		item3.itemNum = 2;
		items[2] = item3;

		Item item4 = new Item();
		item4.name = "C타입 USB선";
		item4.intro = "가성비 goat C타입용 USB선";
		item4.detail = "제조사 : 다이소코리아\n유통기한 : 2027/01/01";
		item4.price = 2000;
		item4.quantity = 100;
		item4.itemNum = 3;
		items[3] = item4;

		
		

		System.out.println("======= 다이소.com =========");
		member.menu1(sc, members, items);// Member 클래스 -> login 메서드 진입, sc 와 static객체인 members 보내주기

	}

}
