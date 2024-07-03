package ch12.threadTest;

public class Task implements Runnable {	//멀티스레드 구축하는 방법(1) Runnable 인터페이스를 사용하여 구현체로 만든다

	@Override	//Runnable 인터페이스에서 만든 method를 재정의 해야한다.
	public void run() {
		//스레드로 만들 코드를 개발자가 작성하면 실행이 된다.
		
		System.out.println("implements Runnable 인터페이스의 run()이 실행됩니다.");
		
	}//method end
	
}
