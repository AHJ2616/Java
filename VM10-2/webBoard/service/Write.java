package webBoard.service;
import java.util.*;

import webBoard.DTO.Board2;
import webBoard.DTO.Board3;
import webBoard.DTO.Board4;
import webBoard.DTO.Member;
public class Write{//글쓰기
	Scanner sc = new Scanner(System.in);
	
	public void write5(Member user) {//유머 게시판 글쓰기
		Board2 board2 = new Board2
				();
	System.out.println("=======================================");
	System.out.println("http://버블.com/유머게시판>글쓰기\n");
	System.out.print("제목을 입력해주세요 :");
	board2.setTitle(sc.next());
	System.out.print("\n내용을 입력해주세요(띄어쓰기는 \"\n\" : ");
	board2.setContents(sc.next());
	System.out.println("제목 : "+board2.getTitle());
	System.out.println("내용 : "+board2.getContents());
	System.out.println("---------------------------------------------");
	System.out.println("글 작성을 마치시겠습니까?");
	System.out.println("1.네 2. 아니오");
	String a = sc.next();
	switch(a) {
	case "1" :
				board2.setWriter(user.getNick());
				board2.setBoards2(board2);
			break;
		
	case "2" :
		break;
		default : System.out.println("오류 : 잘못 입력하셨습니다!");
	}//switch end
	}//글쓰기 method end
	
	public void write6(Member user) {//자유 게시판 글쓰기
		Board3 board3 = new Board3
				();
	System.out.println("=======================================");
	System.out.println("http://버블.com/자유게시판>글쓰기\n");
	System.out.print("제목을 입력해주세요 :");
	board3.setTitle(sc.next());
	System.out.print("\n내용을 입력해주세요(띄어쓰기는 \"\n\" : ");
	board3.setContents(sc.next());
	System.out.println("제목 : "+board3.getTitle());
	System.out.println("내용 : "+board3.getContents());
	System.out.println("---------------------------------------------");
	System.out.println("글 작성을 마치시겠습니까?");
	System.out.println("1.네 2. 아니오");
	String a = sc.next();
	switch(a) {
	case "1" :
				board3.setWriter(user.getNick());
				board3.setBoards3(board3);
			break;
		
	case "2" :
		break;
		default : System.out.println("오류 : 잘못 입력하셨습니다!");
	}//switch end
	}//글쓰기 method end
	
	public void write7(Member user) {//자유 게시판 글쓰기
		Board4 board4 = new Board4
				();
	System.out.println("=======================================");
	System.out.println("http://버블.com/게임게시판>글쓰기\n");
	System.out.print("제목을 입력해주세요 :");
	board4.setTitle(sc.next());
	System.out.print("\n내용을 입력해주세요(띄어쓰기는 \"\n\" : ");
	board4.setContents(sc.next());
	System.out.println("제목 : "+board4.getTitle());
	System.out.println("내용 : "+board4.getContents());
	System.out.println("---------------------------------------------");
	System.out.println("글 작성을 마치시겠습니까?");
	System.out.println("1.네 2. 아니오");
	String a = sc.next();
	switch(a) {
	case "1" :
				board4.setWriter(user.getNick());
				board4.setBoards4(board4);
			break;
		
	case "2" :
		break;
		default : System.out.println("오류 : 잘못 입력하셨습니다!");
	}//switch end
	}//글쓰기 method end
	
}//class
