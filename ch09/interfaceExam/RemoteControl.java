package ch09.interfaceExam;

public interface RemoteControl {
	//상수(생략가능 public,static,final) -> 초기값을 정해줘야 한다.
	int MAX_VOLUME = 10; //최대 볼륨
	int MIN_VOLUME = 0; //최소 볼륨
	
	
	//메서드(private or abstract or static)
	//default : new로 객체 생성 가능
	//abstract : 구현class에서 구현해야할 method(interface에 선언된 모든 method를 구현해야 한다)
	//static : new 없이 사용되는 method
	
	abstract void turnON();//abstract 생략 가능
	public void turnOff(); 
	public void setVolume(int volume); //int를 받아서 method 구현해야한다.
	//전원 on/off , 볼륨조절 method
	
	
	default void setMute(boolean mute) {//음소거
		if(mute==true) {
			System.out.println("음소거 합니다");
		}//if end
		else {
			System.out.println("음소거를 해제합니다");
		}
	}//method end
	
	static void changeBattery() {//건전지 교환
		System.out.println("건전지를 교환해야 합니다.");
		
	}//method end
	
}//interface end
