package ch12.beepTest;

import java.awt.Toolkit;

public class BeepExam {

	public static void main(String[] args) {
		//beep(소리) 와 자막이 동시에 나오는 프로그램 구현

		Runnable beepTask = new BeepTask();
		//beepTask 클래스 인스턴스
		
		Thread th = new Thread(beepTask);
		//Thread 클래스 인스턴스
		
		th.start();// thread 실행
		
		for(int i=0;i<10;i++) {
			System.out.println((i+1)+"번 beep");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}//1초동안 대기 mile sec단위
			
		}//자막 for end
		
	}//main method end

}//class end
