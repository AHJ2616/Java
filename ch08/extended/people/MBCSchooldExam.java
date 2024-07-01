package ch08.extended.people;

public class MBCSchooldExam {

	public static void main(String[] args) {
		//상속 관계의 객체를 호출한다.
		//생성자를 활용해본다.
		
		People people = new People("부모","엄마번호");
		System.out.println(people.name + " "+people.ssn);
		
		Student student = new Student("자식","자식번호",3);
		
		System.out.println(student.name+ " "+student.ssn+" "+student.studentNo);
		
		Teacher teacher = new Teacher("선생님","선생님번호",5);
		
		System.out.println(teacher.name+" "+teacher.ssn+" "+teacher.num);
		
		//다형성
		People multi=new Student("사람","번호",4);
		People multi2=new Teacher("사람2","번호2",7); 
		

	}//main method end

}//class end
