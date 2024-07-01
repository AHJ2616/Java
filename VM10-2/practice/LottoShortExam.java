package practice;

import java.util.Scanner;

public class LottoShortExam {

	public static void main(String[] args) {
		
		//1 - 20까지 숫자에서 6개의 당첨숫자를 갖고 있는 로또를 제작한다
		int num1 = (int) (Math.random()*20)+1;
		int num2 = (int) (Math.random()*20)+1;
		int num3 = (int) (Math.random()*20)+1;
		int num4 = (int) (Math.random()*20)+1;
		int num5 = (int) (Math.random()*20)+1;
		int num6 = (int) (Math.random()*20)+1;
		
		Scanner s1 = new Scanner(System.in);
		int mynum = 0, correct = 0; // mynum : 입력값 , correct : 당첨된 숫자
		System.out.print("1 - 20 사이의 숫자 6개를 입력해 주세요.");
		for(int i=0; i<6 ; i++ ) {
			mynum = s1.nextInt();
		/*1번*/if(mynum>=1&&mynum<=20) {
			
		/*2번*/if(mynum==num1 |mynum==num2 |mynum==num3 |mynum==num4 |mynum==num5 |mynum==num6){correct++;}//2번if문 end
			
		}//1번if문 end
		else {System.out.printf("입력갑이 잘못 되었습니다\n다시입력해주세요");
	    i--; } //처리 안해주면 잘못입력한것도 6개중 1개로 카운트 해버린다. n회차 -1 에서 for문 앞으로 돌아가면 +1이 되므로 n회차에 무한히 머무른다.
		}//for문 end
		s1.close();
		
		System.out.println();
		System.out.printf("로또번호는 %d %d %d %d %d %d 입니다.\n당첨된 갯수는 %d개 입니다.",num1,num2,num3,num4,num5,num6,correct);

		
	}//main end

}// class end
