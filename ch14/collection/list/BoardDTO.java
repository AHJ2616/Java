package ch14.collection.list;

public class BoardDTO { //list도 .set은 사용하지 말자! 객체를 만들어서 한방에 집어넣야 nullException이 안뜬다.
	// 필드
	private String subject;
	private String contents;
	private String writer;
	// 생성자
	public BoardDTO() {}
	public BoardDTO(String subject, String contents, String writer) {
		super();
		this.subject = subject;
		this.contents = contents;
		this.writer = writer;
	}
	// 메서드

	public String getSubject() {
		return subject;
	}

	
	

	public String getContents() {
		return contents;
	}

	public String getWriter() {
		return writer;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "BoardDTO [subject=" + subject + ", contents=" + contents + ", writer=" + writer + ", getSubject()="
				+ getSubject() + ", getContents()=" + getContents() + ", getWriter()=" + getWriter() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}// class end
