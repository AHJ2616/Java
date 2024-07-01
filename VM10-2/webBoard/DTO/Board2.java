package webBoard.DTO;

public class Board2  {
	
	private String title;
	private String contents;
	private String writer;
	private int views;
	private int num;
	public static Board2[] boards2 = new Board2[20];
	
	

	public String getTitle() {
		return title;
	}
	public String getContents() {
		return contents;
	}

	public String getWriter() {
		return writer;
	}
	public int getViews() {
		return views;
	}
	public int getNum() {
		return num;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Board2() {}
	private Board2(String title,String contents,String writer,int views) {
		this.title=title;
		this.contents=contents;
		this.writer=writer;
		this.views=views;
	}
	

	

	
	public void setBoards2(Board2 board2) {// 배열에 저장
		for (int i = 0; i < boards2.length; i++) {
			if (boards2[i] == null) {
				board2.setNum(i+100);
				boards2[i] = board2;
				break; // static 값이어서 this 안써도 정의된다.
			} // if end
		} // for end
	}// 배열에 저장 method end
	
	public void testcode() {// 테스트 코드
		System.out.println("테스트 코드입니다.");
		for (int i = 0; i < boards2.length; i++)
			if (boards2[i] != null) {
				System.out.println(boards2[i].getTitle() + " " + boards2[i].getContents());
			}

	}// 테스트 코드 method end
	
	public void sampleBoard2() {//샘플 추가
		Board2 board2_1 = new Board2("주접멘트 모음","1.너 쌍둥이야? 아니면 너가 세상에서 제일 예쁘겠네\n2.너 경마장 블랙리스트라며,말이 안나오게 예뻐서\n3.너 혼혈이라며, 한국과 천국\n4.너 착한주 알았는데 안착하네. 내마음에 안착.","아니주니",15);
		setBoards2(board2_1);
		Board2 board2_2 = new Board2("주접멘트 모음2","버스기사 아저씨 두명이요, 제 마음속에는 항상 그녀가 살고 있거든요\n2.이제 일주일은 6요일이야. 너 기다리느라 목 빠져서\n3.너 종교있어? 뭘 믿고 그렇게 예뻐?","아니주니",0);
		setBoards2(board2_2);
	
	}
	
public Board2[] getboards2() {
		
		return boards2;}

}//class end
