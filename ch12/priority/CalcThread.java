package ch12.priority;

public class CalcThread extends Thread {
	
	public CalcThread(String name) {
		setName(name);
		
	}
	
	@Override
	public void run() {//run method
			for(int i =0;i<2_000_000_000;i++) {
				
				
			}//for end
			System.out.println(getName());
	}//method end
	
}//class end
