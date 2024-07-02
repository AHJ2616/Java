package ch09.interfaceExam;

public class RemoteAnonymusExam {
	//인터페이스에 구현체class를 만들지 않고 인터페이스의 익명객체를 만들어서 구현한다.
	
	public static void main(String[] args) {
		
		
	}
	
	
	RemoteControl remoteControl = new RemoteControl() {//1회용 익명class
		int volume;//익명 객체의 볼륨
		
		@Override
		public void turnOff() {
			System.out.println("익명으로 전원을 끕니다");
			
		}
		
		@Override
		public void turnON() {
			System.out.println("익명으로 전원을 켭니다");
			
		}
		
		@Override
		public void setVolume(int volume) {
			if(volume>MAX_VOLUME) {
				this.volume=MAX_VOLUME;
				
			}//if end
			else if(volume<MIN_VOLUME) {
				this.volume=MIN_VOLUME;
			
		}
		}
	};//1회용 인스턴스의 익명객체 end
	

	
}//class end
