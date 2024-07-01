package ch08.lineage.DTO;

public class Account {
	//필드
	private String id;
	private String pw;
	private String nick;
	public static Account[] accounts = new Account[10];
	private Human human;//부모 호출
	
	
	//메서드
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getNick() {
		return nick;
	}


	
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Human getHuman() {
		return human;
	}
	public void setHuman(Human human) {
		this.human = human;
	}
	
	
	public void setAccounts(Account account) {
		for(int i = 0 ; i<accounts.length;i++)
		{if(accounts[i]==null) {
			accounts[i]=account;break;
		}
		}
			
	}
	
	//생성자
	
	
	

}//class
