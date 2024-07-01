package ch08.extended.tire;

public class KumhoTire extends Tire { // 자식타이어
	// 생성자에 영향을 받음

	public KumhoTire(int maxRotation, String location) {// 부모class 규격과 같은 생성자 생성
		super(maxRotation, location);

	}

	@Override
	public boolean roll() {// 달리면서 accRotation 소모

		accRotation += 8;
		if (accRotation < maxRotation) {// 타이어 소모
			System.out.println(location + " 위치에 금호타이어 수명 : " + (maxRotation - accRotation) + "마일리지");
			return true;
		} // if end
		else {
			System.out.println("경고 : " + location + " 위치에 금호타이어가 펑크가 되었습니다.");
		} // else end
		return false;
	}// method end

}// class end
