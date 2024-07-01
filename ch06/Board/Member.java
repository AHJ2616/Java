package ch06.Board;

import java.util.Scanner;

public class Member {
	
	//필드 :ID password nickname e-mail
	
	String id ;//인스턴스 변수(아직 메모리에 할당 안됨, 인스턴스를 만들어야 생성이 된다)
	String pw;
	String nick;
	String email;
	
	
	//생성자 : new로 인스턴스 생성
	
	//메서드 : 회원가입 , 로그인 , 정보수정 , id,비번,email검증
	
	public void menu(Scanner sc,Member[] members) {//non static void method
		
		
		boolean run1 = true;
		while(run1) {
		System.out.println("=============== 게 시 판 =================");
		System.out.println("\n| 1. 신규가입 | 2. 로그인 | 3. 종료 |\n");
		System.out.println("=========================================");
		System.out.print(">>>>");
		String select= sc.next();
		switch(select) {
		case "1" :
			Member newMember = register(sc,members);
			for(int i =0;i<members.length;i++) {if(members[i]==null)
			{members[i]=newMember;}//if end
				break;}//for end
			System.out.println("회원가입을 축하드립니다");
			break;
		case "2" :
			Member loginMember=login(sc,members);
			
			
			break;
		case "3" : run1=false;
			break;
		default : System.out.println("입력오류 입니다. \n다시 입력해주세요"); break;
			
			
		
		
		}//switch(select) end
		
		
		
		}//while(run1) end
	}//menu method end
	
	
	public Member register(Scanner sc,Member[] members) {//non static void method
		Member newMember = new Member();//입력받을 newMember 값
		System.out.println("=============== 회 원 가 입 =================");

		boolean run2=true;
		boolean run3=true;
		boolean run4=true;
		boolean run5=true;
		while(run2) {
		System.out.print("아이디를 입력해주세요 : ");
		String id2 = sc.next(); // 아이디를 String으로 입력받음(미확인 아이디여서 아직 id객체에 저장 x)
		
		newMember.id = checkId(id2,members); //checkId method에서 확인후 String타입 아이디를 newMember.id에 저장
		
		if(newMember.id!=null) { //아이디확인이 끝나면 비밀번호 입력으로 넘어가기
			 run2=false;
		}//if end
		else {System.out.println("중복된 아이디입니다. 다른 아이디를 입력해 주세요.");}
		}//while(run2) end
		
		System.out.print("패스워드를 입력해주세요 : ");
		newMember.pw = sc.next();
		
		while(run3) {//while end
		System.out.print("닉네임을 입력해주세요 : ");
		String nick2 = sc.next();
		
newMember.nick = checkNick(nick2,members); 
		
		if(newMember.nick!=null) { //아이디확인이 끝나면 비밀번호 입력으로 넘어가기
			 run3=false;
		}//if end
		else {System.out.println("중복된 닉네임입니다. 다른 닉네임을 입력해 주세요.");}
		
		
		}//while(run3) end
		System.out.print("이메일주소를 입력해주세요 : ");
		email = sc.next();
		
		//최종결과물
		return newMember;
		
		
	}//register method end
	
	public Member login(Scanner sc,Member[] members) {//non static void method
		//매게변수 Scanner sc, Member[] members
		
		Member loginMember = new Member();//키보드로 받은 id,pw 저장용
		System.out.println("=============== 로 그 인 =================");
		System.out.print("아이디를 입력해주세요 : ");
		loginMember.id = sc.next();
		System.out.print("패스워드를 입력해주세요 : ");
		loginMember.pw = sc.next();
		
		//배열에 있는 객체와 새로만든 객체 비교
		for(int i = 0; i<members.length;i++) {
			if(members[i].id != null) {
				if(members[i].id.equals(loginMember.id)&&
						members[i].pw.equals(loginMember.pw)) {
					//id입력값과 members.id 가 같고 pw입력값과 members.ps가 같은가
					loginMember = members[i];
					
				}//2번 if end
				else {System.out.println("등록되지 않은 정보입니다.");
				System.out.println("| 1. 다시시도 |\n| 2. 회원가입하기 |");
				}//else end
				break;
			}//if end
			
		}// for end
		
		
	return loginMember;//리턴할 인스턴스 loginMember 에는 members[i]의 값만 갖고있다.
		
	}// login method end
	
	public void modify() {//non static void method
		System.out.println("============ 회 원 정 보 수 정 ==============");
	
	}// modify method end
	
	public void delete() {//non static void method
		System.out.println("============ 회 원 탈 퇴 ==============");
	
	}// delete method end
	
	
	//아이디 확인
	public String checkId(String id,Member[] members) {//non static void method
		// 매개변수 확인할 id값 , 대조할 객체배열 members

		String checkedId = null;
		//리턴할 값
		
		for(int i=0;i<members.length;i++) {
			if(members[i].id!=null) {
			if(! members[i].id.equals(id)) {// 중복안되었다.
				System.out.println("사용가능한 아이디 입니다.");
				checkedId = id; // String id 반환시켜주기.
				break;
			}//if end
			}//if2 end
			
	}//for end	
		return checkedId;
		
	
	}// checkId method end
	
	public String checkNick(String nick,Member[] members) {//non static void method
		String checkednick = null;
		for(int i=0;i<members.length;i++) {
			if(members[i].nick!=null) {
			if(! members[i].nick.equals(nick)) {// 중복안되었다.
				System.out.println("사용가능한 닉네임 입니다.");
				checkednick = nick; // String id 반환시켜주기.
				break;
			}//if end
			}//if2 end
			
	}//for end	
		
		return checkednick;
		
	}// checkPw method end
	
	public void checkEmail() {//non static void method
		
		
	}// checkEmail method end
	

}//class end
