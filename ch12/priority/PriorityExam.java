package ch12.priority;

public class PriorityExam {

	public static void main(String[] args) {
		//스레드를 10개 만들어서 우선순위를 준 스레드가 먼저 실행 되는지 확인한다.
			
		for(int i=1;i<=10;i++) {
		Thread th = new CalcThread("Thread "+i); //객체가 생성되면서 이름이 만들어 진다.
		if(i!=10) {th.setPriority(Thread.MIN_PRIORITY);}
		else if(i==10) {th.setPriority(8);}//1-10까지 정수값을 입력해도 된다.
			
		th.start();
		}//for end
		

	}//main method end

}//class end
