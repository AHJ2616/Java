package ch11.throwExam;

public class ThrowsExam {

	public static void main(String[] args) {
		 //thorw는 예외 발생시 예외처리하는 곳으로 넘겨준다.
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
			//e.printStackTrace();
		}
		
		

	}//main method end

	public static void findClass() throws ClassNotFoundException {//클래스를 찾아주는 메서드
		Class clazz = Class.forName("java.lang.String2");
		System.out.println(clazz+"가 존재 합니다.");
		
		
	}
	
}//class end
