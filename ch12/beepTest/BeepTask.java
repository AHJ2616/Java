package ch12.beepTest;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 객체화
		for(int i =0;i<10;i++) {
			toolkit.beep(); //경고음이 출력된다.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}//1초동안 대기 mile sec단위
			
		}//소리 for end
		
	}

}
