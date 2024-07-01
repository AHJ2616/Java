package ch04;

import java.util.Scanner;

public class SwitchCharExam {

	public static void main(String[] args) {
		// switch문에서 char형 비교하기
		Scanner scChar = new Scanner(System.in); //char 입력 전용 스캐너
		
		System.out.print("회원등급을 입력하세요 : ");
		
		char grade = scChar.next().charAt(0); 
		// next()는 string 변수를 저장하므로 charAt(0)을 사용해서 char로 바꾼다.
		
		
		
		switch(grade) {
		case 'a' :
		case 'A' : System.out.println("우수회원 입니다"); //if문에서 String s1.equalsIgnoreCase("a") 와 같은 기능.
		break;
		case 'b' :
		case 'B' : System.out.println("일반회원 입니다");
		break;
		case 'c' :
		case 'C' : System.out.println("사업자회원 입니다");
		break;
		default : //그외의 작업들....
			System.out.println("등급을 잘못 입력하셨습니다.");
		    System.out.print("회원가입 하시겠습니까?");
		    
		//swtich end
		    String newMem = scChar.next();
		    if(newMem.equalsIgnoreCase("yes")) {
		    	System.out.print("ID : ");
		    	String idAdress = scChar.next();
		    	System.out.println(idAdress + "님 회원가입을 ㅊㅋ드립니다");
		    	}//if문 end
		    }// switch end
		
		    scChar.close();
		
		System.out.println("검증코드 : " +grade);

	}//main end

}//class end
