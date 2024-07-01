package ch06.singleton;

public class SingletonExam {

	public static void main(String[] args) {
		//Singleton obj1 = new Singleton();  생성자가 private이어서 사용 불가
		Singleton obj2 = Singleton.getInstance(); //메서드를 호출하여서 사용한다.
		Singleton obj3 = Singleton.getInstance();
		
		if(obj2==obj3) {System.out.println("같다");} //static이니까
		else {System.out.println("다르다");}

	}//main method end

}//class end
