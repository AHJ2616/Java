package ch08.extended.calculator;

public class CalculatorExam {
	public static void main(String[] args) {

		//부모 class
		Calculator caluCalculator = new Calculator();
		double result = caluCalculator.areaCircle(20);
		System.out.println("부모.반지름 20의 원 넓이 :"+result);
		
		//자식 class
		Computer computer = new Computer();
		double result2 = computer.areaCircle(20);
		System.out.println("자식.반지름 20의 원 넓이 : "+result2);
		
		
	}//main method end
	
}//class end
