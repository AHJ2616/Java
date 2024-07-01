package ch06.circle;

public class Circle {// mian method가 없는 class는 library class라고 한다.

	// 필드(멤버 변수)
	public int radius;
	public String name;

	// 기본생성자 = Class와 이름이 같은 method Circle Circle = new Circle(){}와 같음
	public Circle() {
		// 매개값 X, 오버로딩 가능하다

	}// 기본 생성자

	public Circle(int radius) {
		this.radius = radius;//int로 받은값을 객체값으로 보내준다

	}// 기본생성자

//사용자 지정 생성자
	
	
	public Circle(int radius,String name) {//생성자 오버로딩
		this.radius = radius;
		this.name = name;
		//Circle circle = new Circle(10,"지구")
		
		//메서드(동작에 해당하는 코드)
		
		
	}
	public double getArea() {
		return 3.14*radius*radius;
		
	}//원의 값을 계산하여 출력

	
	

}// class end
