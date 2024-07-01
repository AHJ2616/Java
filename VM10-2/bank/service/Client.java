package bank.service;

import java.util.*;

import bank.BankExam;
import bank.DTO.Financial;
import bank.DTO.NonFinancial;

//정보입력받기를 메뉴 method에서 해야 좋은가 아니면 check에서 받아야 했는가? 아니면 두개로 쪼개야 했나?

public class Client {// 고객과 은행 정보교환 서비스
	
	private static Scanner sc = new Scanner(System.in);
	// 회원정보 100개제한

	public void resister() {// 회원가입1
		String phoneNum="0";
		long phoneNum2=0,resiNum2=0;
		menual();
		NonFinancial nonFinancial = new NonFinancial();
		System.out.println("========= HJ 은행 =========");
		System.out.println("평생계좌 가입>");
		boolean run = true;
		while (run) {// 한글이름 입력받기
			System.out.print("한글이름을 입력해 주세요 : ");
			String name = sc.next();
			run = checkID(name);
			nonFinancial.setName(name);
		} // while end
		boolean run1 = true;
		while (run1) {// 한글주소 입력받기
			System.out.print("한글명 주소를 입력해 주세요(띄어쓰기 X) : ");
			String address = sc.next();
			run1 = checkID(address);
			nonFinancial.setAddress(address);
		} // while end
		boolean run2 = true;
		while (run2) {// 핸드폰번호 입력받기
			System.out.println("(-)을 제외한 전화번호 8자리를 입력해주세요.");
			System.out.print("010-");
			phoneNum = sc.next();
			run2 = checkPhoneNum(phoneNum);
		} // while(run2) end
	
			phoneNum2 = Long.parseLong(phoneNum);
			checkPhoneNum2(phoneNum2);
			nonFinancial.setPhoneNum(phoneNum2);
		

		
		boolean run3 = true;
		while (run3) {// 주민번호 입력받기
			System.out.print("(-)을 제외한 주민번호 13자리를 입력해주세요 : ");
			String resiNum = sc.next();
			run3 = checkresiNum(resiNum);
			resiNum2 = Long.parseLong(resiNum);
			nonFinancial.setResidentNum(resiNum2);
		nonFinancial.setNFs(nonFinancial);
		} // while(run3) end
		System.out.println(nonFinancial.getName()+"님 회원가입을 위해 다음단계를 진행해 주세요.");
		
		nonFinancial.print();//개발자 확인 코드
		
	}// 회원가입1 method end

	public void loginMenu() {// 로그인 메뉴
		System.out.println("========= HJ 은행 =========");
		System.out.println("로그인>");
		System.out.print("아이디를 입력해 주세요 :");
		String id = sc.next();
		System.out.println("========= HJ 은행 =========");
		System.out.println("로그인>");
		System.out.println("아이디 : " + id);
		System.out.print("비밀번호를 입력해 주세요 :");
		String pw = sc.next();

	}// 로그인 메뉴 method end

	private boolean checkID(String name) {// 한글이름,주소 체크
		boolean run = true;
		for (int i = 0; i < name.length(); i++) {
			char a = name.charAt(i);
			if (a < 0xAC00 || a > 0xD7AF) {// 한글유니코드 범위 확인
				System.out.println("오류 : 한글로 입력해주세요!");
				break;
			} // if end
			else if (a >= 0xAC00 && a <= 0xD7AF) {
				run = false;
			}
		} // 이름 한글인지 확인하기
		return run;

	}// 아이디 체크 method end

	private boolean checkPhoneNum(String phoneNum) {// 전화번호 8자리 확인
		boolean run = true;
		for (int i = 0; i < phoneNum.length(); i++) {
			char y = phoneNum.charAt(i);
			if (y < 48 || y > 57) {
				System.out.println("오류 : 숫자8자리를 입력해주세요");
				break;
			} else if(y>=48&&y<=57) {if (phoneNum.length() == 8) {
				run = false;
			} else {
				System.out.println("오류 : 숫자8자리를 입력해주세요");
			}}
		} // for end
		
		
		return run;
	}// 전화번호 확인 method end
	
	private void checkPhoneNum2(Long phoneNum2) {// 전화번호 중복확인
		NonFinancial nonFinancial = new NonFinancial();
		try {
	for(int i=0;i<nonFinancial.getNFs().length;i++) {
		
			if(nonFinancial.getNFs()[i]!=null) {
				if(nonFinancial.getNFs()[i].getPhoneNum()==phoneNum2) {
					System.out.println("중복확인 : 해당 핸드폰 번호로 가입된 계좌가 존재합니다.");
					System.out.println("메인메뉴로 이동합니다.");
					BankExam.main(null);
					break;
				}
				
			}//if end
			
			
		}//for end
		}catch(NullPointerException e) {}
		System.out.println("중복확인 : 해당 번호로 가입이 가능합니다.");
		
		
	}//전화번호 중복확인 method end
	

	private boolean checkresiNum(String resiNum) {// 주민번호 13자리 확인
		boolean run = true;
		for (int i = 0; i < resiNum.length(); i++) {
			char y = resiNum.charAt(i);
			if (y < 48 || y > 57) {
				System.out.println("오류 : 숫자13자리를 입력해주세요");
				break;
			}
		} // for end
		if (resiNum.length() == 13) {
			run = false;
		} else {
			System.out.println("오류 : 숫자13자리를 입력해주세요");
		}
		
		return run;
	}// 전화번호 확인 method end

