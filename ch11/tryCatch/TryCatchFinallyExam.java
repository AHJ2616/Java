package ch11.tryCatch;

import java.util.Scanner;

public class TryCatchFinallyExam {

	public static void main(String[] args) {
	//String 타입의 숫자를 int로 변환
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		String data1 =sc.next();
		
		System.out.print("두 번째 숫자를 입력하세요 : ");
		String data2 =sc.next();
		
		try {
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		System.out.println(data1+" + : "+data2+" = "+(value1+value2));
		}//try end
		catch(NumberFormatException e) {System.out.println("숫자로 입력해주세요");};
		
	
		
	}//main method

}//class end
