package ch13.generic;

public class Box<T> { // <T> 제네릭 코드로 타입을 정하고 시작한다.
	//위의 T가 String 이면?
	
	//필드
	private T t; //T 인스턴스 생성
	//t의 타입에따라 제네릭 코드가 변한다

	
	
	//생성자
	
	
	//메서드
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}//class end
