package ch08.extended.tire;

public class Tire { // 부모 class oem 타이어 (내장된 타이어)

	// 필드
	public int maxRotation; // 타이어 최대 회전수 0이면 타이어 수명 끝

	public int accRotation; // 타이어 주행거리 주행시 +5씩 증가

	public String location; // 타이어의 위치



	// 커스텀 생성자
	public Tire(int maxRotation, String location) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	

	// 메서드
	public boolean roll() {//달리면서 accRotation 소모
		boolean run = true;
		accRotation += 5;
		if(accRotation < maxRotation) {//타이어 소모
			System.out.println(location+" 위치에 타이어 수명 : "+(maxRotation-accRotation)+"마일리지");
			run =  true;
		}//if end
		else { 
			System.out.println("경고 : "+location + " 위치에 타이어가 펑크가 되었습니다.");
			run=false;
		}//else end
		return run;
	}//method end
	

}// class end
