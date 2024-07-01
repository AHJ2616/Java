package ch08.extended.vehicle;

public class Bus extends Vehicle {
	String type;//마을, 광역

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	public void busCard() {//버스카드
		
		System.out.println("승차권으로 판단합니다.");
		
	}//버스카드 method end
	
	
}//class end
