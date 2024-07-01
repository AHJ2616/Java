package ch08.exteded.promotion;

public class ChildExam {
	
	public static void main(String[] args) {
	
		Child child = new Child();//자식 인스턴스 생성
		child.method1();
		child.method2();
		child.method3();
		
		Parent parent = child;
		//타입종류 타입명     객체명
		//Parent parent = new Child(I); 와 같다
		System.out.println("=======자동타입변환 : 자식이 부모로=========");
		parent.method1(); //부모 메서드
		parent.method2(); // 자식 메서드(자동타입변환)
		//parent.method3(); //부모타입이어서 자식타입 사용 불가
		
		//부모타입에서 메서드를 다 만든 뒤에 부모에 자식을 연결시켜서 다형성으로 이용
		
	}//main method end
}//class end
