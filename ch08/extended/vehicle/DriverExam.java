package ch08.extended.vehicle;

public class DriverExam {

		public static void main(String[] args) {
			Driver driver = new Driver();//service class 인스턴스 생성
			
			Vehicle vehicle = new Vehicle();//부모 class 인스턴스 생성
			vehicle.name ="차";
			driver.drive(vehicle);
			
			//부모 객체를 매게값으로 받는 method에 자식을 넣어도 자동타입변환이 일어나서 실행이된다.
			
			
			Vehicle bus = new Bus(); //자식 class 인스턴스 생성
			bus.name = "시내버스";
			Bus bus2 = (Bus) bus;
			bus2.type = "전기형";
			bus2.busCard();
			driver.drive(bus2);
			
			Vehicle taxi = new Taxi();//자식 class 인스턴스 생성
			Taxi taxi2 = (Taxi) taxi;
			taxi2.model ="카카오 택시";
			taxi2.name = "LNG형";
			taxi2.meter();
			driver.drive(taxi2);
			
			
			
			
			
		}//main method end
	
}//class end
