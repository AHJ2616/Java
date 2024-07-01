package ch04;

import java.util.Scanner;

public class SSNExam {

	public static void main(String[] args) {
		// 주민번호 7번째 번호를 입력받아 남 여 구분하기.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("주민번호 7번째 숫자를 입력 : ");
		byte ssn = input.nextByte();
		
		input.close();//Scanner end
		
		if(ssn==9) {
			System.out.println("귀하는 other그룹 입니다.");
		}
		else if(ssn==0) {
			System.out.println("번호를 잘못 입력하셨습니다.");
		}
		else if(ssn%2==1) {
			System.out.println("귀하는 남성 입니다.");
		}
		else if(ssn%2==0) {
			System.out.println("귀하는 여성 입니다.");
		}
		

	}//main메서드end

}//클래스end
