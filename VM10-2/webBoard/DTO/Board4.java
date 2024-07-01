package webBoard.DTO;

public class Board4 {

	private String title;
	private String contents;
	private String writer;
	private int views;
	private int num;
	
public static Board4[] boards4 = new Board4[20];
	
	public Board4() {}
	private Board4(String title,String contents,String writer,int views) {
		this.title=title;
		this.contents=contents;
		this.writer=writer;
		this.views=views;
	}
	
public Board4[] getboards4() {
		
		return boards4;}
	
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
	
	public void setBoards4(Board4 board4) {// 배열에 저장
		for (int i = 0; i < boards4.length; i++) {
			if (boards4[i] == null) {
				board4.setNum(i+300);
				boards4[i] = board4;
				break; // static 값이어서 this 안써도 정의된다.
			} // if end
		} // for end
	}// 배열에 저장 method end
	
	public void testcode() {// 테스트 코드
		for (int i = 0; i < boards4.length; i++)
			if (boards4[i] != null) {
				System.out.println(boards4[i].getTitle() + " " + boards4[i].getContents());
			}

	}// 테스트 코드 method end
	
	public void sampleBoard4() {//샘플 추가
		Board4 board4_1 = new Board4("프레이 복귀!","방송 너무너무 재미있네","죽기장인",11);
		setBoards4(board4_1);
		Board4 board4_2 = new Board4("프짱","김밥에 오이는 빼는편이야","김밥오이뺴고",0);
		setBoards4(board4_2);
		Board4 board4_3 = new Board4("징크스궁!","무빙으로 피해주고","죽기장인",0);
		setBoards4(board4_3);

	}//샘플 추가 method end
	
}//class end
