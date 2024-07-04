package ch13.generic;

public class BoxExam {
	//

	public static void main(String[] args) {
		// 제네릭은 <타입명>으로 해당 타입만 처리한다.(타입명이 객체가 될 수도 있다)
		
		Box<String> boxS = new Box<String>();
		boxS.setT("문자열");
		String name = boxS.getT();
		System.out.println(name);
		
		Box<Integer> boxI = new Box<>(); //new 에들어갈는 <>는 생략 가능(중복을 써야하니까)
		boxI.setT(1234);
		Integer age = boxI.getT();
		System.out.println(age);
	}//main method end
	
}//class end
