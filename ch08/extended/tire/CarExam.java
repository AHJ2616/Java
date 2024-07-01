package ch08.extended.tire;
import java.util.*;
public class CarExam {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {//자동차 주행 test
		Car car = new Car();// 서비스 class
		
		for(int i=1;i<=30;i++) {//30회 주행
			int problemLocation = car.run();
			System.out.println("========================");
			switch(problemLocation) {
			case 1 : System.out.println("앞 왼쪽 타이터 펑크 발생");
				car.fL=changeTire(car.fL);
				break;
			case 2 :System.out.println("앞 오른쪽 타이터 펑크 발생");
			car.fR=changeTire(car.fR);
				break;
			case 3 :System.out.println("뒤 왼쪽 타이터 펑크 발생");
			car.bL=changeTire(car.bL);
				break;
			case 4 :System.out.println("뒤 오른쪽 타이터 펑크 발생");
			car.bR=changeTire(car.bR);
				break;
			}//switch end
			System.out.println("========================");
		}//for end
		
		
	}//main method end
	
	public static Tire changeTire(Tire carTire) {//타이어 변경 method
		System.out.println("========================");
		System.out.println("1.한국 타이어 2.금호 타이어 3.oem타이어");
		String select = sc.next();
		switch(select) {
		case "1" : carTire = new HankookTire(90,carTire.location);
		carTire.accRotation=0;
		System.out.println(carTire.location+" 한국타이어 교체 성공!");
			break;
		case "2" : carTire = new KumhoTire(90,carTire.location);
		carTire.accRotation=0;
		System.out.println(carTire.location+" 금호타이어 교체 성공!");
			break;
		case "3" : carTire = new Tire(90,carTire.location);
		carTire.accRotation=0;
		System.out.println(carTire.location+" oem타이어 교체 성공!");
			break;
			
			default : System.out.println("1-3에서 입력해 주세요");
		}//siwtch end
		return carTire;
	}//타이어 변경 method end
	
}//class end
