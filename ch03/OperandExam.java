package ch03;

public class OperandExam {

	public static void main(String[] args) {
		// 단항연산자 : 부호 연산자(+,-) 증감 연산자(++,--) 논리 부정 연산자(!) 비트 반전 연산자(~)
		// 비트 반전 연산사즌 0 -> 1 or 1 -> 0
		
		int x = -100 ;
		int result1 = +x ;
		int result2 = -x ;
		
		System.out.println(result1);
		System.out.println(result2);

		System.out.println("=====================");
		int a=10 , b=10 , c=0 ;
		
		a++ ;
		++a ;
		System.out.println("a = " + a );
			
		b-- ;
		--b ;
		
		System.out.println("b = " + b );
		
		System.out.println("=====================");
		
		   c = a++ ;
		//연산식의 순서: c=a 실행, a++ 실행
		System.out.println("a = " +a);
		System.out.println("c = " +c);
		c = ++a ;
		System.out.println("=====================");
		System.out.println("a = " +a);
		System.out.println("c = " +c);
		System.out.println("=====================");
		c = ++a + b++ ; // a가 영향받는것 ++a , b가 영향받는것 b++ , c가 영향받는것 c = ++a + b (24가아닌 23)
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		System.out.println("c = " +c);
		
		System.out.println("=====================");
	
		
		
	}

}
