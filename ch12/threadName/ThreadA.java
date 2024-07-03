package ch12.threadName;

public class ThreadA extends Thread{// implements Runnable 대신 Thread를 상속받아 사용
	
	public ThreadA() {//기본 생성자
		setName("ThreadA");//생성자에서 이름 set
		
	}

	@Override
	public void run() {
		for(int i=0; i<2;i++) {
			System.out.println(getName()+"가 출력한 내용");
			
		}
		
		super.run();
	}//run method end 
	

}
