package com.board.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.board.www.dto.BoardDTO;

public class BoardDAO {//게시판 DAO

	
	
	public void list(Connection con,int x,int y)  {
		
		try {
			
		String query = "select bno,btitle,bwriter,bdate from board where bno>=? and bno <=? order by bno desc";
		
		PreparedStatement pst;
		
			pst = con.prepareStatement(query);
			pst.setInt(1, x);
			pst.setInt(2, y);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
			System.out.println(rs.getInt("bno")+"\t"+rs.getString("btitle")+"\t"+rs.getString("bwriter")+"\t"+rs.getDate("bdate"));
			
		} //while end
				rs.close();
				pst.close();
		} //try end
		catch (SQLException e) {
			System.out.println("BoardDAO.list() query문 오류");
			e.printStackTrace();
		}
		
	}//method end
	
}//class end
