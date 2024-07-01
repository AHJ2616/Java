package webBoard.service;
import java.util.*;

import webBoard.DTO.Member;
public class Raed3 extends webBoard.DTO.Board3 {
	private static Scanner sc = new Scanner(System.in);

	public void menu(Member user) {//자유게시판
		WriteComent writecoment = new WriteComent();
		boolean run = true;
		while (run) {
			System.out.println("=======================================");
			System.out.println("http://버블.com/자유게시판\n");
			System.out.println("0. 뒤로가기");
			for (int i = 0; i < boards3.length; i++) {
				if (boards3[i] != null) {
					System.out.println("글번호 : " + (i + 1) +"	작성자 : " + boards3[i].getWriter() + "    글제목 : " + boards3[i].getTitle() + "    조회수 : "
							+ boards3[i].getViews());
				} 
			}
			System.out.println("=======================================");
			System.out.print("글 선택 : ");
			int x = sc.nextInt();
			if(x==0) {run=false;}else if(x>=1) {int y=x-1;
			
				boards3[y].setViews(boards3[y].getViews()+1);//조회수 올리기
				
				System.out.println("작성자 : " + boards3[y].getWriter() + "    글제목 : " + boards3[y].getTitle() + "    조회수 : "
						+ boards3[y].getViews());
				System.out.println("---------------------------------------------------------");
				System.out.println(boards3[y].getContents());
				System.out.println("---------------------------------------------------------");
				System.out.println("<댓글>");
				writecoment.show3(y);
				System.out.println("1. 코멘트 달기 | 2. 뒤로가기");
				String sl = sc.next();
				switch(sl) {
				case "1" : writecoment.write3(y,user); break;
				case "2" : break;}//switch end
	}}
	}//자게 메뉴 method end
	
	
	
}//class end
