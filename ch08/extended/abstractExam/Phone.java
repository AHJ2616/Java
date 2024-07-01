package ch08.extended.abstractExam;
//abstract : 추상 , 추상적인
public abstract class Phone {

	//필드
	public String owner;
	//생성자
	public Phone(){};
	public Phone(String owner) {
		this.owner=owner;
	}
	
	//메서드
	public void turnOn() {
		System.out.println("전원을 켭니다");
		
	}//method end
	
	public void turnOff() {
		System.out.println("전원을 끕니다");
		
	}//method end
	
}//class end
