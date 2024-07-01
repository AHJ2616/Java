package ch04;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// If(조건식){실행문; 실행문;} (다중 실행문을 만들 수 있다. 실행문이 있는 중괄호를 블럭이라고 한다.)
		Scanner input = new Scanner(System.in);
		
		//등급만들기
		
		System.out.print("귀화의 평균을 입력하세요 : ");
		double score = input.nextDouble(); //실수를 화면에서 입력받아서 score에 저장
		input.close();
		
		char grade = 0;
		
		if(score>=90 && score<=100) {
			grade = 'A';
		}else if(score<90 && score>=80) {
			grade = 'B';
		}else if(score<80 && score>=70) {
			grade = 'C' ;
		}else if(score<70 && score>=60) {
			grade = 'D' ;
		}else{grade = 'F';}
		
		
		System.out.println("귀하의 평균점수는" + score +"입니다.");
		System.out.println("등급은" + grade +"입니다.");
		
		
		}

	}
