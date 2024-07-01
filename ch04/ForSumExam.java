package ch04;

import java.util.Scanner;

public class ForSumExam {

	public static void main(String[] args) {
		// 키보드로 입력받은 값을 반복해서 더해주는 코드 만들기
		
		Scanner s1 = new Scanner(System.in);
		
		int sum = 0; //결과값
		int x = 0 , y = 0 , x1 = 0; // 초기값 , 종료값 , 초기x값 저장용
		
		System.out.print("초기값 숫자를 입력하세요 : ");
		x = s1.nextInt();// 초기값 저장
		x1 = x;
		
		System.out.print("종료값 숫자를 입력하세요 : ");
		y = s1.nextInt(); // 종료값 저장
		
		s1.close();//스캐너 종료
		
		for(   ;x<=y;x++) {//초기값 선언(x,y등에 대해)이 되어있는경우 for()문 초기값을 생략가능하다.
			sum += x; //sum 은 x~y까지 정수들의 합
		}
		
		System.out.println(x1 +"부터" +y+"까지 더한 값 :"+sum); //x값을 사용하면 for문에서 증가된 값이 나오므로 x1사용
		

	}//mian end

}//class end
