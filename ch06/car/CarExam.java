package ch06.car;

public class CarExam {

	public static void main(String[] args) {
		Car myCar = new Car();
		Car yourCar = new Car("P사","458-Italy","Red",350,false);
		//인스턴스객체에 미리 값을 넣을 수 있다
		
		System.out.println("myCar : "+myCar);
		System.out.println("yourCar : "+yourCar);//주소값이 나온다.
		//System.out.println("myCar : "+myCar.toString());
		//System.out.println("yourCar : "+yourCar.toString());//주소값이 나온다.
		
		

	}// main method end

}//class end
