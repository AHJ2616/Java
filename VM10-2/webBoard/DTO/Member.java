package webBoard.DTO;

public class Member {

	protected String nick; // 닉네임
	protected String id; // 아이디
	protected String pw; // 패스워드
	protected static Member[] members = new Member[50]; // 맴버 저장 배열
	
	public static Member user = new Member(); //로그인한 회원정보 저장
	protected webBoard.DTO.Board0 board0 = new webBoard.DTO.Board0();
	protected webBoard.DTO.Coment coment = new webBoard.DTO.Coment(); 
	
	// 생성자
	public Member() {
	}

	private Member(String id, String pw, String nick) {
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}

	public String getNick() {
		return nick;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public Member[] getMembers() {
		return members;
	}

	public void setMembers(Member member) {// 배열에 저장
		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) {
				members[i] = member;
				break; // static 값이어서 this 안써도 정의된다.
			} // if end
		} // for end
	}// 배열에 저장 method end

	public void testcode() {// 테스트 코드
		for (int i = 0; i < members.length; i++)
			if (members[i] != null) {
				System.out.println(members[i].getId() + " " + members[i].getNick());
			}

	}// 테스트 코드 method end

	public void sample() {//샘플 추가
		Member member1 = new Member("manger", "javaiseasy", "매니저");
		setMembers(member1);


	}//샘플 추가 method end

}//class end
