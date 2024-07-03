package ch12.shareThread;

public class User2 extends Thread{
	
private Calculator calculator;
	
//메서드
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
		
	}//method end
	
	@Override
		public void run() {
			calculator.setMemory(50);
		}
	
}//class end
