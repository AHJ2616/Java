package ch06.ranking;

import java.util.Scanner;

public class RankingExam {

	public static void main(String[] args) {
		//new 사용 안됨 
		
		Ranking rk = Ranking.VVVIP;//eNum인스턴스 생성

		System.out.println("enum 값 :"+rk);
		Scanner sc = new Scanner(System.in);
		String ss = sc.next();
		Ranking rk1 = Ranking.GUEST;
	Ranking rk2=Ranking.MEMBER;
	System.out.println(rk==rk1);
	System.out.println(rk==rk2);
	System.out.println(rk.equals(ss));
	//eNum 값은 eNum끼리만 비교가 가능하다.
	//eNum은 int나 String으로 비교 X
	
	//eNUm상수 -> String으로 변환
	String rkString = rk.name();//toString 과 같은 역할
	
	//eNum상수 -> int로 변환(순서파악 0부터 x번까지)
	int enumindex = rk.ordinal();
	System.out.println("열거순서 파악 : "+ enumindex);
	}

}
