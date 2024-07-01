package ch04;

import java.util.Scanner;

public class CarRunExam {

	public static void main(String[] args) {
		// 자동차 주행 프로그램 만들기
		//C : 시동을 건다
		//R : 계기판 정보 출력
		//U : 주행
		//D : 시동을 끈다
		Scanner s1 = new Scanner(System.in);
		boolean run = true; //변수 선언 및 초기값 설정 시동을 켠다.
		int speed = 0;
		final int MAX = 300;
		final int MIN = 0 ;
		System.out.println("차량이 입고 되었습니다.");
		System.out.println("시동이 켜집니다.");
		
		while(run) { //0. 1. 2. done
			System.out.println("==================================");
			System.out.println(" 0. 시동 끄기		1. 엑셀			");
			System.out.println(" 2. 브레이크		3. 멀티미디어		");
			System.out.println(" 4. 주유하기						");
			System.out.println("==================================");
			System.out.print(">>>>>");
			int sel = s1.nextInt();
			
			switch(sel) {
			
			case 0 : 
				System.out.println("시동을 끕니다.");
				run = false;
			break;
			case 1 : speed += 20;
			System.out.println("가속");
				if(speed>MAX) {speed = MAX;
					System.out.printf("300km/s 이상로는 가속 할 수 없습니다");
					}//if end
				System.out.printf("현재속도 : %d km/h\n",speed);
				break;
			case 2 :speed -= 20;
			System.out.println("감속");
				if(speed<MIN) { speed=MIN;
					System.out.printf("0km/s 이하로는 감속 할 수 없습니다");
				}//if end
				System.out.printf("현재속도 : %d km/h\n",speed);
				break;
			case 3 :
				System.out.println("멀티미디어");
				break;
			case 4 : 
				System.out.println("주유중");
				break;
			default : System.out.println("잘못 입력하셨습니다");	
			
			}//switch end
			
		}//while문 end
		System.out.println("시스템이 종료되었습니다.");

	}//main end

}//class end
