package ch04;

public class WhilePrintExam {

	public static void main(String[] args) {
		// while(true)이면 무한 반복 한다. -> while(false)이면 종료
		// 반복횟수가 정해지지 않은 반복문일때 사용된다. ex) 메뉴title (관리자에 의한 종료)
		
		int i = 1;
		while(i<=10){ 
			System.out.print(i + " ");
			i++; // 증감식 위치에 신경쓰기!
		}//while문 end
		System.out.println(); // 줄바꿈
		System.out.println("프로그램이 정상 종료 되었습니다");
	}

}
