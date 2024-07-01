package ch03;

import java.util.Scanner;

public class PrintfExam {

	public static void main(String[] args) {
		// printf 포멧팅용 출력을 한다.
		// 규격을 맞춰 프린트할때 활용한다.
		
		Scanner input = new Scanner(System.in) ;
		System.out.println("=========================");
		System.out.print("이름 : ");
		String name = input.next();
		
		System.out.print("나이 : ");
		int age = input.nextInt();
		
		System.out.print("평균 : ");
		double avg = input.nextDouble();
		
		input.close();
		System.out.println("=========================");
		System.out.printf("현재 당신의 이름은 %s\n당신의 나이는%d\n평균은 %f입니다.",name,age,avg); //%f -> double값 소숫점6자리 까지 출력
	}

}
