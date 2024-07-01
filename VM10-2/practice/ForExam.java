package practice;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		// 10개의 정수를 입력받아서 그중 짝수가 몇개인지 알아보기
		System.out.print("양의 정수 10개를 입력해 주세요");
		Scanner s1 = new Scanner(System.in);
		int a2 = 0, a3=0; //a2= 짝수 갯수 a3= 홀수 갯수
		for(int a = 0; a<10 ; a++) {
			int b = s1.nextInt();
			if(b%2==0) {a2++;}else {a3++;}
			
			
		}//for문 end
		s1.close();
		System.out.println("입력하신 정수 중에서 짝수는 " +a2 +"개, 홀수는 " +a3 + "개 입니다.");
		

	}//main end

}//class end
