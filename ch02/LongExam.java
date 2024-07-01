package ch02;

public class LongExam {

	public static void main(String[] args) {
		// long타입은 8Byte 값을 갖는다.
		// long타입 초기값 입력시 정수 뒤에 소문자l 또는 대문자L을 붙여 사용한다. (int와 차이를 주기위해, 그리고 대부분 대문자L을 선호함)
		// 금융에 관련된 애플리케이션 개발에 사용된다.

		long var1 = 10 ;  // 정수값이 int범위에 있으면 L을 생략가능 하다.
		long var2 = 20L ;
		long var3 = 222222222222222L ;
		long var4 = 1_000_000_000L ; //jdk7버전 이후 문법 1,000,000,000등 콤마표시를 프로그래밍에서는 밑줄기호(_)로 표기하고 결과에 지장이 없다.
		System.out.println(var4);
		
	}

}
