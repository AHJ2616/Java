package car;
import java.util.*;
public class Man {
	private static Scanner sc = new Scanner(System.in);
	
	String name; //이름
	String story;//요구사항
	int money;//버젯 예산
	int expire;//기한
	int total;//만족도 + a =요구치 총점
	
	void creatman(Man[] mans) {//에피소드 등장인물 만들기
	Man man0 = new Man();
	man0.name ="나졸부";
	man0.story="코인투자로 갑자기 부자가된 젊은 사람. \n예쁘고 순간가속과 최고속도가 잘나오는 차를 원한다. \n곧 다가오는 자신의 생일에 스스로에게 차를 선물하고 싶어한다";
	man0.money= 50000;
	man0.expire=10;
	man0.total = 60;
	mans[0]=man0;
	}//등장인물 method end



void epi1(Man[] mans,User user) {//1번 에피소드
	
	int day = Calendar.DAY_OF_MONTH;
	int month = Calendar.MONTH;
	System.out.println("=====================================");
	System.out.println("첫번째 에피소드 : 스피드광");
	System.out.println((month+1)+"월 "+day+"일 날씨 : 매우 맑음\n\n");
	System.out.println("첫번째 손님"+mans[0].name+"가 찾아 왔습니다.");
	System.out.println("설명 : "+mans[0].story);
	System.out.println("예산 : 5억원");
	System.out.println("기한 : "+mans[0].expire+"일");
	System.out.println("=====================================");
	System.out.print("'press any key' 다음>>>");
	String skip = sc.next(); //글 읽어보고 준비가 된다면 넘어가기
	user.money= mans[0].money+(user.level*mans[0].money/5);
	
}//에피1 method end


}//class end
