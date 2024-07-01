package webBoard.service;
import java.util.*;

import webBoard.DTO.Board0;
import webBoard.DTO.Coment;
import webBoard.DTO.Member;

public class WriteComent extends webBoard.DTO.Coment {
private static Scanner sc = new Scanner(System.in);

	public void write0(int y,Member user) {//공지사항 코멘트 쓰기
	System.out.print("코멘트 입력 : ");
	String co = sc.next();
	save0(y,co,user);
		
	}//공지사항 코멘트 쓰기 method end
	
	
	public void save0(int y,String co,Member user) {//공지사항 코멘트 저장
		Coment coment = new Coment();
		coment.setNick(user.getNick());
		coment.setNum(y);
		coment.setContents(co);
		try {
		for(int i =0; i<100;i++) {
			if(coment0s[i]==null) {
				coment0s[i]=coment;
				break;
				
			}//if
			
		}//for end
		
		}catch(NullPointerException e) {}
		
	}//공지사항 코멘트 저장 method end
	
	
	public void show0(int y) {//코멘트 보여주기
		try {
		for(int i =0; i<coment0s.length;i++) {
			if(coment0s[i]!=null&&coment0s[i].getNum()==y) {
				System.out.println(coment0s[i].getNick()+"| " +coment0s[i].getContents());
			}
		}
		}catch(NullPointerException e) {}
	}//코멘트 보여주기 method end
	
	public void write1(int y,Member user) {//공지사항 코멘트 쓰기
		System.out.print("코멘트 입력 : ");
		String co = sc.next();
		save2(y,co,user);
			
		}//공지사항 코멘트 쓰기 method end
		
		
		public void save1(int y,String co,Member user) {//공지사항 코멘트 저장
			Coment coment = new Coment();
			coment.setNick(user.getNick());
			coment.setNum(y);
			coment.setContents(co);
			try {
			for(int i =0; i<100;i++) {
				if(coment1s[i]==null) {
					coment1s[i]=coment;

					break;
					
				}//if
				
			}//for end
			
			}catch(NullPointerException e) {}
			
		}//공지사항 코멘트 저장 method end
		
		
		public void show1(int y) {//코멘트 보여주기
			try {
			for(int i =0; i<coment1s.length;i++) {
				if(coment1s[i]!=null&&coment1s[i].getNum()==y) {
					System.out.println(coment1s[i].getNick()+"| " +coment1s[i].getContents());
				}
			}
			}catch(NullPointerException e) {}
		}//코멘트 보여주기 method end
	
	public void write2(int y,Member user) {//공지사항 코멘트 쓰기
		System.out.print("코멘트 입력 : ");
		String co = sc.next();
		save2(y,co,user);
			
		}//공지사항 코멘트 쓰기 method end
		
		
		public void save2(int y,String co,Member user) {//공지사항 코멘트 저장
			Coment coment = new Coment();
			coment.setNick(user.getNick());
			coment.setNum(y);
			coment.setContents(co);
			try {
			for(int i =0; i<100;i++) {
				if(coment2s[i]==null) {
					coment2s[i]=coment;

					break;
					
				}//if
				
			}//for end
			
			}catch(NullPointerException e) {}
			
		}//공지사항 코멘트 저장 method end
		
		
		public void show2(int y) {//코멘트 보여주기
			try {
			for(int i =0; i<coment2s.length;i++) {
				if(coment2s[i]!=null&&coment2s[i].getNum()==y) {
					System.out.println(coment2s[i].getNick()+"| " +coment2s[i].getContents());
				}
			}
			}catch(NullPointerException e) {}
		}//코멘트 보여주기 method end
		
		public void write3(int y,Member user) {//공지사항 코멘트 쓰기
			System.out.print("코멘트 입력 : ");
			String co = sc.next();
			save3(y,co,user);
				
			}//공지사항 코멘트 쓰기 method end
			
			
			public void save3(int y,String co,Member user) {//공지사항 코멘트 저장
				Coment coment = new Coment();
				coment.setNick(user.getNick());
				coment.setNum(y);
				coment.setContents(co);
				try {
				for(int i =0; i<100;i++) {
					if(coment3s[i]==null) {
						coment3s[i]=coment;

						break;
						
					}//if
					
				}//for end
				
				}catch(NullPointerException e) {}
				
			}//공지사항 코멘트 저장 method end
			
			
			public void show3(int y) {//코멘트 보여주기
				try {
				for(int i =0; i<coment3s.length;i++) {
					if(coment3s[i]!=null&&coment3s[i].getNum()==y) {
						System.out.println(coment3s[i].getNick()+"| " +coment3s[i].getContents());
					}
				}
				}catch(NullPointerException e) {}
			}//코멘트 보여주기 method end
			
			public void write4(int y,Member user) {//공지사항 코멘트 쓰기
				System.out.print("코멘트 입력 : ");
				String co = sc.next();
				save3(y,co,user);
					
				}//공지사항 코멘트 쓰기 method end
				
				
				public void save4(int y,String co,Member user) {//공지사항 코멘트 저장
					Coment coment = new Coment();
					coment.setNick(user.getNick());
					coment.setNum(y);
					coment.setContents(co);
					try {
					for(int i =0; i<100;i++) {
						if(coment4s[i]==null) {
							coment4s[i]=coment;

							break;
							
						}//if
						
					}//for end
					
					}catch(NullPointerException e) {}
					
				}//공지사항 코멘트 저장 method end
				
				
				public void show4(int y) {//코멘트 보여주기
					try {
					for(int i =0; i<coment4s.length;i++) {
						if(coment4s[i]!=null&&coment4s[i].getNum()==y) {
							System.out.println(coment4s[i].getNick()+"| " +coment4s[i].getContents());
						}
					}
					}catch(NullPointerException e) {}
				}//코멘트 보여주기 method end
			
}//class end
