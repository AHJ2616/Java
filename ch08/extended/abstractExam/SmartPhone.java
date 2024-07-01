package ch08.extended.abstractExam;

public class SmartPhone extends Phone { //구현 Class (추상메서드를 상속 받음)

	
	
	public SmartPhone(String owner){// 사용자 지정 생성자
		super(owner);
	}
	
	
	
	
	public void internetSearch() {//인터넷 검색
		System.out.println("인터넷 검색");
		
	}//인터넷 검색 method end
	
}//class end
