package bank.DTO;

import java.util.*;

public class NonFinancial {// 회원가입 시 받은 고객의 기본정보 저장
	private int num;//고객번호 (정보 연동용)
	private String name;//이름
	private String address;//주소
	private long phoneNum;//휴대폰번호
	private long residentNum;//주민번호
	private static NonFinancial[] nonFinancials = new NonFinancial[100];

	
	// getter

	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public long getResidentNum() {
		return residentNum;
	}
	
	public NonFinancial[] getNFs() {
		return nonFinancials;
	};
	
	
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setResidentNum(long residentNum) {
		
		this.residentNum = residentNum;
	}
	public void setNFs(NonFinancial nonFinancial) {//유저정보 배열에 저장
		for(int i =0;i<nonFinancials.length;i++)
			if(nonFinancials[i]==null) {
		nonFinancials[i]=nonFinancial;
		nonFinancials[i].num=i;
			break;}
		
		
	}//유저정보 저장 method end

	@Override
	public String toString() {
		return "NonFinancial [name=" + name + ", address=" + address + ", phoneNum=" + phoneNum + ", residentNum="
				+ residentNum + "]";
	}//오버라이드 end
	
	public void print() {//프린트
		System.out.println(nonFinancials[0].toString());
		
	}//프린트 method end
	
}//class end
