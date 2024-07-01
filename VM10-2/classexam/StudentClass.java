package classexam;
import java.util.*;
public class StudentClass {
	private static Scanner sc = new Scanner(System.in);
	String name;
	String address;
	String sex;
	int age;
	int classNum;
	int phoneNum;
	public static StudentClass[] student = new StudentClass[20];
	
	public void menuScore() {
boolean run=true;		
	
		while(run) {//학생관리메뉴
			System.out.println("============== M B C 학생 프로그램 ================\n메인메뉴>학생관리");
			System.out.println("\n1. 신규학생 등록 | 2. 학생정보 수정 | 3. 학생정보 삭제 | 4. 학생정보 열람/\n5.뒤로가기\n");
			System.out.println("================================================");
			System.out.print("메뉴를 선택해주세요(1-5) : ");
			String select = sc.next();
			switch(select) {
			case "1" :
				System.out.println("신규학생 등록을 시작합니다.");
				StudentClass newStudent = new StudentClass();
				System.out.print("이름 : ");
				newStudent.name = sc.next();
				System.out.print("주소 : ");
				newStudent.address = sc.next();
				System.out.print("성별 : ");
				newStudent.sex = sc.next();
				System.out.print("나이 : ");
				newStudent.age = sc.nextInt();
				System.out.print("반번호 : ");
				newStudent.classNum = sc.nextInt();
				System.out.print("전화번호 : ");
				newStudent.phoneNum = sc.nextInt();
				for(int i=0; i<student.length;i++) {
					if(student[i]==null) {
						student[i]=newStudent;
						break;
						
					}//if end
					
				}//for end
				
				System.out.println("신규학생 등록이 정상 처리 되었습니다.");
				break;
				
			case "2" :
				System.out.println("학생정보를 수정합니다.");
				System.out.println("수정할 학생의 이름을 입력해 주세요.");
				String search = sc.next();
				StudentClass find = searching(search);
				if(find==null) {System.out.println("수정할 학생이 없습니다");}
				else {
				System.out.println(find.name + "학생의 수정할 정보를 선택해 주세요.");
				boolean run2=true;
				while(run2) {
					System.out.println("1. 주소 : " + find.address);
					System.out.println("2. 성별 : " + find.sex);
					System.out.println("3. 나이 : " + find.age);
					System.out.println("4. 반번호 : " + find.classNum);
					System.out.println("5. 전화번호 : " + find.phoneNum);
					System.out.println("6. 저장하기");
					System.out.print((">>>>"));
					String select2 = sc.next();
					switch(select2) {
					case "1" : System.out.print("변경할 주소를 입력해주세요 >>>");
					String enter1 = find.address;
					break;
					case "2" : System.out.print("변경할 성별을 입력해주세요 >>>");
					String enter2 = find.sex;
					break;
					case "3" : System.out.print("변경할 나이를 입력해주세요 >>>");
					int enter3 = find.age;
					break;
					case "4" : System.out.print("변경할 반번호를 입력해주세요 >>>");
					int enter4 = find.classNum;
					break;
					case "5" : System.out.print("변경할 전화번호를 입력해주세요 >>>");
					int enter5 = find.phoneNum;
					break;
					case "6" : run2=false; break;
					default : System.out.println("입력오류 입니다.\n 다시 입력해 주세요");
					break;
					
					
					}//switch(select2) end
					
						
					
				}//else end
				}//while(run2) end
			case "3" ://정보삭제
				System.out.println("학생정보를 삭제합니다.");
				System.out.println("삭제할 학생의 이름을 입력해 주세요.");
				String search2 = sc.next();
				StudentClass find2 = searching(search2);
				if(find2==null) {System.out.println("삭제할 학생이 없습니다");}
				else {
					for(int i =0;i<student.length;i++) {
						if(student[i].name.equals(find2.name)) {
							student[i]=null;
						}//if end
						
					}//for end
				}//else end
				
				System.out.println("학생정보가 삭제되었습니다.");
				break;//메뉴 3 break
			
			
			case "4" : //정보열람
				System.out.println("학생정보를 열람합니다.");
				System.out.println("열람할 학생의 이름을 입력해 주세요.");
				String search3 = sc.next();
				StudentClass find3 = searching(search3);
				System.out.println("이름 : " + find3.name);
				System.out.println("주소 : " + find3.address);
				System.out.println("성별 : " + find3.sex);
				System.out.println("나이 : " + find3.age);
				System.out.println("반번호 : " + find3.classNum);
				System.out.println("전화번호 : " + find3.phoneNum);
				
				break;//메뉴 4 break
			
			
			case "5" : run=false; break;
			default : break;
				
		
			}//switch
		}//while(run) end
		
	}//menuScore method end
	
	
	public static StudentClass searching(String search) {
		StudentClass find = null;
		for(int i =0; i<student.length;i++) {
			String name = student[i].name;
			if(name.equals(search)) {
				find = student[i]; break;
			}
			
		}//for end
		
		return find;
	}//searching method end


}
