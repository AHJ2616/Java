package ch04;

public class SwitchExam {

	public static void main(String[] args) {
		// Switch문은 동등비교문으로 괄호안의 값과 같은 case를 찾아 처리한다.
		// 비교값이 많은 경우 활용한다.
		
		int num1 = (int)(Math.random()*6)+1; // 1~6사이 랜덤값을 int형 num1에 넣는다. Math.random은 double이 기본형
		
		switch(num1) {
		case 1 : System.out.println("1번 주사위가 나왔습니다.");
		break;
		case 2 : System.out.println("2번 주사위가 나왔습니다.");
		break;
		case 3 : System.out.println("3번 주사위가 나왔습니다.");
		break;
		case 4 : System.out.println("4번 주사위가 나왔습니다.");
		break;
		case 5 : System.out.println("5번 주사위가 나왔습니다.");
		break;
		case 6 : System.out.println("6번 주사위가 나왔습니다.");
		break;//switch문을 빠져나온다.
		default : System.out.println("오류번호 : 01");
		}//switch end
		
		System.out.println("검증코드"+num1); //검증코드를 만들어서 테스트 한 후에 배포시, 코드긁어서 주석처리 하기.
 
	}//main 메서드 end

}//class end
