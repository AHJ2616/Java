package ch06.circle;

public class Circle2Exam {

	public static void main(String[] args) {
		//생성자 오버로딩
		Circle circle = new Circle(30);
		circle.name="안희준";
		
		
		circle.name= "이름"; //new Stinrg"이름" 이 편의적으로 개선됨
		double result = circle.getArea();
		System.out.println("이름 : "+circle.name);
		System.out.println("원의 반지름 : " + circle.radius);
		System.out.println("원의 넓이 : "+result);

	}//method end

}//class end
