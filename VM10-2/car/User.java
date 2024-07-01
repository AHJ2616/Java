package car;
import java.util.*;
public class User { //플레이어 정보가 담긴 class
	private static Scanner sc = new Scanner(System.in);
	String name;//플레이어 이름
	int condition; //플레이어의 컨디션
	int money; //사용가능한 돈
	int level; //게임의 난이도
	int num; //선택한 차량번호
	int condition2=0;//플레이어의 컨디션을 올려줍니다
	boolean a1=false;
	boolean a2=false;
	boolean a3=false;
	boolean a4=false;
	
	

void creat(User user) {//플레이어생성
		
		boolean run = true;
		while(run) {
		System.out.println("=====================================");
		System.out.println("사용자의 이름을 정해주세요");
		System.out.println("=====================================");
		System.out.print(">>>>");
		user.name = sc.next();
		System.out.println(user.name+"(으)로 하시겠습니까?");
		System.out.println("1. Yes 2. No");
		String ans = sc.next();
		switch(ans) {
		case "1" : run=false; //이름지정하는 메서드 탈출
			break;
		case "2" :
		break;
		default: System.out.println("다시 입력해주세요");
		}//switch end
		}//while end
	}//생성 method end
	
void levelSet(User user) {//난이도 설정
	System.out.println("=====================================");
	System.out.println("게임의 난이도를 설정해 주세요");
	System.out.println("난이도는 수정이 불가능 하며 자본금과 고객의 만족도에 영향을 줍니다.");
	System.out.println("1. 쉬움\n2. 보통\n3. 어려움");
	System.out.println("=====================================");
	String select1 = sc.next();
	switch(select1) {
	case "1" : level=1;
		break;
	case "2" : level=0;
		break;
	case "3" : level= (-1);
		break;
	default: System.out.println("다시 입력해주세요");
	}//switch
	
}// 난이도 method end



}//class end
