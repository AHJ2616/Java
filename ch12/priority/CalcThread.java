package ch12.priority;

public class CalcThread extends Thread {
	//필드
	String sample = "sample";
	
	
	public CalcThread(String name) {//생성자
		setName(name);
		
	}
	
	@Override
	public void run() {//run method
		System.out.println(sample);
		example();
			for(int i =0;i<2_000_000_000;i++) {
				
				
			}//for end
			System.out.println(getName());
			
	}//method end
	
	public void example() {
		System.out.println("example");
		
	}
	
}//class end
