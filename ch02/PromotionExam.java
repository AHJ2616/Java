package ch02;

import java.util.Scanner; // import = 다른 패키지에 있는 코드를 가져온다.

public class PromotionExam {

	public static void main(String[] args) {
		// 자동타입변환(Promotion) byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
		// 작은 크기의 타입을 큰 크기의 타입으로 자동으로 변환시켜준다.
		
		// 국어, 영어, 수학, 사회, 과학 과목의 개별점수는 byte, 총점(total)은 int, 평균값은 double 로 자동변환 된다.
		
		byte kor = 0 ;
		byte eng = 0 ;
		byte math = 0 ;
		byte soc = 0 ;
		byte sci = 0 ;
		
		//키보드로 점수를 입력 받는 곳
		Scanner input = new Scanner(System.in) ; // 키보드로 입력 받는 객체 생성 -> import 라는 새로운 패키지가 생긴다.
		
		System.out.print("국어 점수 : ");          // input.next 는 스캐너 객체에서 키보드로 입력받은 값을 처리해준다.
		kor = input.nextByte();                  // 2줄짜리 코드가 한쌍으로.
		
		System.out.print("영어 점수 : ");
		eng = input.nextByte();            
		
		System.out.print("수학 점수 : ");
		math = input.nextByte();            
		
		System.out.print("사회 점수 : ");
		soc = input.nextByte();            
		
		System.out.print("과학 점수 : ");
		sci = input.nextByte();            
		
		if(kor > 100) {
			kor = 100;
		}
		
		System.out.println("         현재 점수표        ");
		System.out.println("=========================");
		System.out.println(" 국어 :  " + kor + "점");
		System.out.println(" 영어 :  " + eng + "점");
		System.out.println(" 수학 :  " + math + "점");
		System.out.println(" 사회 :  " + soc + "점");
		System.out.println(" 과학 :  " + sci + "점");
		
		int total = 0 ; // 연산시 기본 타입은 int로 자동타입변환
		total = kor + eng + math + soc + sci ;
		
		System.out.println("=========================");
		System.out.println(" 총점 :  " + total + "점");
		
		double avg = 0.0 ;
		avg = total /5 ;
		System.out.println(" 평균 :  " + avg + "점");
		
		if(avg >= 60) { //true
			System.out.println(" 합격(60점 이상)");
			
		}else { // false
			System.out.println(" 불합격(60점 이상)");
			
		}
		

	}

}
