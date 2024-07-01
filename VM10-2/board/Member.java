package board;

import java.util.Scanner;

public class Member {
	String id;
	String pw;
	String email;
	String nick;

	// 1.메뉴-로그인창
	public void menu(Scanner sc, Member[] members) {
		Member member = new Member();

		boolean run1 = true;
		while (run1) {
			System.out.println("menu>");
			System.out.println("\n| 1. 로그인 | 2. 회원가입 | 3. 나가기 \n");
			System.out.print(">>>");
			String select1 = sc.next();
			switch (select1) {
			case "1":
				Member logMember = member.login(sc, members);
				if (logMember.nick != null) {
					if (logMember.id.equals("master")) {
						member.masterMenu(sc, logMember);
					}

					else {
						member.userMenu(sc, logMember);
					}
				}

				// 로그인
				break;
			case "2":
				Member regMember = member.register(sc, members);
				for (int i = 0; i < members.length; i++) {
					if (members[i] == null) {
						members[i] = regMember;
						System.out.println("정상적으로 회원가입 되었습니다");
						break;
					} // if end

				} // for end
					// 회원가입
				break;
			case "3":
				System.out.println("테스트합니다");
				for (int i = 0; i < members.length; i++) {
					if (members[i] != null) {
						System.out.println(members[i].id + " " + members[i].pw);
					}
				}
				break;
			default:
				System.out.println("입력 오류입니다\n다시 입력해주세요.");

			}// switch(select1) 메뉴1 선택창
		} // while(run1) end

	}// menu1 method end

	public Member login(Scanner sc, Member[] members) {
		Member logMember = new Member();

		System.out.print("Id :");
		logMember.id = sc.next();
		System.out.print("\nID : " + logMember.id + "\nPW : ");
		logMember.pw = sc.next();
		// 아이디 패스워드 입력받기

		// 아이디 패스워드 일치하는가 확인하기
		for (int i = 0; i < members.length; i++) {
			if (members[i].id != null) {
				if (members[i].id.equals(logMember.id) && members[i].pw.equals(logMember.pw)) {
					System.out.println("로그인에 성공하셨습니다");
					logMember = members[i];
					break;

				} // if end

			} // if end

		} // for end

		return logMember;

	} // login method end

	public Member register(Scanner sc, Member[] members) {
		Member regMember = new Member();
		boolean run1 = true;

		System.out.println("menu>회원가입");

		System.out.print("사용하실 아이디를 입력해주세요 :");
		regMember.id = sc.next();
		System.out.print("사용하실 비밀번호를 입력해주세요 :");
		regMember.pw = sc.next();
		System.out.print("사용하실 닉네임을 입력해주세요 :");
		regMember.nick = sc.next();
		System.out.print("사용하실 이메일주소를 입력해주세요 :");
		regMember.email = sc.next();

		return regMember;
	} // register method end

	public void userMenu(Scanner sc, Member logMember) {
		boolean run = true;
		while (run) {
			System.out.println("==========사용자 메뉴 ===========");
			System.out.print("1. 회원정보 관리 2. 게시판 가기 3. 로그아웃");
			System.out.println("==============================");
			System.out.print(">>>");
			String select = sc.next();
			switch (select) {
			case "1":
				logMember = logMember.uState(sc, logMember);
				break;
			case "2":
				break;
			case "3":
				run = false;
				break;
			default:
				System.out.println("입력 오류입니다\n다시 입력해주세요.");

			}// switch end

		} // while(run) end

	}// userMenu method end

	public Member uState(Scanner sc, Member logMember) {
		boolean run = true;
		while (run) {
			System.out.println("==========사용자 메뉴>회원정보 관리 ===========");
			System.out.print("1. 회원정보 수정 2. 회원 탈퇴 3. 뒤로가기");
			System.out.println("==============================");
			System.out.print(">>>");
			String select = sc.next();
			switch (select) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				run = false;
				break;
			default:
				System.out.println("입력 오류입니다\n다시 입력해주세요.");

			}// switch end

		} // while(run) end
		return logMember;
	}

	public void masterMenu(Scanner sc, Member logMember) {
		boolean run = true;
		while (run) {
			System.out.println("=========관리자 메뉴 ===========");
			System.out.print("1. 회원관리 2. 게시판관리 3. 로그아웃");
			System.out.println("==============================");
			System.out.print(">>>");
			String select = sc.next();
			switch (select) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				run = false;
				break;
			default:
				System.out.println("입력 오류입니다\n다시 입력해주세요.");

			}// switch end
		} // while(run) end

	}// userMenu method end

}// class end
