package bank.DTO;

import java.util.*;

public class Financial {//고객정보 중 은행에서 사용되는 정보
	
	private long accountNum;//계좌번호
	private long accountLimit;//계좌한도
	private long accountMoney;//계좌잔고
	private int pw;//계좌 비밀번호
	private static Financial[] financials = new Financial[100];//회원정보 100개제한
	private static Scanner sc = new Scanner(System.in);
	
	// getter
	public long getAccountNum() {
		return accountNum;
	}
	
	public long getAccountLimit() {
		return accountLimit;
	}
	public long getAccountMoney() {
		return accountMoney;
	}
	public int getPw() {
		return pw;
	}
	public Financial[] getFinancials() {
		return financials;
	}
	
	//setter
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}

	public boolean setAccountLimit(long accountLimit) {
		boolean run = true;
		if(accountLimit <=10_000) {
			this.accountLimit = accountLimit;
			run=false;
		} else {System.out.println("오류 : 1억이하 범위에서 입력해 주세요!");}
		
		return run;
	}
	public void setAccountMoney(long accountMoney) {
		this.accountMoney = accountMoney;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public void setFinancials(Financial financial) {
		for(int i =0;i<financials.length;i++)
			if(financials[i]==null) {
		financials[i]=financial;
			break;}
	}
	
	
	
	
	
}//class end
