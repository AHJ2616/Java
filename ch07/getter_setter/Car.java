package ch07.getter_setter;

public class Car {
	
	//get set 을 이용하여 직접적인 접근을 막는다.
	//method를 통해서만 교환가능
	
	//필드
	private int speed;
	
	
	//생성자
	
	
	//메서드
	void setSpeed(int speed) {//입력용(setter)
		if(speed<0) {
			this.speed=0;
			return;
		}//if end
		else {this.speed = speed;}
		
		
		
	}//setSpeed method end
	
	double getSpeed() {// 출력용(getter)
		return this.speed*0.621371;
		
	}

}
