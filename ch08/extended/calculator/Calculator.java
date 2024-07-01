package ch08.extended.calculator;

public class Calculator {//부모 클래스
	
	
	double areaCircle(double r) {//double 리턴값있는 method
		System.out.println("Calculator 객체의 areaCircle()메서드 결과");
		double result=3.141592*r*r;
		return result;
		
	}
	

}//class end
