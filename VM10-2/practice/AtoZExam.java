package practice;

public class AtoZExam {

	public static void main(String[] args) {
		// 영어 대문자 A부터 Z까지 출력한다. 응용 해서 소문자도.
		
		char a = 'A'; char b = 'a';
		for(   ;a<=90 && b<=122;a++,b++) {System.out.println(a + " " + b + " ");} //유니코드에서 A:65 Z:90 , a:97 z:122
		//for(초기화식;조건식;증감식) 응용
		//1. 초기화식이 for문전에 선언 되어있다면 생략가능하다.
		//2. for(초기화식a , 초기화식b ; 조건식a & 조건식b ; 증감식a , 증감식b) 으로 복수 사용 가능하다.
		//3. 조건식에서 char을 숫자 조건과 비교하였을때는 유니코드에 있는 숫자값을 따른다.

	}

}
