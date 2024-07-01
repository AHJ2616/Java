package ch01;

public class VarialbeExam {

	public static void main(String[] args) {
		// 리터럴 값을 변수로 출력하는 학습진행
		
		int mach ;
		int distance ;
		mach = 340 ;
		distance = mach * 60 * 60 ;
		System.out.println("소리가 1시간 동안 가는 거리 : " + distance + " m/s");
		//정수 리터럴 계산 후 출력 -> 정수는 +/- 21억까지 계산이 가능하다.
		//long을 사용하면 한도가 늘어난다
		
		double radius ; //double은 실수 표현 변수
		double area ;
		radius = 10 ;
		area = radius * radius * Math.PI ; //Math.가 대문자인 이유는 자바에 내장된 class값이기 때문이다.
		System.out.println("반지름이" + radius + " 인 원의 넓이 = " + area);
		
	    char firstname ;
	    //char는 문자표현 타입'(문자)'
	    char middlename ;
	    char lastname ;
	    firstname = '안' ;
	    middlename = '희' ;
	    lastname = '준' ;
	    System.out.print(firstname);
	    System.out.print(middlename);
	    System.out.print(lastname);
	    //println은 줄바꿈 기능이 추가되어있다.

	}
}
