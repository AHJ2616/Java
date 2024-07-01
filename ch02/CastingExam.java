package ch02;

public class CastingExam {

	public static void main(String[] args) {
		// casting은 강제 타입 변환으로 큰 타입을 작은 타입으로 변환할때 사용된다.
		// 단, 2진법에 영향을 받아서 손실이 발생 할 수 있다.
		
		int intValue = 12345678 ;
		byte byteValue = (byte) intValue ;
		
		System.out.println("int 값 : " + intValue);
		System.out.println("byte 값 : " + byteValue);
		
		System.out.println("======================");
		
		int intValue1 = 10 ;
		double doubleValue = 5.5 ;
		double result = intValue1 + doubleValue ;
		System.out.println("int 10 + double 5.5 = " + result);
		
		
		int result2 =  intValue1 + (int) doubleValue ; // (int) 로의 강제타입 변환은 영구적인게 아니다
		
		
		System.out.println("int 10 + double 5.5 = " + result2);
		
		double result3 = intValue1 + (int) doubleValue ;
		System.out.println("int 10 + double 5.5 = " + result3);
		
	}

}
