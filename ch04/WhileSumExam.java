package ch04;

public class WhileSumExam {

	public static void main(String[] args) {
		// 1-100 까지 정수의 합 구하기
		int a = 1 , sum = 0 ; //변수 선언 및 초기값 설정
		//while문 이후에 print해야 하므로 미리 선언한다.
		
		while(a<=100) {
			sum += a;
			a++;
			
		}//while문 end
		System.out.println("1-100까지 정수의 합 : " + sum);

	}//main end

}//class end
