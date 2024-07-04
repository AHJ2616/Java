package ch13.nongeneric;

public class BoxExam {

	public static void main(String[] args) {
	//강제타입변환 테스트
		//Object class는 최상위 class로 몯느 타입으로 자동,강제 타입 변환이 가능하다.
		//자동 타입 변환 후에 get을 하려면 get에 대해 강제타입으로 변환하여 활용할 수 있다.
		
		//예외상황 : System.out.print() 는 자동으로 강제타입 변환 코드가 들어있어서 
		//어떤 형태의 변수가 들어가든 출력이 된다.
		
		Box box = new Box(); // 기본생성자로 Box 인스턴스 생성
		
		box.setObject("문자열");
		//Object 타입에 String 타입을 넣었다.
		//자동 타입변환으로 String 처리가 됨.
		System.out.println((String) box.getObject());
		String name = (String) box.getObject();
		
		
		Box box1 = new Box();
		
		box1.setObject(1234);
		//Object 타입에 int 타입을 넣었다.
		//자동 타입변환으로 int가 됨.
		
		Integer value = (Integer) box1.getObject();
		
		Box box2 = new Box();
		
		box2.setObject(new AppleDTO());
		//Object 타입에 AppleDTo class를 넣었다.
		//Box box2 = new AppleDTO(); 가 됨
		AppleDTO appledto = (AppleDTO) box.getObject();
		// AppleDTP appledto = new AppleDTO(box.getObject())와 같음
		
		

	}//main method

}//class end
