package ch06.television;

//instance : 객체마다 다른값을 갖는다
//static : 모든 인스턴스에서 같은 값을 공유한다 , new 사용 X


public class Television {
	//필드
	int field1;//인스턴스
	static int field2;//스테틱
	
	//생성자
	
	//메서드
	void method1() {
		field1 = 10;
		field2 = 20;
		
	}//method1 end
	
	static void method2() {
		//field1 = 10;
		field2 = 20;
		
	}//nethod2 end

	static void method3() {
		Television television = new Television();
		television.field1 = 10;
		television.method1();
		
		//field1 = 10; 작동 X
		//method1(); 작동 X
		
		field2=20;
		method2();
		
		
		
	}//method3 end
}// class end
