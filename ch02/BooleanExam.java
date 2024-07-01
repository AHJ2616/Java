package ch02;

public class BooleanExam {

	public static void main(String[] args) {
		// boolean은 1byte 값을 갖는다. true/false 처리용
		// 컴퓨터는 if 타입형을 이용해서 처리하는데 활용된다.
		
		boolean stop = false ; // 변수명 stop에 false값을다.
		boolean start = true ; // 변수명 start에 true값을 준다.
		
		// "false"는 문자열, false는 키워드
		
		if(stop) { // if(조건){true처리} else {false처리} 
			System.out.println("정지합니다") ;
			
		}else {
			System.out.println("출발합니다.") ;
			
		}

		if(start) { //boolean은 true 와 false만 나타내므로 if타입형에 사용시 잘 생각해야한다.
			System.out.println("출발합니다.");
		}else {
			System.out.println("정지합니다");
			
		}
		
		}
		
	}

