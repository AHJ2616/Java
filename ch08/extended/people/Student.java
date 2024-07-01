package ch08.extended.people;

public class Student extends People {//자식 class
	
	public int studentNo;
	
	
	//custom 생성자
	public Student(String name,String ssn,int studentNo) {
		super(name,ssn); //부모 생성자 호출
		//this.name = name;
		//this.ssn = ssn;
		this.studentNo = studentNo;
		
	}//Student student = new Student("name","ssn",1){}

	
	
}//class end
