package ch08.extended.abstractExam;

public class PhoneExam {

	public static void main(String[] args) {
		
		
		//Phone phone = new Phone("안희준"); 추상Class는 인스턴스 생성이 불가능하다.
		// 사용하려면 실체class(구현 class)를 만들어서 상속받아서 활용해야 한다.
		
		SmartPhone smartPhone = new SmartPhone("안희준");
		smartPhone.turnOn(); //브모
		System.out.println(smartPhone.owner);//부모생성자
		smartPhone.internetSearch();//자식

	}//main method end

}//class end
