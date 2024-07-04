package ch13.multiType;

public class ProductExam {

	public static void main(String[] args) {
		// 2개의 파라미터를 갖은 generic을 사용한다.
		
		Product<Car, String> product1 = new Product<>();
		product1.setKind(new Car()); //Car class 만 파라미터로 쓸 수 있다.
		product1.setModel("Genesis"); //String 타입만 파라미터로 쓸 수 있다.
		
		Car car = product1.getKind();
		String carmodel = product1.getModel();
		System.out.println(car + " " + carmodel);
		
		Product<Tv, Integer> product2 = new Product<>();
		product2.setKind(new Tv());
		product2.setModel(5);
		Tv tv = product2.getKind();
		Integer channel = product2.getModel();
		System.out.println(tv + " " + channel);
		
		
	}//main method end

}//class end
