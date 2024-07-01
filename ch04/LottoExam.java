package ch04;

import java.util.Scanner;

public class LottoExam {

	public static void main(String[] args) {
		// 정수 1~45범위에서 6개의 숫자를 입력받고 랜덤으로 나온 값을 생성한다.
		// 숫자 몇개가 맞은지 파악
		
		
		//1. 번호 입력받기
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("로또번호 6개를 1~45숫자범위에서 중복없이 입력해주세요 :");
		int num1 = s1.nextInt();
		System.out.print("첫번째 번호는" + num1 + "입니다");
		
		int num2 = s1.nextInt();
		System.out.print("두번째 번호는" + num2 + "입니다");
		
		int num3 = s1.nextInt();
		System.out.print("세번째 번호는" + num3 + "입니다");
		
		int num4 = s1.nextInt();
		System.out.print("네번째 번호는" + num4 + "입니다");
		
		int num5 = s1.nextInt();
		System.out.print("다섯번째 번호는" + num5 + "입니다");
		
		int num6 = s1.nextInt();
		System.out.print("여섯번째 번호는" + num6 + "입니다");
		
		s1.close();
		
		
		//2. 랜덤번호 생성하기
		int random1 = (int)(Math.random()*45) + 1;
		int random2 = (int)(Math.random()*45) + 1;
		int random3 = (int)(Math.random()*45) + 1;
		int random4 = (int)(Math.random()*45) + 1;
		int random5 = (int)(Math.random()*45) + 1;
		int random6 = (int)(Math.random()*45) + 1;
		
		
		//3. 숫자 비교하기
		int x = 0;
		if(num1==random1 ||num1==random2 ||num1==random3 ||num1==random4 ||num1==random5 ||num1==random6 )
		{++x;}
		if(num2==random1 ||num2==random2 ||num2==random3 ||num2==random4 ||num2==random5 ||num2==random6 )
		{++x;}
		if(num3==random1 ||num3==random2 ||num3==random3 ||num3==random4 ||num3==random5 ||num3==random6 )
		{++x;}
		if(num4==random1 ||num4==random2 ||num4==random3 ||num4==random4 ||num4==random5 ||num4==random6 )
		{++x;}
		if(num5==random1 ||num5==random2 ||num5==random3 ||num5==random4 ||num5==random5 ||num5==random6 )
		{++x;}
		if(num6==random1 ||num6==random2 ||num6==random3 ||num6==random4 ||num6==random5 ||num6==random6 )
		{++x;}
		
		
		//4.결과 발표하기
		System.out.printf(
				"\n===========================================\n"
				+ "추첨결과 이번주 당첨번호는 %d %d %d %d %d %d 입니다.\n"
				+ "입력하신 당신의 번호는 %d %d %d %d %d %d 입니다.\n"
				+ "===========================================\n",
				num1,num2,num3,num4,num5,num6,
				random1,random2,random3,random4,random5,random6);
		
		if(x==0 || x==1 || x==2) {
		System.out.println("맞힌 숫자가 " +x +"개 입니다");
		System.out.println("당첨이 안되었네요...");}
		
		else if(x==3) {System.out.println("축하합니다. 상금 5천원에 당첨되었습니다");}
		else if(x==4) {System.out.println("축하합니다. 상금 5만원에 당첨되었습니다");}
		else if(x==5) {System.out.println("축하합니다. 상금 1천만원에 당첨되었습니다");}
		else if(x==6) {System.out.println("축하합니다. 상금 50억원에 당첨되었습니다");}
		else {System.out.println("시스템 오류 발생");}
	}

}
