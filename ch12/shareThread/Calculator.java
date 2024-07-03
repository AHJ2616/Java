package ch12.shareThread;

public class Calculator {//동기화가 되는 계산기
	//필드
	private int memory;

	//메서드
	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {// synchoronized는 임계영역 생성
		this.memory = memory;
		try {
			Thread.sleep(2_000);
		} catch (InterruptedException e) {
			System.out.println("2초 딜레이중 예외 발생");
		}//catch end
		System.out.println(Thread.currentThread().getName()+" : "+this.memory);
		//2초 후 메모리 필드값 출력
	}//method end
	
	
}//class end
