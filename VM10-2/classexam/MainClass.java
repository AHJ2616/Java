package classexam;
import java.util.*;
public class MainClass {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// main menu
		
		boolean run = true;
		while(run) {//메인메뉴
			System.out.println("============== M B C 학생 프로그램 ================\n메인메뉴>");
			System.out.println("\n1. 학생관리 | 2. 성적관리 | 3. 통계 | 4. 프로그램 종료/\n\n");
			System.out.println("================================================");
			System.out.print("메뉴를 선택해주세요(1-4) : ");
			String select = sc.next();
			switch(select) {
			
			case "1" : StudentClass studentClass = new StudentClass();
			studentClass.menuScore();
			
				break;
				
			case "2" : ScoreClass scoreClass = new ScoreClass();
			
			break;
			
			case "3" : Statistics statistics = new Statistics(); break;
			
			case "4" : run=false; break;
			default : System.out.println("입력오류 입니다.\n 다시 입력해 주세요");
			
			
			}//switch(select) end
		}//while run end

	}//main method end

}//class end
