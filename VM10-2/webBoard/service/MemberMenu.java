package webBoard.service;

import java.util.*;

import webBoard.DTO.Member;

public class MemberMenu extends webBoard.DTO.Member {// 메뉴 담당

	private static Scanner sc = new Scanner(System.in);

	public void titleMenu() {// 타이틀 메뉴
		webBoard.service.Read0 read0 = new webBoard.service.Read0();
		boolean run = true;
		while (run) {
			System.out.println("=======================================");
			System.out.println("http://자유게시판.com");
			System.out.println("=======================================\n");
			System.out.println("1.회원가입 | 2.로그인\n");
			System.out.println("=======================================");
			System.out.print("입력 : ");
			String sl = sc.next();
			switch (sl) {
			case "2": 
				user = login(); //로그인
				read0.main(user); //성공시 메인메뉴
				break;
			case "1":
				resister();
				break;
			default:
				System.out.println("메뉴의 번호중에서 선택해 주세요.");
			}// switch end
		} // while end

	}// 타이틀 메뉴 method end

	
	public void resister() {// 회원가입
		Member member = new Member();
		System.out.println("=======================================");
		System.out.println("http://자유게시판.com/회원가입");
		System.out.println("=======================================\n");
		String id = idCheck();
		String pw = pwCheck();
		String nick = makeNick();
		member.setId(id);
		member.setPw(pw);
		member.setNick(nick);
		member.setMembers(member);
		//testcode(); <-배열에 들어가는지 확인용
		System.out.println(member.getNick()+"님 회원가입을 축하드립니다");
	}

	public String idCheck() {// 가입 아이디 중복확인
		boolean run = true;
		while (run) {
			try {
				System.out.print("1.사용하실 아이디를 입력해주세요 : ");
				String id = sc.next();
				setId(id);
				for (int i = 0; i < getMembers().length; i++) {
					if (getMembers()[i] != null) {
						if (id.equals(getMembers()[i].getId())) {
							System.out.println("아이디가 중복되었습니다.");
							break;
						} // if end
					} // if end
				} // for end
			} catch (NullPointerException e) {
			}
			;
			System.out.println("사용가능한 아이디 입니다.");
			
			run = false;
			
		} // while end
		return id;
	}// 아이디 중복확인 method end

	public String pwCheck() {// 가입 비밀번호 확인
		System.out.print("2.사용하실 패스워드를 입력해주세요 : ");
		String pw = sc.next();
		boolean run = true;
		while (run) {
			System.out.print("비밀번호 확인을 위해 다시 한 번 입력해주세요 : ");
			String pw2 = sc.next();
			if(pw.equals(pw2)) {
				run=false; setPw(pw);
			}else if(!pw.equals(pw2)) {
				System.out.println("비밀번호가 다릅니다. 다시 확인 후 입력해주세요");}

		} // while end
		return pw;
	}// 비밀번호 확인 method end

	public String makeNick() {//닉네임 설정
		System.out.println("3.특수문자,띄어쓰기를 제외한 닉네임을 설정해주세요");
		String nick = sc.next();
		return nick;
	}//닉네임 설정 method end
	
	public Member login() {//로그인
		boolean run =true;
		while(run) {
		System.out.println("=======================================");
		System.out.println("http://자유게시판.com/로그인");
		System.out.println("=======================================\n");
		System.out.print("아이디를 입력해주세요 : ");
		String id = sc.next();
				System.out.print("\n비밀번호를 입력해 주세요 : ");
				String pw = sc.next();
				for(int i = 0;i<members.length;i++) {
					if(members[i]!=null) {
						if(members[i].getId().equals(id)&&members[i].getPw().equals(pw)) {
							System.out.println("로그인 성공!"); run=false;
							user=members[i];
							break;
						}//if end
						}
					else {System.out.println("로그인 실패!\n아이디와 비밀번호를 확인해주세요");
					System.out.println("1. 다시시도 | 2. 회원가입하기");
					String sl = sc.next();
					switch(sl) {
					case "1" :
						break;
					case "2" : resister();
						break;
					default : System.out.println("다시 입력해주세요");
					}
					break;
					}//if end
				
				}//for end
		}//while(run) end
		return user;
	}//로그인 method end

	public Member modify(Member user) {//회원정보 변경
		System.out.print(user.getNick()+"님 정보확인을 위해서 비밀번호를 입력해주세요");
		String x = sc.next();
		if(user.getPw().equals(x)) {
			System.out.println("변경하실 비밀번호를 입력해주세요. (변경X -> '0'입력");
			System.out.print("변경할 비밀번호 : ");
			String y = sc.next();
			if(!y.equals("0")) {user.setPw(y);}
			System.out.println("변경하실 닉네임을 입력해주세요. (변경X -> '0'입력");
			System.out.print("변경할 닉네임 : ");
			String z = sc.next();
			if(!z.equals("0")) {user.setNick(z);}
			try {
			for(int i =0;i<members.length;i++) {
				if(members[i].getId().equals(user.getId())) {
					members[i]=user;
				}//if end
			}//for end
			}catch(NullPointerException e) {}
			System.out.println(user.getNick()+"님 정보변경이 완료되었습니다");
		}//if end
		else {System.out.println("오류: 비밀번호가 틀립니다!");}
		return user;
	}//변경 method end
}// class end
