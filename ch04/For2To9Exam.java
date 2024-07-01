package ch04;

public class For2To9Exam {

	public static void main(String[] args) {
		// 구구단표 작성하기
		//for문 안쪽에 for를 또 작성하면 바깥쪽의 for가 돌면서 안쪽 for문이 돈다.
		//{}실행블럭을 조심하여라. for {for}
		//graffic code(RGB)등을 처리할때 주로 for문을 사용한다. 그림 필터,회전,컷 등
		//표를 작성할때 많이사용한다.
		
		/*1번*/for(int m = 2 ; m<=9 ; m++ ) {
			System.out.printf("===========%d단===========\n",m);
			
			/*2번*/for(int n = 1 ; n<=9 ; n++) {
				System.out.printf("%d X %d = %d\n",m,n,(m*n));
				}//2번for문 end
		}//1번for문 end
		
		for(int x = 2 ; x<=9 ; x++) {
			System.out.printf("================%d단================\n",x);
			for(int y = 1 ; y<=9 ; y+=3) {
			System.out.printf("%d X %d = %d   %d X %d = %d   %d X %d = %d\n",
					x,(y),x*(y),x,(y+1),x*(y+1),x,(y+2),x*(y+2));
			}
			
		}
		
		

	}//main end

}//class end
