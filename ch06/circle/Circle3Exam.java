package ch06.circle;

public class Circle3Exam {

	public static void main(String[] args) {
		// 매게값이 2개인 생성자로 결과출력
		
		Circle circle = new Circle(30,"안희준");
		double result = circle.getArea();
		System.out.println("이름 : " + circle.name);
		System.out.println("반지름 : " + circle.radius);
		System.out.println("넓이 : "+ result);
		

	}

}
