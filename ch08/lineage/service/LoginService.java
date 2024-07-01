package ch08.lineage.service;

import java.util.*;

import ch08.lineage.DTO.Account;

public class LoginService { // 로그인에 관한 부메뉴용
	
	
	private static Scanner sc = new Scanner(System.in);

	public static void menu(Account loginAccount) {// 메뉴
		boolean run=true;
		while(run) {
		System.out.println("1.로그인\n2.회원가입\n3.회원수정\n4.뒤로가기");
		String select = sc.next();
		switch (select) {
		case "1":
			loginAccount=login(loginAccount);
			
			break;
		case "2":
			System.out.println("회원가입");
			break;
		case "3":
			System.out.println("회원 수정");
			break;
		case "4":
			run = false;
			break;
		default:
			System.out.println("다시 입력해 주세요");

		}// switch end

		}//while end
	}// 메뉴 method end
	
	public static Account login(Account loginAccount) {
		System.out.println("로그인");
		System.out.println("아이디 :");
		String id = sc.next();
		System.out.println("패스워드 :");
		String pw = sc.next();
		Account account = new Account();
		account.setId(id);
		account.setPw(pw);
		
		for(int i =0; i<account.accounts.length;i++){
			if(account.accounts[i]!=null) {
				if(account.accounts[i].getId().equals(account.getId()))
						 {System.out.println("해당하는 아이디가 있습니다");
						 if(account.accounts[i].getPw().equals(account.getPw())){
							 System.out.println("해당하는 패스워드가 있습니다");
							 loginAccount=account.accounts[i];
							 System.out.println("로그인 성공!");
							 break;
						 }//if end
						 else {System.out.println("해당하는 패스워드가 틀립니다");break;}
				}//if end
				else {System.out.println("해당하는 아이디가 없습니다");break;}
				
			}//if end
			else {
				System.out.println("객체를 불러들이는데 오류발생");
			}//else end
			
		}//for end
		
		return loginAccount;
	}//login method end

	
}// class end
