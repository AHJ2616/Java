package model1.member;


import java.sql.SQLException;

import common.DBconnectionPool;

public class MemberDAO extends DBconnectionPool {
	
	public MemberDAO() {}

	public int register(MemberDTO memberDTO) {
		int result = 0;
		String query1 = "select id from member where id=?";
		try {
			pst=con.prepareStatement(query1);
			pst.setString(1,memberDTO.getId());
			rs=pst.executeQuery();
			if(rs.next()) {
				result=3;
				return result;
			}
			else {rs.close();
			pst.close();
		
		
		String query = "insert into member (id,pw,name) values(?,?,?)";
		
			pst = con.prepareStatement(query);
			pst.setString(1,memberDTO.getId());
			pst.setString(2,memberDTO.getPw());
			pst.setString(3,memberDTO.getName());
			result = pst.executeUpdate();
			}} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return result;
	}//method end
	
}//class end