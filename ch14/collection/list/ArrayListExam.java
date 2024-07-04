package ch14.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListExam {
	// list 는 array list , vector , linkedlist 3개를 주로 사용한다.
			//generic <>을 사용하여 list의 들어갈 변수를 선언한다.
			//capacity default 값은 10 이다.

	public static void main(String[] args) {
		List<String> lists = new ArrayList<>();
		//<> 제네릭 에 객체명을 넣으면 객체[] 배열 처럼 사용 가능하다.
		
		lists.add("Java"); // [0]에 "Java" 저장
		lists.add("Oracle"); //[1]에 저장
		//Oracle : 데이터 베이스
		lists.add("JDBC"); //[2]에 저장
		//JDBC : 자바와 DB 연동 (3일)
		lists.add("HTML,CSS,JS"); //[3]에 저장
		//프론트 (3일)
		lists.add("jsp"); //[4]에 저장
		//자바+db+프론트 연동 (2주)
		
		//-> servlet때문에 뒤로 한칸씩 밀림
		
		lists.add("TomCat");//[6]에 저장 
		//TomCat : 서버 프로그래밍(servlet)
		lists.add("리눅스");//[7]에 저장
		//리눅스 : 24시간 배포 서버
		lists.add(5,"servlet");//[5]에 저장
		//servlet : jsp + java
		lists.add("AWS");//[8]에 저장
		//AWS : 아마존 서버
		
		lists.remove(3);
		lists.remove("AWS");
		int size = lists.size();
		System.out.println(size);
		System.out.println("--------------------------");
		String skill = lists.get(2); //[2]번 값 가져온다.
		System.out.println(skill);
		System.out.println("--------------------------");
		for(int i=0;i<lists.size();i++) {
			System.out.println(lists.get(i));
			
		}//for end
		
		for(String a :lists) {//향상된 for문
			System.out.println(a);
		}//for end
		
		
		
		
		
		List<Sample> list1 = new ArrayList<>(); //객체를 <> 파라미터로 사용시 객체를 넣어줘야한다.
		list1.add(new Sample("name1",1)); //사용자 지정 생성자 꼭 만들어 주기
		list1.add(new Sample("name2",2));
		for(Sample a : list1) { //Sample a = new Samle();가 생략됨.
			
			
		}
		
		
		
	}//main method end

}//class end