	public void resister2() {//회원가입2
		Financial financial = new Financial();
		System.out.println("========= HJ 은행 =========");
		System.out.println("회원가입2>");
		boolean run=true;
		String accountNum="";
		while(run) {
		System.out.print("사용하실 계좌번호의 비밀번호 4자리를 입력해주세요 : ");
		accountNum = sc.next();
		run=checkAccountNum(accountNum);
		}//while end
		boolean run2=true;
		while(run2) {
		System.out.print("다시 한 번 비밀번호 4자리를 입력해주세요 : ");
		String accountNum2 = sc.next();
		run2=checkAccountNum2(accountNum,accountNum2);
		int pw = Integer.parseInt(accountNum2);
		financial.setPw(pw);
	
		}//while end
		
		boolean run3=true;
		while(run3) {
		System.out.println("계좌의 일일 이체 및 출금한도를 정해 주세요");
		System.out.println("*만원 단위로 입력 가능하며 최대 1억까지 설정이 가능합니다. ");
		System.out.println("*1억원 이상의 한도설정을 원하시면 가까운 지점에 방문해 주세요");
		System.out.print("한도입력(단위 : 만원) : ");
		long a = sc.nextLong();
		run3=financial.setAccountLimit(a);}//while end
		financial.setFinancials(financial);
		System.out.println("정상적으로 평생계좌 가입이 완료되었습니다.");
		System.out.println("계좌번호는 핸드폰번호와 같습니다.");
		
	}//회원가입2 method end
	
	private boolean checkAccountNum(String accountNum) {// 비밀번호 4자리 확인
		boolean run = true;
		for (int i = 0; i < accountNum.length(); i++) {
			char y = accountNum.charAt(i);
			if (y < 48 || y > 57) {
				System.out.println("오류 : 숫자4자리를 입력해주세요");
				break;
			}
		} // for end
		if (accountNum.length() == 4) {
			run = false;
		} else {
			System.out.println("오류 : 숫자4자리를 입력해주세요");
		}
		
		return run;
	}// 전화번호 확인 method end

private boolean checkAccountNum2(String accountNum,String accountNum2) {//비밀번호 재확인
	boolean run2 = true;
	if(accountNum.equals(accountNum2)) {run2=false;}
	else {System.out.println("오류 : 비밀번호가 일치하지 않습니다!");}
	
	return run2;
}//비밀번호 재확인 method end

private void menual() {//약관
	System.out.println("제1조(목적) \r\n"
			+ "이 약관은 고객이 한국투자증권 주식회사(이하 “회사”라 합니다.)에 계좌를 개설하고 거래를 함에 있어 필요\r\n"
			+ "한 모든 사항을 정함을 목적으로 합니다.\r\n"
			+ "\r\n"
			+ "제2조(용어의 정의)\r\n"
			+ "이 약관에서 사용하는 용어의 정의는 다음과 같습니다.\r\n"
			+ "1. 종합계좌 : 고객이 회사가 취급하는 상품을 거래하기 위해 고객명의로 개설된 모든 상품계좌를 종합\r\n"
			+ "적으로 관리할 수 있는 개설하는 계좌를 말합니다.\r\n"
			+ "2. 상품계좌 : 종합계좌내에 개설된 개별적인 상품(주식, 선물옵션, 해외선물, FX마진, 그 밖의 금융투자상\r\n"
			+ "품 등)을 거래하기 위해 실명을 확인하여 개설하는 계좌를 말합니다.\r\n"
			+ "3. 잔고번호 : 상품계좌 내의 수익증권, RP, 신탁 등의 상품 잔고를 관리하는 단위를 말합니다.\r\n"
			+ "4. 비밀번호 : 종합계좌에 대한 거래 시 보안을 위하여 고객이 설정한 일련의 숫자 조합을 말합니다.\r\n"
			+ "5. 바이오정보 : 지문 , 얼굴 , 홍채 , 정맥 , 음성 등 개인을 식별할 수 있는 신체적 또는 행동적 특징에\r\n"
			+ "관한 정보로서 그로부터 가공되거나 생성된 정보를 포함합니다.\r\n"
			+ "6. 바이오인증 : 바이오인증이 가능한 자동화기기(이하 “스마트ATM”이라 합니다)에서 취득한 고객 바이\r\n"
			+ "오정보를 이용하여 인증기관(고객의 바이오정보를 보관하고 있는 기관 또는 금융결제원)을 통해 고객\r\n"
			+ "을 인증하는 방식을 말합니다.\r\n"
			+ "7. 자동화기기 : 당사,타사 및 부가가치통신망 사업자의 현금자동지급기(CD), 현금자동입출금기(ATM), 스\r\n"
			+ "마트ATM 등을 말합니다.\r\n"
			+ "8. 은행연결계좌번호 : 회사가 고객의 이체입금의 편의를 도모하기 위하여 회사와 업무제휴계약을 체결을 말합니다.");
	System.out.println("================================================");
	System.out.println("위 사항을 확인하였고, 동의하신다면 \"동의합니다\"를 입력해주세요");
	System.out.print("입력 : ");
	String a = sc.next();
	if(!a.equals("동의합니다")){
		System.out.println("동의하지 않으시면 가입이 불가한 상품입니다.");
		BankExam.main(null);}
	
}//약관 method end

}// class end
