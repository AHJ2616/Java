package ch09.interfaceExam;
import java.util.*;
public class RemoteExam {
private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 인터페이스를 받아서 이용해본다.
		RemoteControl.changeBattery();
		/*
		 * Television tv = new Television();//구현체 class
		 * 
		 * tv.turnON(); tv.turnOff();
		 */
		
		System.out.println("리모컨 인터페이스를 사용합니다.");
		boolean run = true;
		RemoteControl rc=null; //인터페이스 인스턴스 생성(초기값 없음)
		
		
		while(run) {
		System.out.println("--------------------");
		System.out.println("1.TV\n2.Audio\n3.SmartTV\n4.종료");
		System.out.println("--------------------");
		System.out.print("입력 : ");
		String select = sc.next();
		switch(select) {
		case "1" :
			rc = new Television(); // rc를 TV로 변경 (다형성)
			rc.turnON();
			rc.turnOff();
			rc.setMute(true); //음소거 on
			rc.setMute(false); //음소거 off
			break;
		case "2" :
			rc = new Audio(); // rc를 Audio로 변경
			rc.turnON();
			rc.turnOff();
		break;
		case "3" :
			rc=new SmartTV();
			rc.turnON();
			rc.turnOff();
			Searchable se = new SmartTV();
			System.out.println("인터넷 검색을 시작합니다.");
			se.search(sc.next());
			
		break;
		case "4" : run=false;
		break;
		default : System.out.println("오류 : 다시 입력해 주세요");
		}//switch end
	
		}//while end
	}//main method end

	
}//class end
