package ch04;

public class IfDiceExam {

	public static void main(String[] args) {
		// if문 활용 주사윗값 추출
		//Math.random 메서드는 컴퓨터 시간의 초를 활용하여 난수를 만든다.(0 ~ 0.9999범위)
		
		int num = (int) (Math.random()*6) + 1 ; // 1~6사이 정수값이 랜덤으로 나온다.

		System.out.println("주사위 값 :"+ num);
	}

}
