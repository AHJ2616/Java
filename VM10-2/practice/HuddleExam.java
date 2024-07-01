package practice;

import java.util.Scanner;

public class HuddleExam {

	public static void main(String[] args) {
		//정수 입력받아서 중간 값 구하기
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int a = s1.nextInt();	
		int b = s1.nextInt();		
		System.out.printf("입력하신 숫자는 %d 와 %d 입니다.\n",a,b);
		s1.close();
		
		if(a>=b) {for( ;b<=a;b++) {System.out.println(b + " ");} //if 와 for문 복합활용하기
			
		
		}//if문 end
		else {
			for( ;a<=b;a++) {System.out.println(a + " ");}
		}


	}//main end

}//class end
