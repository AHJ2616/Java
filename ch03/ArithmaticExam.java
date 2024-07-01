package ch03;

public class ArithmaticExam {

	public static void main(String[] args) {
		// 이항 연산자는 자동타입 변환을 한다.
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1 : " + result1);
		
		int result2 = v1 - v2 ;
		System.out.println("result2 : " + result2);
		
		double result3 = v1 / v2 ;
		System.out.println("result3 : " + result3);
		
		double result4 = (double) v1 / v2 ;
		System.out.println("result4 : " + result4);
		// 나누기 연산을 할 때 소수점을 고려해서 타입을 지정해야 한다.
		
		int x = 1_000_000 ;
		int y = 1_000_000 ;
		long z = x*y ;
		
		System.out.println(z); // x*y 자체에 강제변환 x
		
		System.out.println((long) x*y);
		
		System.out.println("소수점 정확한 계산은 float , double?");
		// 정확한 계산을 할때에는 부동소수점 타입은 사용하지 않는 것이 좋다.
		//예시) 1 - 0.7 = 0.3
		
		int apple = 1;
		double pieceUnit = 0.1 ;
		int piece = 7 ;
		
		double result = apple - piece*pieceUnit ; 
		System.out.println("정답 : " + result);
		
		double result21 = (apple*10 - (piece*10)*pieceUnit)/10 ; 
		System.out.println("정답2 : " + result21);
		
		int appleInt = 1 , totalPieces = 10 , number = 7 ;
		int temp = totalPieces*appleInt - number ;
		double resultInt = temp / 10.0 ;
		System.out.println("1-0.7을 정확하게 계산 하고 싶을때 : " + resultInt);
		
		int eng = 90;
		int sol = 80;
		int total = eng + sol ;
		
		System.out.println("총점 : " + total);
		
		System.out.println("총점 : " + 90+80); // 앞에가 문자이면 숫자가 계산이 안되고 문자열로 타입변환이 된다.
		
		
		
		

	}

}
