package webBoard.DTO;

public class Board3 {
	private String title;
	private String contents;
	private String writer;
	private int views;
	private int num;
	
public static Board3[] boards3 = new Board3[20];
	
	public Board3() {}
	private Board3(String title,String contents,String writer,int views) {
		this.title=title;
		this.contents=contents;
		this.writer=writer;
		this.views=views;
	}
	
public Board3[] getboards3() {
		
		return boards3;}
	
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
	
	public void setBoards3(Board3 board3) {// 배열에 저장
		for (int i = 0; i < boards3.length; i++) {
			if (boards3[i] == null) {
				board3.setNum(i+200);
				boards3[i] = board3;
				break; // static 값이어서 this 안써도 정의된다.
			} // if end
		} // for end
	}// 배열에 저장 method end
	
	public void testcode() {// 테스트 코드
		for (int i = 0; i < boards3.length; i++)
			if (boards3[i] != null) {
				System.out.println(boards3[i].getTitle() + " " + boards3[i].getContents());
			}

	}// 테스트 코드 method end
	
	public void sampleBoard3() {//샘플 추가
		Board3 board3_1 = new Board3("내가 조장이라니.. 누가 조장한것인지..","무섭고 떨리고 그러네요 ㅎㅎ\n잘 부탁 드립니다","아니주니",11);
		setBoards3(board3_1);
		Board3 board3_2 = new Board3("조원 구합니다","상상력이 풍부하고 수학좋아하는 분 환영합니다!\n근데 사실 아무도 지원 안할까봐 무섭네요ㅠ","아니주니",13);
		setBoards3(board3_2);
		Board3 board3_3 = new Board3("미래의 조원분에게","강요는 절대 없어요, 다 할 수 있는만큼만 합시다 최선을 다해!","아니주니",0);
		setBoards3(board3_3);

	}//샘플 추가 method end
	
	
	
}
