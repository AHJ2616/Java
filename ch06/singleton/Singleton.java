package ch06.singleton;

public class Singleton {
	//개발자가 강제로 객체 1개만 만들고 싶을때 사용하는 이름(보안이 필요한 업데이트 관리자 계정등에 활용한다)
	//외부에서 mew연산자로 생성자를 호출 할 수 없게 막아야한다. (private 사용)
	
	//필드
	private static Singleton st = new Singleton();
	
	//생성자
	private Singleton() {
		
		
	}//기본 생성자, private으로 다른클레스에서의 접근 제한
	
	
	//메서드는 외부(같은 패키지, 다른 클레스)에서 사용가능
	static Singleton getInstance() {
		
		return st;
	}//getInstance method end
	

}//class end
