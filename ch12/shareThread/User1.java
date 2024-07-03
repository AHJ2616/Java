package ch12.shareThread;

public class User1 extends Thread{
	
private Calculator calculator;
	
//메서드
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
		
	}//method end
	
	@Override
		public void run() {
			calculator.setMemory(100);
		}
	
}//class end
