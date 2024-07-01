package ch08.extended.tire;

public class Car {

	// 필드
	Tire fL = new Tire(30, "앞 왼쪽"); // 1
	Tire fR = new Tire(26, "앞 오른쪽"); // 2
	Tire bL = new Tire(20, "뒤 왼쪽"); // 3
	Tire bR = new Tire(15, "뒤 오른쪽"); // 4
	// 펑크 x 면 0

	// 생성자

	// 메서드
	int run() {// 달리고 고장판단
		if (fL.roll() == false) {
			stop();
			return 1;
		} // if end

		if (fR.roll() == false) {
			stop();
			return 2;
		} // if end

		if (bL.roll() == false) {
			stop();
			return 3;
		} // if end

		if (bR.roll() == false) {
			stop();
			return 4;
		} // if end

		return 0;// 펑크 X

	}// run method end

	
	void stop() {// 펑크시 호출
		System.out.println("자동차가 멈춥니다");

	}// stop method end

}// class end
