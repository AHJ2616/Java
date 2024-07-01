package ch05;

public class ArraySortASCExam {

	public static void main(String[] args) {
		//오름차순 , 내림차순 정렬(버블 정렬 : 이웃간의 숫자를 여러번 비교하여 정렬시킨다)
		//필수항목 : 임시 배열이 필요하다(저장할 공간)
		
		int[] scores = new int[] { 79,88,91,33,100,55,95};

		
		for(int i=0;i<scores.length;i++){
				System.out.print(scores[i] + " ");}
		
		//오름차순 정렬 n개수중 max숫자를 맨 뒤로 보내고 n-1개중 max숫자 맨뒤로 보내고를 n(n-1)/2번 반복한다.
		
		for(int i = 0; i <scores.length-1 ; i++) {for(int k = 0;k<scores.length-1-i;k++) {// n(n-1)/2번 반복하는 for문
			if(scores[k]>scores[k+1]) {
			int temp = scores[k] ; scores[k] = scores[k+1] ; scores[k+1] = temp;}
			
			
		}//2번 for end
		}//1번 for end
		System.out.println("배열 결과값============");
		for(int i1=0;i1<scores.length;i1++){
			System.out.print(scores[i1] + " ");}
		
			
		
		

	}

}
