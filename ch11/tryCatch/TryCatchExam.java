package ch11.tryCatch;

import java.util.Scanner;

public class TryCatchExam {

	public static void main(String[] args) {
		// 예외처리문의 기본은 try- catch - finally 순이다.
		// try : 예외발생이 가능한 코드
		//cathch : 예외발생시 처리할 코드
		//finally : 항상 실행시킬 코드
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class clazz = Class.forName(scanner.next());
			System.out.println("Class가 존재합니다");
		}//예외발생 가능한 코드
		
		catch (ClassNotFoundException e) {
			System.out.println("class가 존재하지 않습니다");
			e.printStackTrace();
		}
		finally {System.out.println("프로그램이 종료됩니다.");}
		

	}//main method end

}//class end
