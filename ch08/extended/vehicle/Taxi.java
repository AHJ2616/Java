package ch08.extended.vehicle;

public class Taxi extends Vehicle {
	String model;// 카카오 , T, 수원

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
	public void meter() {//택시 미터기
		System.out.println("요금을 측정합니다.");
		
	}//택시 미터기 method end

}// class end
