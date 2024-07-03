package ch12.threadTest;

public class TestExam {

	public static void main(String[] args) {//main thread
		Runnable task = new Task(); //다형성 |Task타입으로 해도 될듯
		//Runnable 타입의 변수명 task에 Task()객체를 사용하는 인스턴스 생성
		
		Thread th = new Thread(task);
		//Thread 타입의 변수명 th에 task를 활용하여 스레드 객체를 생성 한다. -> 새로운 스레드가 만들어짐
		
		th.start();//쓰레드 시작 키워드
		
		System.out.println("-------------------");
		System.out.println("익명의 구현체 사용");
		Thread anonymousTh = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("익명의 구현체로 스레드가 생성됨.");
				
			}
		});
		anonymousTh.start();
		
	}//main method end

}//class end
