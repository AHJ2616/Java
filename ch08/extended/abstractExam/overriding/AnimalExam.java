package ch08.extended.abstractExam.overriding;

public class AnimalExam {//service class

	public static void main(String[] args) {
		//추상 메서드 활용
		System.out.println("--------Dog 자식 객체(구현클래스)------------");
		Dog dog = new Dog();
		dog.kind="포유류";
		dog.breath();
		dog.sound();
		System.out.println("종 : " +dog.kind);
		System.out.println("--------Cat 자식 객체(구현클래스)------------");
		Cat cat = new Cat();
		cat.kind="포유류";
		cat.breath();
		cat.sound();
		System.out.println("종 : " +cat.kind);

		System.out.println("변수의 자동타입변환 테스트");
		
		Animal animal = null;
		animal = new Dog(); // 자동 타입 변환
		animal.sound();
		
		animal = new Cat(); // 자동 타입 변환
		animal.sound();
		//객체의 다형성
		animalSound(new Dog());
		
		
		
	}//main method end

	
	public static void animalSound(Animal animal) {//매개변수의 다형성
		animal.sound();
		
		
	}
	
}//class end
