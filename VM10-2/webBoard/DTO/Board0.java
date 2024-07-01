package webBoard.DTO;

public class Board0 {

	private String title;
	private String contents;
	private int views;
	private int num;
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}

	private String writer;
	public static Board0[] boards0 = new Board0[20];
	
	public Board0() {}
	private Board0(String title,String contents,String writer,int views,int num) {
		this.title=title;
		this.contents=contents;
		this.writer=writer;
		this.views=views;
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public String getContents() {
		return contents;
	}
	public int getViews() {
		return views;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public static Board0[] getBoards0() {
		return boards0;
	}
	public void setViews(int views) {
		this.views = views;
	}
	
	public void setBoards0(Board0 board0) {// 배열에 저장
		for (int i = 0; i < boards0.length; i++) {
			if (boards0[i] == null) {
				boards0[i] = board0;
				break; // static 값이어서 this 안써도 정의된다.
			} // if end
		} // for end
	}// 배열에 저장 method end
	
	public void testcode() {// 테스트 코드
		for (int i = 0; i < boards0.length; i++)
			if (boards0[i] != null) {
				System.out.println(boards0[i].getTitle() + " " + boards0[i].getContents());
			}

	}// 테스트 코드 method end
	
	public void sampleBoard0() {//샘플 추가
		Board0 board0_1 = new Board0("인삿말","회원가입을 감사드립니다","매니저",0,0);
		setBoards0(board0_1);
		Board0 board0_2 = new Board0("글쓰기 공지사항","이곳은 익명과 자유로움을 추구하는 커뮤니티 입니다.\n죄송스럽지만 글 작성중에 엔터키를 눌러서 줄바꿈을 원하시면\"\n\"을 입력해 주세요.","매니저",0,1);
		setBoards0(board0_2);
		Board0 board0_3 = new Board0("게시판 공지사항","베스트 게시판은 조회수가 10 이상되면 자동으로 이동됩니다!","매니저",0,2);
		setBoards0(board0_3);

	}//샘플 추가 method end
	
}
