package ch04;

public class ForEachExam {

	public static void main(String[] args) {
		// for each는 인덱스 숫자 사용 X, 처음부터 배열변수의 마지막까지 실행시킨다.
		
		int[] scores = new int[] {95,71,84,93,87};
		for(int i : scores) { //배열의 처음부터 마지막까지 반복하여 값을 i에 넣는다.
			System.out.println("값 : " + i); // scores[i]가 아니라 i에 바로 넣음
			
			
			
		}//for end
String[] name = new String[] {"MBC" , "Academy" , "computer" ,"center"};
for(String i : name){ //배열의 처음부터 마지막까지 반복하여 값을 i에 넣는다.
	System.out.println("값 : " + i); }// scores[i]가 아니라 i에 바로 넣음

		
	}

}
