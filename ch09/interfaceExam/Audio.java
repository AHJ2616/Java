package ch09.interfaceExam;

public class Audio implements RemoteControl {//리모컨 인터페이스를 사용하는 구현체 class

	//필드
	private int volume; //볼륨값
	
	//기본 생성자
	
	
	//메서드
	
	@Override//재정의
	public void turnON() {
		System.out.println("Audio전원을 켭니다");
		
	}//method end

	@Override
	public void turnOff() {
		System.out.println("Audio전원을 끕니다");
		
	}//method end

	
	@Override
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME) {
			this.volume=MAX_VOLUME;
			
		}//if end
		else if(volume<MIN_VOLUME) {
			this.volume=MIN_VOLUME;
			
			
			
		}//else if end
		else {
			this.volume=volume;
		}//else end
		System.out.println("현재 Audio의 볼륨 : " + volume);
	}//method end

}//class end
