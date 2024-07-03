package ch10;

public class StringBufferExam {

	public static void main(String[] args) {
		//StringBuffer 예제
		//StringBuffer : 동기화 방식을 사용 (멀티 스레드)
		
		StringBuffer stringBuffer = new StringBuffer();// 16개 칸 문자열
		StringBuffer stringBuffer1 = new StringBuffer("Hello ");
				StringBuffer stringBuffer2 = new StringBuffer("Hello");
		
		stringBuffer1.append("Programming");
		System.out.println(stringBuffer1);
		stringBuffer1.insert(6,"Java ");
		System.out.println(stringBuffer1);
		stringBuffer1.replace(0, 5, "Good");
		System.out.println(stringBuffer1);
		stringBuffer1.delete(0, 4);
		System.out.println(stringBuffer1);
		stringBuffer1.reverse();
		System.out.println(stringBuffer1);
		
		System.out.println(stringBuffer2.equals("Hello"));// equals가 안먹힘.
		String x = stringBuffer2.toString();
		
		
	}//main method end

	@Override
	public boolean equals(Object obj) {
		// StringBuffer 는 equals 사용이 안된다. Overrinde를 해서 사용해야한다.
		return super.equals(obj);
	}

}//class end
