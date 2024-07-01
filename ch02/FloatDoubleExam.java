package ch02;

public class FloatDoubleExam {

	public static void main(String[] args) {
		// float은 32bit double은 64bit 실수계산을 한다.
		// 부동소수점 연산기법을 사용한다.(지수부, 가수부)
		// float은 값뒤에 F를 붙여서 사용한다.
		// double은 flat보다 정확도가 높아서 많이 사용된다. (float은 다른언어와 호환을 위해 남겨놓음)
		
		double var1 = 3.14 ;  // double 사용시 D 또는 d 를 붙여도 되는데 생략가능하다.
		float var2 = 3.14F ;  // float 사용시 항상 F 붙여서 사용(생략불가능)
		
		//정밀도 테스트
		double var3 = 0.123456789123456789 ;
		float var4 = 0.123456789123456789F ;
		
		System.out.println(var3); // 소숫점 18자리까지 나오고 버림처리
		System.out.println(var4); // 소숫점 8자리까지 나오고 부동소수점 형식 계산에 따른 근사값처리
		
		

	}

}
