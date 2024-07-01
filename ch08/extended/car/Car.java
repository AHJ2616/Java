package ch08.extended.car;

public class Car {//부모 자동차
	//필드
	public int speed;
	
	
	
	
	//생성자
	public Car() {}
	
	
	
	//메서드
	public void speedUp() {
		speed += 1;
		
		
	}//메서드 호출시 속도 1 증가
	
	public final void stop() {
		System.out.println("자동차가 정지합니다");
		speed=0;
		
	}

}//class end
