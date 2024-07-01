package ch06.Shop;
import java.util.*;//스캐너 import
public class Member {
	String id;
	String pw;
	String address;
	String nick;
	String email;
	int money;
	int number;
	
	public void menu1(Scanner sc,Member[] members,Item[] items) {//메인메뉴(로그인 회원가입)
		Pay[] pays = new Pay[100];
		
		Member member = new Member(); // Member 인스턴스 생성
		boolean run=true;
		while(run) {
		System.out.print("\n메뉴를 선택해주세요\n| 1. 로그인 \n| 2. 회원가입\n\n>>>");
		String select= sc.next();
		switch(select) {
			case "1" : 
				member=member.login(sc, members);
				if(member.nick!=null) {
					if(member.nick.equals("관리자")) {
						member.menuAdm(sc,member,items); //관리자 메뉴로 보내주기
					} else {
						member.menuUser(sc,member,items,pays);//사용자 메뉴로 보내주기
						
					}
				}//로그인 성공 여부를 nick 정보가 있는냐 없느냐로 판단하여 메인메뉴 페이지로 보내주기
				break;
			case "2" :
				member.register(sc, members); //리턴 안해도 될거같은데?(members개체가 static이어서) 혹시 모르니 ㅎㅎ
				System.out.println("회원가입이 정상적으로 처리되었습니다.");
				System.out.println("가입한 아이디로 로그인 해 주시기 바랍니다.");
				break;
				default : System.out.println("다시 입력해주세요");
			
			
		}//switch end
		}//while end	
		
		
	}//menu1 method end
	public void register(Scanner sc,Member[] members) {//회원가입
		//회원가입
		Member member1 = new Member(); //Member 인스턴스 생성
		boolean run =true;//아이디 용
		boolean run1 = true; //비밀번호 용
		
			
		System.out.print("회원가입>\n사용할 아이디를 입력해주세요 : ");
		member1.id = sc.next();
		
		while(run) {
		System.out.print("사용할 비밀번호를 입력해주세요 (8자리 이상) : ");
		member1.pw=sc.next();
		if(member1.pw.length()<8) {System.out.println("비밀번호를 8자리 이상으로 입력해주세요");}else {
			System.out.println("사용가능한 비밀번호 입니다.");
			run=false;
		}
		
		}// 비밀번호 while(run1) end
		System.out.println("\n사용할 닉네임을 입력해주세요");
		member1.nick=sc.next();
		System.out.println("\nemail 주소를 입력해주세요");
		member1.email=sc.next();
		System.out.println("\n상품을 배송받을 주소를 입력해주세요");
		member1.address=sc.next();
		for(int i =0;i<members.length;i++) {
			if(members[i]==null) {
				member1.number=i;
				members[i]=member1;
			}
			
		}//for end
		
	
	}//회원가입 method end
	
	public void menuUser(Scanner sc,Member member,Item[] items,Pay[] pays) {//유저메뉴
		boolean run = true;
		Item item=new Item();
		Pay pay = new Pay();
		//상품갯수 100개니까 , 인스턴스 행렬객체이다 = 해당유저 전용
		while(run) {
		System.out.print(member.nick+"님의 메뉴>\n메뉴를 선택해주세요\n| 1. 상품 구매하러 가기 \n| 2. 머니 충전하기\n| 3. 장바구니 확인 \n| 4. 회원정보 수정\n| 5. 로그아웃\n\n>>>");
		String select = sc.next();
		switch(select) {
		case "1" : //아이템 구매
			item.userMenu1(sc,member,pays,items);
			break;
		case "2" :
			member=pay.recharge2(sc, member);
			break;
		case "3" :
			pay.pocketShow(sc, member, pays, items);
			break;
		case "4" :
			System.out.println("미구현 상태입니다 sorry");
			break;
		case "5" :
			run=false;
			break;
		default : System.out.println("다시 입력해주세요");
		}
		
		}//while end
	}//유저 menu end
	
	
	public void menuAdm(Scanner sc,Member member,Item[] items) {//관리자 메뉴 스캐너 받아오기
		boolean run = true;
		Item item = new Item(); // Item 인스턴스 생성
		while(run) {
		System.out.print("관리자 메뉴>\n메뉴를 선택해주세요\n| 1. 사용자관리 \n| 2. 상품관리\n| 3. 통계보기\n| 4. 로그아웃\n\n>>>");
		String select = sc.next();
		switch(select) {
		case "1" : 
			//유저관리 메뉴로 보내준다
		break;
		case "2" :
			item.menu1(sc,items); //상품관리 메뉴로 보내기
			break;
		case "3" :
			//통계 메뉴
			break;
		case "4" : run=false; break;
		default : System.out.println("다시 입력해주세요");
		
		}//switch end
		
		}// while end
	}//menuAdm method end

public Member login(Scanner sc,Member[] members) {//로그인 창
		//로그인 method
		Member member = new Member(); // 멤버객체 인스턴스 생성
		boolean run = true;
		
		while(run) {
			System.out.println("l o g i n\n");
		System.out.print("아이디를 입력해 주세요 : ");
		member.id = sc.next();
		
		System.out.print("비밀번호를 입력해 주세요 : ");
		member.pw = sc.next();
		
		//id와 ps 확인하기
		for(int i=0;i<members.length;i++) {
			if(members[i]!=null) {
				if(member.id.equals(members[i].id)&&member.pw.equals(members[i].pw)) {
					System.out.println("로그인 성공");
					member=members[i];
					run=false;
					break;	
				}//if end
				
				
			}//if end
			else {System.out.println("로그인에 실패하였습니다.");
			System.out.println("| 1. 다시시도\n |2. 회원가입");
			String select=sc.next();
			switch(select) {
			case "1" : 
				break;
			case "2" :run=false;
			member.register(sc, members);
				break;
			default: System.out.println("다시 입력해주세요");
			
			}//switch end
			
			
			break;}//else end
		}//for end
		
		
		}//while end
		
	return member;
		
	}//login method end
	

}//class end
