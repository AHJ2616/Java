package ch09.interfaceExam.extend;

public class BirdExam {
	
	public static void main(String[] args) {//다중상속 테스트
		Flamingo flamingo = new Flamingo();
		flamingo.eat();
		flamingo.flying();
		flamingo.sound();
		
		System.out.println("================자동타입변환=================");
		Fly fly = flamingo; //up casting
		flamingo.breath();
		fly.flying();
		Animal animal = flamingo;
		animal.breath();
		
	}//main method end
	
}//class end
