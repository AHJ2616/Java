package ch05;

public class ArrarCreatExam {

	public static void main(String[] args) {
		// 배열은 표 형식의 참조형 타입이다.
		// 변수타입[] 변수명 = new 변수명 [개수]
		// 변수명 = {값1,값2,값3} ;
		// 변수타입[] 변수명 = {값1,값2,값3} 으로도 사용 가능하다.
		
		int[] scores = {83,90,87}; // int형 배열 scores에 값 3개 저장 new가 생략되어있다.
		
		System.out.println(scores[0]);//scores 배열 0번째 인덱스 값 불러오기
		
		scores[0] = 100;
		System.out.println(scores[0]);
		scores = null; // scores 삭제
		
		scores = new int[3]; // 인덱스 0-2까지 있는 스코어 재 생산
		scores[0] = 100;

	}

}
