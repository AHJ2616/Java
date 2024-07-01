package ch04;

import java.util.*;

public class DoWhileExam {

	public static void main(String[] args) {
		// do while 문을 이용해서 up and down 게임 만들기

		Scanner s1 = new Scanner(System.in);
		int answer = (int) (Math.random() * 50) + 1; // 1-50 랜덤 integer 1개 생성
		int count = 3; // try 횟수
		int question = 0; // 사용자 입력값 변수

			System.out.println("1-50사이의 숫자를 입력하세요.");
			System.out.println("3회안에 정답을 맞추면 보상이 있습니다");
			
			do {
			System.out.println("남은기회 : " + count);
			//System.out.println("정답 : " + answer); 정답맞추는 상황 test 코드
			System.out.print(">>>");
			question = s1.nextInt(); // 사용자가 키보드로 입력한 숫자 저장

			if (question > answer) {
				System.out.println("DOWN");
			} else if (question < answer) {
				System.out.println("UP");
			}
			count--;
			if (count <= 0) {
				System.out.println("도전실패!");
				break;// 카운트가 0이 되면 do while문 탈출?
			} 

		} while (question != answer);// 랜덤숫자와 사용자 입력값이 다르면 true, 같으면 false
		// do-while문 end

		if (question == answer) {
			System.out.println("정답입니다!");
		}
		System.out.println("정답 : " + answer);
		s1.close();

	}

}
