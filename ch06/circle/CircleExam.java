package ch06.circle;

public class CircleExam {

	public static void main(String[] args) {
		// 주메뉴가 되는 클래스
		
		Circle circle = new Circle(); //Circle 인스턴스 생성
		circle.name= "이름"; //new Stinrg"이름" 이 편의적으로 개선됨
		circle.radius=20; //값 입력완료
		double result = circle.getArea();
		System.out.println("원의 반지름 : " + circle.radius);
		System.out.println("원의 넓이 : "+result);

	}

}
