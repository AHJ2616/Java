package ch03;

import java.util.Scanner;

public class LogicalSumExam {

	public static void main(String[] args) {
		// 논리합(Or)은 | 또는 ||(파이프) 로 만든다. 
		
		Scanner input = new Scanner(System.in);
		
		//배수를 판단하는 프로그램 작성
		System.out.println("숫자를 입력해주세요");
		int value = input.nextInt(); //입력받은 값을 value변수에 저장
		
		input.close(); //Scanner 종료
		
		if(value%2==0 || value%3==0) {
			System.out.println("입력된 값은 2의 배수 이거나 3의 배수 입니다.");
		}
		
		
		

	}

}
