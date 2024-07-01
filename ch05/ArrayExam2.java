package ch05;
import java.util.*;

public class ArrayExam2 {

	// 학생표 시스템 만들기 (while이용해서 메뉴화 한다)
	// 교사용 : 교사 인증시스템 , 성적 입력, 수정 , 확인 기능
	// 학생용 : 이름(학생번호) 입력시 성적 확인 가능 (반에서 몇등인지까지?)
	// 교사인증 시스템 : 비밀번호 확인하기
	// 성적 입력 : 학생이름, 학생번호, 점수를 입력받아서(2개의 배열만들기) 저장한다. 학생번호는 어차피 1~x까지니까 안만들어도 될듯
	// 성적 수정 : 학생번호 와 학생점수를 받아서 수정값을 저장한다.
	// 점수 확인 : 입력받은 학생이름, 학생번호 , 점수를 출력해준다.
	// 서브 메서드에서 할당 할 수 있는 것 : int[] scores :학생 점수 수정하기 / int password : 교사용 비밀번호 확인하기
	// 메인 메서드에서만 꼭 해야 할 것 : 초기 학생성적 데이터들 저장 하기. (메서드에서 여러 타입 변수 주고 받는법을 모름;;)

	
	public static void main(String[] args) {
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		int menu0 = 0, menu1 = 0, students = 0; // 메인메뉴 1-1용
		int num = 0; //학생번호
		String[] names = new String[50];
		int[] scores = new int[50]; // 학생성적입력기
		boolean run0 = true, run1=true, run2=true; // 메인메뉴 1-1용
		while(run0) {
			System.out.println("===== M B C 아카데미 성적 프로그램 =====");
			System.out.println("\n1. 교사용\n2. 학생용\n");
			System.out.println("=================================");
			System.out.print("사용하실 메뉴의 번호를 입력해 주세요 : ");
			menu0 = scInt.nextInt();
			switch(menu0) {
			case 1 : run0=false; run1=true; run2 = false; break; // run1(교사용 메뉴 활성화 시킴)
			case 2 : run0=false; run2 =true; run1 = false; break; // run2(학생용 메뉴 활성화 시킴)
			default : System.out.println("다시 입력해주세요");
			
			
			}//switch(menu0) end
		
		}//while(run0) end
		while(run1) {
			System.out.println("===== M B C 아카데미 성적 프로그램(교사용) =====");
			System.out.println("\n1. 성적입력\n2. 성적확인\n3. 성적수정\n4. 이전으로 돌아가기");
			System.out.println("=======================================");
			System.out.print("사용하실 메뉴의 번호를 입력해 주세요 : ");
			menu1 = scInt.nextInt(); 
			switch(menu1) {
			case 1 : if(run2=true) {
				System.out.println("학생수를 입력해 주세요");
			students = scInt.nextInt();
			
			for(int i = 1; i<students;i++) {
			System.out.println(i+"번 학생의 이름을 입력해 주세요");
			names[(i-1)]= scString.next();
			
			System.out.println(names[(i-1)] + "의 점수를 입력해 주세요");
			scores[(i-1)] = scInt.nextInt();}
			run2=false;}
			else {System.out.println("이미 성적입력을 마치셨습니다");}
			
				run1=false;
				break;
			case 2 : if(run1=true) System.out.println("성적입력을 먼저 해주세요");
			else {System.out.println("\"===== M B C 아카데미 성적 프로그램(교사용) =====\"");
			System.out.println("     성적확인 메뉴 입니다.\n");
			for(int i = 1; i<students;i++) {
				System.out.println(i+"번 "+names[(i-1)]+" 학생의 점수 : "+scores[(i-1)]);
			}//for문 end
			
			}//else end
				break;
			case 3 : if(run1=true) System.out.println("성적입력을 먼저 해주세요");
			
			else {
				System.out.println("수정할 학생의 번호를 입력해 주세요 :");
				num = scInt.nextInt();
				System.out.println((num-1) +"번학생의 점수를 입력해 주세요 :");
				scores[(num-1)] = scInt.nextInt();
				
				} break;
			case 4 : 
				run0=true;run1=false;
				break;
			default : System.out.println("잘못입력하셨습니다");
					
			
			
			}//switch end
			
			
		}//while(run1) end
		
	
	}//main end

	static int[] teacher(int[] scores) {
	Scanner scInt = new Scanner(System.in);
	Scanner scString = new Scanner(System.in);
	int[] scores2 = new int[30];
	String[] names = new String[30];
		int menu0 = 0, students = 0, num = 0;
		boolean run0 = true, run1, run2 = true;
		while(run0) {
			System.out.println("===== M B C 아카데미 성적 프로그램(교사용-성적수정) =====");
			System.out.println("\n1. 성적입력\n2. 성적확인\n3. 성적수정\n4. 이전으로 돌아가기");
			System.out.println("=======================================");
			System.out.print("사용하실 메뉴의 번호를 입력해 주세요 : ");
			menu0 = scInt.nextInt();
			
			switch(menu0) {
			
			
		
		
			}//switch(menu0) end
			
		}//while(run0) end
		return scores2;
	}//teacher M end
	
}//class end
