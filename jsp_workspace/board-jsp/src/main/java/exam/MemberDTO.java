package exam;

import java.sql.Date;

public class MemberDTO {
	private String id;
	private String pw;
	private String name;
	private Date regidate;
	
	public MemberDTO() {}
	
	
	
	public MemberDTO(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}



	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public Date getRegidate() {
		return regidate;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRegidate(Date regidate) {
		this.regidate = regidate;
	}
	
	
}//class end
