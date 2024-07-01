package ch04;

public class SwitchNoBreakExam {

	public static void main(String[] args) {
		//switch문에서 break 생략 예시
		//시간에 따른 스케줄 제공 프로그램
		int time = (int)(Math.random()*11)+8; // 8시~16시까지랜덤값
		
		
		System.out.println("현재시간 : "+ time+"시");
		switch(time) {
		case 9 : System.out.println("출석을 부르고 어제 배운내용을 복습합니다");
		case 10 : 
		case 11 :	System.out.println("교사와 실습을 진행합니다");
		case 12 :	System.out.println("응용 실습을 진행합니다");
		case 13 :	System.out.println("점심 식사시간 입니다");
		case 14 :	System.out.println("오후수업을 시작합니다");
		case 15 :	System.out.println("오후실습 시간입니다");
		case 16 :	System.out.println("집으로 귀가 합니다");
        break;
        default : System.out.println("일과 시간이 아닙니다");
		
		
		}//switch end
		

	}//mian 메서드 end

}//class end
