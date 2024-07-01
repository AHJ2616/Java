package bank;
import java.util.*;
public class BankExam {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		bank.service.Security security = new bank.service.Security();//보안 서비스 클래스
		bank.service.Client client = new bank.service.Client();
		boolean run=true;
		while(run) {
		System.out.println("========= HJ 은행 =========");
		System.out.println("메인메뉴>");
		System.out.println("1.로그인\n2.평생계좌 가입\n3.프로그램 종료");
		System.out.println("==========================");
		System.out.print("> ");
		String select = sc.next();
		switch(select) {
		case "1" :System.out.println("미구현 상태입니다..");
			
			security.menuTryReset();//메뉴 선택 성공시 카운트횟수 리셋
			break;
		case "2" :
			client.resister();
			client.resister2();
			security.menuTryReset();//메뉴 선택 성공시 카운트횟수 리셋
			break;
		case "3" : System.out.println("프로그램을 종료합니다");
		default : 
		run=security.menuTry();
			break;
		
		
		}//switch end
		}//while end
		
	}//main method end

}//class end
