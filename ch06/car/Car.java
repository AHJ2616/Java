package ch06.car;

public class Car {
	//필드(멤버 변수)
	
	//고유 데이터
	String company; //제조사
	String model; //모델명
	String color; //색상
	int maxSpeed; //최대속도
	//상태
	int speed;//속도
	int rpm;//엔진 회전수
	boolean run; //시동
	//부품
	Body body;
	Engine engie;
	Tire tire;
	
	//생성자 기초값 Source -> Generate Constructor using fields
	public Car() {}//기본생성자 (항상 생략되어있다) 만들지 않는다면 하지만 아래에 생성자를 만들어서 자동으로 생성이 안되었다.
	
	
	public Car(String company, String model, String color, int maxSpeed, boolean run) {
		super();//상속에 관련된 메서드
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.run = run;
	}//생성자 end
	
	//method(동작)
		
	@Override //오버라이딩 : 재정의 시켜준다
	public String toString() {//toString : 테스트할때 쓰는 코드
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + ", run="
				+ run + "]";
	}
	
	

	
	
	
	

}//class end
