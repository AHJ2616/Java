package ch08.extended.abstractExam.overriding;

public abstract class Animal {//추상 class

	//필드
	public String kind;
	
	
	//생성자
	
	
	
	//메서드
	public void breath() {
		System.out.println("숨을 쉽니다");
		
	}//breath method end
	
	public abstract void sound(); //abstract 메서드는 {} 실행문이 없다. (시그니처 통일용)
	
	
	
}//class end
