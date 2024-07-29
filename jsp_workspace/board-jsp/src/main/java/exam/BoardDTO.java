package exam;

import java.sql.Date;

public class BoardDTO {

	private int b_num;
	private String b_title;
	private String b_contents;
	private String b_id;
	private Date b_postdate;
	private int b_count;
	
	public BoardDTO() {}
	
	

	public BoardDTO(String b_title, String b_contents, String b_id) {
		super();
		this.b_title = b_title;
		this.b_contents = b_contents;
		this.b_id = b_id;
	}



	public int getB_num() {
		return b_num;
	}

	public String getB_title() {
		return b_title;
	}

	public String getB_contents() {
		return b_contents;
	}

	public String getB_id() {
		return b_id;
	}

	public Date getB_postdate() {
		return b_postdate;
	}

	public int getB_count() {
		return b_count;
	}

	public void setB_num(int b_num) {
		this.b_num = b_num;
	}

	public void setB_title(String b_title) {
		this.b_title = b_title;
	}

	public void setB_contents(String b_contents) {
		this.b_contents = b_contents;
	}

	public void setB_id(String b_id) {
		this.b_id = b_id;
	}

	public void setB_postdate(Date b_postdate) {
		this.b_postdate = b_postdate;
	}

	public void setB_count(int b_count) {
		this.b_count = b_count;
	}
	
	
	
}//class end
