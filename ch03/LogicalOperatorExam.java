package ch03;

import java.util.Scanner;

public class LogicalOperatorExam {
	
	public static void main(String[] args) {
		// 논리 곱은 & , && 로 비교 boolean타입으로 결과를 산출한다.
		
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하시면 대소문자나 숫자를 판단합니다. : ");
		int charCode = input.nextInt();
		
		if(charCode>=65 && charCode <= 90) { //유니코드에서 65~90은 영어 대문자.
			System.out.println("입력값은 대문자 입니다." +(char) charCode);
		} 
		else if(charCode >= 97 && charCode <= 120) { //유니코드에서 97~120은 영어 소문자.
			System.out.println("입력값은 소문자 입니다." + (char) charCode);
		} 
		else if(!(charCode <48) && !(charCode>57)) {  // 유니코드에서 48~57은 숫자. NAND
			System.out.println("입력값은 숫자 입니다. " + (char) charCode);
		}
		else System.out.println("입력값은 대,소문자나 숫자가 아닙니다.");
		
		
		input.close();
		
		
	}

}
