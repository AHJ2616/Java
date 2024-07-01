package ch08.extended.people;

public class People {//부모 class
	public String name;
	public String ssn;
	
	//사용자지정 생성자 custom 생성자
	public People(String name,String ssn) {
	this.name = name;
	this.ssn = ssn;
	}
	
	People(){}//기본 생성자

}//class end
