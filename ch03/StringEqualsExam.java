package ch03;

public class StringEqualsExam {

	public static void main(String[] args) {
		// String은 class이다.
		// class는 객체로 사용한다.
		String str1 = new String("내용");
		System.out.println("str1 : " + str1);
		
		String str2 = "내용"; // 위에 처럼 new를 사용해서 데이터를 넣는게 기본이지만 String에서 생략하여 사용 가능하다.
		//하지만 new를 쓰면 heap에 새로운 데이터를 저장하므로 변수의 주소가 바뀐다
		System.out.println("str2 : " + str2);
				
		System.out.println(str1 == str2);  // ==연산은 heap의 데이터가 아닌 stack의 주소를 비교하여 true,false를 나타낸다.
		
		System.out.println("str1.toSrting : " + str1.toString());
		System.out.println("str2.toSrting : " + str2.toString());
		//문자열 비교는 .equals() 메서드를 사용해야한다.
		
		System.out.println("str1.equals(str2) : " + str1.equals(str2));

	}

}
