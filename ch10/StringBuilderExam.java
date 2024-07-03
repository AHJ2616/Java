package ch10;

public class StringBuilderExam {

	public static void main(String[] args) {
		//StringBuilder 는 StringBuilder보다 나중에 생긴 처리방법이다.(단일 스레드용)
		//구현에서 빠르기 때문에 우선적으로 활용한다.
		StringBuilder stringbuilder = new StringBuilder();// 16개 칸 문자열
		StringBuilder stringbuilder1 = new StringBuilder("Hello ");
				StringBuilder stringbuilder2 = new StringBuilder("Hello");
		
		stringbuilder1.append("Programming");
		System.out.println(stringbuilder1);
		stringbuilder1.insert(6,"Java ");
		System.out.println(stringbuilder1);
		stringbuilder1.replace(0, 5, "Good");
		System.out.println(stringbuilder1);
		stringbuilder1.delete(0, 4);
		System.out.println(stringbuilder1);
		stringbuilder1.reverse();
		System.out.println(stringbuilder1);
		
		System.out.println(stringbuilder2.equals("Hello"));// equals가 안먹힘.
		String x = stringbuilder2.toString();
		
		
	}//main method end
	
	
}//class end
