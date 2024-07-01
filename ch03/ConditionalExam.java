package ch03;

import java.util.Scanner;

public class ConditionalExam {

	public static void main(String[] args) {
		// 삼항연산자 (조건식)?true:false -> if문을 간단히 처리하기 위해 활용된다.
		
		/*
		 * int score = 70; char grade = (score>90)?'A':(score>80)?'B':'C'; //
		 * if(score>90){A}else{B}와 같다. System.out.print(score + "점은" +grade+"등급입니다.");
		 */
		
		//90점 이상 A 59점 이하 F 로 Scanner 활용 만들기
		
		Scanner s1 = new Scanner(System.in) ;
		
		System.out.print("점수를 입력해 주세요 : ");
		int a = s1.nextInt();
		s1.close();
		
		char b = (a>=90)?'A':(a>=80)?'B':(a>=70)?'C':(a>=60)?'D':'F' ;
		
		System.out.println("당신의 점수는 " +a +"점으로 " + b +"등급 입니다.");

	}

}
