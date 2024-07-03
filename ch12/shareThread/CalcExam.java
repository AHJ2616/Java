package ch12.shareThread;

public class CalcExam {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		User1 user1 = new User1();
		user1.setCalculator(cal);
		user1.start();
	
		User2 user2 = new User2();
		user2.setCalculator(cal);
		user2.start();
		
		//Thread user1 과 user2 가 Calculator 객체 1개를 같이 공유하여서
		//user1것도 2초딜레이 와중에 값이 바뀌어서 user2의 설정값으로 바뀌게된다.
		

	}//main method end

}//class end
