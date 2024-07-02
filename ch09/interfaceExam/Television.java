package ch09.interfaceExam;

public class Television implements RemoteControl {//리모컨 인터페이스를 사용하는 구현체 class

	//필드
	private int volume; //볼륨값
	
	//기본 생성자
	
	
	//메서드
	
	@Override//재정의
	public void turnON() {
		System.out.println("TV전원을 켭니다");
		
	}//method end

	@Override
	public void turnOff() {
		System.out.println("TV전원을 끕니다");
		
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
		System.out.println("현재 TV의 볼륨 : " + volume);
	}//method end

	@Override
	public void setMute(boolean mute) {
		
		if(mute==true) {
			System.out.println("TV를 음소거 합니다");
		}//if end
		else {
			System.out.println("TV 음소거를 해제합니다");
		}
	
	}//method end
	
	

}//class end
