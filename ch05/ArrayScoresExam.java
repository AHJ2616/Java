package ch05;
import java.util.*;
public class ArrayScoresExam {

	public static void main(String[] args) {
		// 배열을 이용한 성적표 만들기
		//1.학생수를 파악한다(배열 범위) 
		//2.점수를 입력한다(배열 안에 값입력) 
		//3.총점과 평균을 구하여 출력한다

		Scanner input = new Scanner(System.in);
		
		System.out.println("\t\t\t성적표");
		System.out.print("학생수를 입력하세요 :\n>>>>");
		int students = input.nextInt();
		int[] scores = new int[students]; // 키보드로 입력받은 학생수길이의 배열 생성
		
		//배열 입력받을때 주로 사용한다.
		for(int i=0;i<scores.length;i++) { // length를 배열에 입력하면 배열의 길이를 알려준다. (students 입력받은것과 같다)
			System.out.println((i+1) +"번째 학생의 점수를 입력하세요");
			scores[i] = input.nextInt();
			
		}//for end
		System.out.println("입력된 점수 확인 : ");
		for(int i = 0;i<scores.length;i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		System.out.print("수정할 학생번호 입력\n>>");
		int select = input.nextInt();
		System.out.print("수정할 학생점수 입력\n>>");
		int score = input.nextInt();
		scores[select-1] = score ;
		int sum = total(scores);
		double ave = average(sum,students);
		
		
		
		
		System.out.println("총점 :" + sum+"\n평균값 :" +ave);
	}//main end

	static int total(int[] scores) {//총점 구하는 메서드
		int sum = 0;
		for(int i =0;i<scores.length;i++) {
			sum += scores[i];
			
		}
			
		return sum;
	}//total end
	
	static double average(int sum, int students) {//평균구하는 메서드
		double ave=0;
		ave = sum/students;
		return ave;
		
	}// average end
	
}//class end
