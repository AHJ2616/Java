package ch14.collection.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExam {
	// 키보드로 입력 받은 id와 pw를 이용한 로그인 테스트
	public static void main(String[] args) {
		
		Map<String,String> login = new Hashtable<String, String>();
	          //(id , pw)
		login.put("id1", "pw1");
		login.put("id2", "pw2");
		login.put("id3", "pw3");
		login.put("id4", "pw4");
		login.put("id5", "pw5");
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.print("아이디를 입력해 주세요 : ");
			String id = sc.next();
			System.out.print("비밀번호를 입력해 주세요 : ");
			String pw = sc.next();
			
			if(login.containsKey(id)) {//Hashtable의 key에 String id가 존재하는지
				if(login.get(id).equals(pw))//id가 존재한다면 key값으로 id를 줬을때 나오는 value값이 String pw와 같은지
				{
					System.out.println("로그인 성공!");
					break;
				}//if end
				else {System.out.println("로그인정보가 일치하지 않습니다.");}
			}//if end
		}//while end
		
	}//main method end

}//class end
