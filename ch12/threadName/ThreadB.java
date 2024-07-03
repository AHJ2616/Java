package ch12.threadName;

public class ThreadB extends Thread{// implements Runnable 대신 Thread를 상속받아 사용
	
	public ThreadB() {//기본 생성자
		setName("ThreadB");
		
	}

	@Override
	public void run() {
		for(int i=0; i<2;i++) {
			System.out.println(getName()+"가 출력한 내용");
			
		}
		
		super.run();
	}//run method end 
	

}
