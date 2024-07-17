package com.board.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.board.www.BoardMain;
import com.board.www.dto.MemberDTO;

public class MemberDAO {
	
	//기본 생성자
	public MemberDAO() {}
	
	public boolean login(Connection con,String id,String pw) {//로그인 DAO
		MemberDTO mdto = new MemberDTO();
		String query = "select *  from member where mid=? and mpw = ?";
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1,id);
			pst.setString(2,pw);
			
			ResultSet rs= pst.executeQuery();
			while(rs.next()) {
				mdto.setMid(rs.getString("mid"));
				mdto.setMpw(rs.getString("mpw"));
				mdto.setMno(rs.getInt("mno"));
				mdto.setMdate(rs.getDate("mdate"));
				BoardMain.loginMember = mdto;
				
				rs.close();
				pst.close();
				System.out.println(BoardMain.loginMember.getMid()+"님 정상 로그인 되었습니다.");
				return false;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("로그인 정보가 일치하지 않습니다");
		return true;
	}//로그인 DAO end
	
	public boolean checkId(Connection con,MemberDTO mdto) {
		
		try {
			String query = "select mid from member where mid=?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1,mdto.getMid());
			ResultSet rs = pst.executeQuery();
			if(rs.next()==true) {System.out.println("존재하는 아이디 입니다.");}
			else {System.out.println("사용가능한 아이디 입니다.");
			return false;}
			
			rs.close();
			pst.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return true;
	}//아이디 체크 DAO end
	
	public void register(Connection con,MemberDTO mdto) {//회원가입 DAO
	String query = "insert into member values(bno_seq.nextval,?,?,SYSDATE)";
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1,mdto.getMid());
			pst.setString(2,mdto.getMpw());
			pst.executeUpdate();
			pst.close();
			pst.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}//회원가입 DAO end
	
	public void modify(Connection con,MemberDTO mdto) {//회원정보수정 DAO
		String query = "update member set mpw=? where mpw=? ";
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, mdto.getMpw());
			pst.setString(2, BoardMain.loginMember.getMpw());
			pst.executeUpdate();
			pst.close();
			pst.close();
			System.out.println("비밀번호 변경이 완료 되었습니다.");
			System.out.println("보안을 위해 로그아웃 됩니다.");
			BoardMain.loginMember=null;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}//회원가입 DAO end
	
	public void delete(Connection con) {//회원탈퇴 DAO
		String query = "delete from member where mid=?";
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1,BoardMain.loginMember.getMid());
			pst.executeUpdate();
			pst.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}//회원가입 DAO end
}//class end
