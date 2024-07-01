package bank.service;

public class Security extends bank.DTO.SecurityTools{//프로그램 보안에 대한 서비스

	public boolean menuTry() {//메뉴 카운트
		boolean run = true;//기본값
		menuTryNum++;//1회 카운트
		System.out.println(menuTryNum+"회 잘못 입력 하셨습니다.\n(5회이상 오류시 프로그램 강제종료)");
		if(menuTryNum>=5) {//5회 오류시 프로그램 종료
			run=false;
		}//if end
		return run;
		
	}//메뉴 카운트 method end
	
	public void menuTryReset() {//횟수 리셋
		menuTryNum=0;
		
	}//횟수 리셋 method end
	
	
}//class end
