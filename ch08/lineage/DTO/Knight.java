package ch08.lineage.DTO;

public class Knight extends Human {//Human class 상속 받음

	//필드
	private String sword;
	private String armor;
	private String shield;
	private static Knight[] knights = new Knight[10];
	
	//메서드
	public String getSword() {
		return sword;
	}
	public String getArmor() {
		return armor;
	}
	public String getShield() {
		return shield;
	}
	public void setSword(String sword) {
		this.sword = sword;
	}
	public void setArmor(String armor) {
		this.armor = armor;
	}
	public void setShield(String shield) {
		this.shield = shield;
	}
	
	public void setKnights(Knight knight) {
		knights[0]=knight;
		
	}
	
	
}//class end
