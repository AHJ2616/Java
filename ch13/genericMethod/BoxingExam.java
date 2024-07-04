package ch13.genericMethod;

public class BoxingExam {
	
	public static void main(String[] args) {
		//제네릭 메서드 활용
		
		Box<Integer> boxI;
		boxI = Util.boxing(100);
		
		System.out.println(boxI.get());
		
		
		Box<String> boxS;
		boxS = Util.boxing("백");
		System.out.println(boxS.get());
		
	}//main method end

}//class end
