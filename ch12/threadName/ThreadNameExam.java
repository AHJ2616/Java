package ch12.threadName;

public class ThreadNameExam {

	public static void main(String[] args) {
		// thread이름을 정해놓으면 예외(버그) 수정이 좋다.
		
		Thread mainThread = Thread.currentThread();
		//사용중인 Thread객체 얻기
		
		System.out.println(mainThread.getName());
		//mainThread의 이름을 출력한다
		
		ThreadA threadA = new ThreadA();
		System.out.println("ThreadA().getName 값 : "+threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("ThreadB().getName 값 : "+threadB.getName());
		threadB.start();
		
	}//main method end

}//class end
