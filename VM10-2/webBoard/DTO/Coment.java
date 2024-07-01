package webBoard.DTO;

public class Coment {//댓글 class

	private String nick; //작성자
	private String contents;//내용
	private int num;//게시글과 연동
	public static Coment[]coment0s = new Coment[100];
	public static Coment[]coment1s = new Coment[100];
	public static Coment[]coment2s = new Coment[100];
	public static Coment[]coment3s = new Coment[100];
	public static Coment[]coment4s = new Coment[100];
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getNick() {
		return nick;
	}
	public String getContents() {
		return contents;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	
	
}//class end
