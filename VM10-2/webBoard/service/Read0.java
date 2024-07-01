package webBoard.service;

import java.util.*;

import webBoard.DTO.Board0;
import webBoard.DTO.Board2;
import webBoard.DTO.Board3;
import webBoard.DTO.Board4;
import webBoard.DTO.Member;

public class Read0 extends Board0 {
	Scanner sc = new Scanner(System.in);
	Read1 read1 = new Read1();
	Read2 read2 = new Read2();
	webBoard.service.Raed3 read3 = new webBoard.service.Raed3();
	Read4 read4 = new Read4();
	Board2 board2= new Board2();
	Board3 board3= new Board3();
	Board4 board4= new Board4();
	Write write = new Write();
	MemberMenu member = new MemberMenu();

	public void main(Member user) {// 메뉴
		sampleBoard0();
		board2.sampleBoard2();
		board3.sampleBoard3();
		board4.sampleBoard4();
		boolean run = true;
		while (run) {
			System.out.println("=======================================");
			System.out.println("http://버블.com\n");
			System.out.println("글보기 | 0.공지사항| 1.베스트 |");
			System.out.println("글보기 | 2.유머 | 3.자유 | 4.게임 |");
			System.out.println("글쓰기 | 5.유머 | 6.자유 | 7.게임 |");
			System.out.println("| 8.회원정보 수정 | 9.검색");
			System.out.println("=======================================\n");
			System.out.print("선택 : ");
			String sl = sc.next();
			switch (sl) {
			case "0":
				showNotice(user);
				break;
			case "1": read1.menu(user,board2.getboards2(),board3.getboards3(),board4.getboards4());
				break;
			case "2": 
				read2.menu(user);
				break;
			case "3":read3.menu(user);
				break;
			case "4":read4.menu(user);
				break;
			case "5": write.write5(user);
				break;
			case "6":write.write6(user);
				break;
			case "7":write.write7(user);
				break;
			case "8": user=member.modify(user);
			break;
			case "9": read1.search(user,board2.getboards2(),board3.getboards3(),board4.getboards4());
			break;
			default:
			}// switch end
		} // while(run) end

	}// 메뉴 method end

	private void showNotice(Member user) {// 공지사항
		WriteComent writeComent = new WriteComent();
		boolean run=true;
		while(run) {
		System.out.println("\n\n=======================================");
		System.out.println("http://버블.com/공지사항\n");
		System.out.println("0. 뒤로가기");
			for (int i = 0; i < boards0.length; i++) {
				if (boards0[i] != null) {
					System.out.println("글번호 : " + (i + 1) + "    글제목 : " + boards0[i].getTitle() + "    조회수 : "
							+ boards0[i].getViews());
				} 
			}
			System.out.println("=======================================");
			System.out.print("글 선택 : ");
			int x = sc.nextInt();
			if(x==0) {run=false;}else if(x>=1) {int y=x-1;
			
				boards0[y].setViews(boards0[y].getViews()+1);//조회수 올리기
				
				System.out.println("작성자 : " + boards0[y].getWriter() + "    글제목 : " + boards0[y].getTitle() + "    조회수 : "
						+ boards0[y].getViews());
				System.out.println("---------------------------------------------------------");
				System.out.println(boards0[y].getContents());
				System.out.println("---------------------------------------------------------");
				System.out.println("<댓글>");
				writeComent.show0(y);
				System.out.println("1. 코멘트 달기 | 2. 뒤로가기");
				String sl = sc.next();
				switch(sl) {
				case "1" : writeComent.write0(y,user); break;
				case "2" : break;
				}
			}//else if end
			
	
		}//while end
	}// 공지사항 method end

}// class end
