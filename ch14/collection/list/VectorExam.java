package ch14.collection.list;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorExam {

	//Vector는 list 컬렉션의 자식객체로 method를 상속 받았다.
			//동기화된 method로 구성되어 있어서 multi-thread 환경에서 이 메서드를 동시에 실행 불가능하다.
			//하나의 thread가 실행을 완료해야 다른 thread를 실행 할 수 있다.
			// multi-thread 환경에서 안전하게 객체를 추가,삭제 가능하다. (좌석 예약, 상품 재고 파악) 
			//<-> arraylist는 synchronized 처리가 안되어 있다.
	
	
	public static void main(String[] args) {
		List<BoardDTO> lists = new Vector<>();
		
		lists.add(new BoardDTO("제목1","내용1","작성자1"));
		lists.add(new BoardDTO("제목2","내용2","작성자2"));
		lists.add(new BoardDTO("제목3","내용3","작성자3"));
		lists.add(new BoardDTO("제목4","내용4","작성자4"));
		lists.add(new BoardDTO("제목5","내용5","작성자5"));
		lists.add(new BoardDTO("제목6","내용6","작성자6"));
		lists.add(new BoardDTO("제목7","내용7","작성자7"));
		
		BoardDTO bd1 = lists.get(0);
		System.out.println("백터 객체의 [0] 정보");
		System.out.println("제목 : "+bd1.getSubject());
		System.out.println("내용 : "+bd1.getContents());
		System.out.println("작성자 : "+bd1.getWriter());
		
		BoardDTO bd2 = new BoardDTO();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("제목을 적어주세요 : ");
		bd2.setSubject(sc.next());
		System.out.print("내용을 적어주세요 : ");
		bd2.setContents(sc.next());
		System.out.print("작성자를 적어주세요 : ");
		bd2.setWriter(sc.next());
		//BoardDTO bd2 = new BoardDTO(title,subject,writer);
		
		lists.add(bd2);
		System.out.println(bd2.toString());
		
		
		
		for(BoardDTO b : lists) {
			System.out.println("제목 : "+b.getSubject() + " 내용 : "+b.getContents()+ "작성자 : "+b.getWriter());
			
		}//for end
		
		
	}//main method end
	
}//class end
