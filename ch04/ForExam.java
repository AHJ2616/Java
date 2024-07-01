package ch04;

public class ForExam {

	public static void main(String[] args) {
		//반복 횟수를 알고 있는 반복문에 사용한다.
		//for(초기화식;조건식;증감식){실행문1; 실행문2;}
		
		System.out.print("1~10까지 출력 : ");
		for(int i = 0 ; i<=10 ; ++i) { //++i를 사용해도 결과는 같은데 보통 i++로 사용한다.
			System.out.print(i +" ");
			
		}//for문 종료
		
		System.out.println();
		System.out.print("1~10까지 짝수만 출력 : ");
		for(int a=2 ; a<=10 ; a +=2){System.out.print(a + " ");}
		
		System.out.println();
		System.out.print("1~10까지 짝수만 출력(2) : ");
		for(int b=1 ; b<=5 ; b++){System.out.print(2*b + " ");}
		
		System.out.println();
		System.out.print("1~10까지 홀수만 출력 : ");
		for(int c=1 ; c<=10 ; c +=2){System.out.print(c + " ");}
		
		System.out.println();
		System.out.print("1~10까지 홀수만 출력(2) : ");
		for(int d=1 ; d<=5 ; d++){System.out.print((2*d-1) + " ");}
		
		System.out.println();
		int sum = 0;
		for(int e = 1; e<=100; e++) {sum += e;}
		System.out.print("1~100까지 합 : " + sum);
		
		
		
		

		
	}//main end

}//class end
