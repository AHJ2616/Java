package ch01;

public class RunStateExam {

	public static void main(String[] args) {
		/* 변수: 값이 들어가는 상자, 변수명은 한글로도 입력가능, 띄어쓰기는 안됨 */
		
		int x = 1 ; /* 정수타입(int) 변수 x에 정수 1값을 넣는다.*/
		double y = 2.3;
		double 결과값 = x + y ; /* 변수 reult에 x+y값을 더해 실수로 넣는다.
		                           실수타입(double)은 int + double도 호환이된다. 하지만 실수+실수 = 정수의 값이나와도 에러뜬다. */
		
		System.out.println("x + y = " + 결과값); /* ""문은 텍스트출력, ' + 문자형변수 입력시, 앞 문자열(여기에선 텍"x + y = ")에 값을 붙여준다' */
	}

}
