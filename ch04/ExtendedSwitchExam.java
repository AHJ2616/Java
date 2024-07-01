package ch04;

import java.util.*;

public class ExtendedSwitchExam {
	// 향상된 switch 문-> 람다식 결합 (람다식 = 익명함수)
			//메서드 나누는 연습 main +a(CRUD)
			//main 메서드는 프로그램 실행시 동작
			//나머지 메서드는 호출시에만 작동

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("찾은 동물의 이름을 입력하세요 >>>>");
		String animal = s1.next();
		String kind = whoIsItReturn(animal); // whoISIt 매서드를 호출하면서 
		
		
		System.out.printf("%s은/는 %s 입니다.\n",animal,kind);		

	}// main M end
	
	static String whoIsItReturn(String animal) {
		String kind = "넌 누구냐";
		switch(animal) {
		case "호랑이","사자","강아지","고양이" -> kind = "포유류"; // -> 람다식 기호
		case "독수리","참새","비둘기","까마귀" -> kind = "조류";
		case  "킹크랩","대게","새우","게" -> kind = "각갑류";
		case "고등어","연어","참치","열대어","방어" -> kind  = "어류";
		case "메뚜기","잠자리","매미","개미" -> kind = "곤충" ;
		default -> {System.out.println("아이쿠"); kind = "알 수 없음";}
		}//switch end
		
		return kind; // void가 아닌 타입의 경우에는 필수로 return 값을 넣어야한다. (타입은 String , int 등이 될 수 있다)
	}//whoIsItReturn M end
	
	
	static void whoIsIt(String animal) { //static void 메써드, main 메서드와는 안겹침  void: return 값이 없다.
		//매게값은 타입만 맞으면 된다.
		String kind = "넌 누구냐";
		switch(animal) {
		case "호랑이","사자","강아지","고양이" -> kind = "포유류"; // -> 람다식 기호
		case "독수리","참새","비둘기","까마귀" -> kind = "조류";
		case  "킹크랩","대게","새우","게" -> kind = "각갑류";
		case "고등어","연어","참치","열대어","방어" -> kind  = "어류";
		case "메뚜기","잠자리","매미","개미" -> kind = "곤충" ;
		default -> {System.out.println("아이쿠"); kind = "알 수 없음";}
		
		
		}//switch문 종료
		
		System.out.printf("%s은/는 %s 입니다.\n",animal,kind);
	}//whoIsIt M end
	
}// class end
