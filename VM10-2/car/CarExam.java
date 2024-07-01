package car;
import java.util.*;
public class CarExam {
	private static Scanner sc = new Scanner(System.in);
	static Man[] mans = new Man[10];
	static Car[] cars = new Car[7];
	
	public static void main(String[] args) {
		User user = new User();
		Man man = new Man();
		Car car = new Car(); //각각 객체들의 인스턴스 생성
		man.creatman(mans);// mans 기초 데이터 저장
		car.carSet(cars); // cars 기초 데이터 저장
		
		user.creat(user);// 유저이름 정하는 method
		user.levelSet(user); //난이도 정하는 method
		
		System.out.println("난이도 설정이 완료 되었습니다!");
		System.out.print("'press any key' 다음>>>");
		String skip = sc.next(); //글 읽어보고 준비가 된다면 넘어가기
		System.out.println("=====================================");
		System.out.println("이제부터 "+user.name+"의 자동차 튜닝샵을 운영해 보세요!");
		System.out.println("내일부터는 손님이 찾아올거에요");
		System.out.println("손님의 니즈와 예산을 고려하여 자동차를 만들어야 해요");
		System.out.println("손님이 준비된 차가 마음에 안들면 계약을 파기해 버릴수도 있어요");
		System.out.println("계약 파기를 당하면 game over 라구요");
		System.out.println("손님의 만족도가 높으면 예산보다 돈을 더 지불 할 수도 있어요");
		System.out.println("그리고 당신의 몸상태는 매일매일 변해요. 몸상태가 안좋으면");
		System.out.println("자동차 튜닝에 안좋은 영양을 미칠 수 있습니다.");
		System.out.println("=====================================");
		System.out.print("'press any key' 다음날>>>");
		String skip1 = sc.next(); //글 읽어보고 준비가 된다면 넘어가기
		man.epi1(mans,user);
		car.ep1Day1(user,mans,cars);
		car.ep1DayN(user, mans, cars);
		
		
		
		
		
		
		
	}//main method end

}//class end
