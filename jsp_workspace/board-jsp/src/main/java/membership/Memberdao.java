package membership;

import java.sql.SQLException;

import common.DBconnectionPool;

public class Memberdao extends DBconnectionPool { //jdbc 처리 용도
	//JDBConnect를 상속받아서 기본생성자를 만들 필요가 없다.
	
	
	//사용자 지정 생성자
	public Memberdao() {}
	
	public Memberdto getMemberdto(String id,String pw) {
		Memberdto memberdto = new Memberdto();
		try {
		String query = "select * from member where id=? and pw=?";
		pst = con.prepareStatement(query);
		pst.setString(1, id);
		pst.setString(2, pw);
		rs = pst.executeQuery();
		
		if(rs.next()) {
			memberdto.setId(rs.getString("id"));
			memberdto.setPw(rs.getString("pw"));
			memberdto.setName(rs.getString("name"));
			memberdto.setRegdate(rs.getDate("regidate")); //Date타입도 String으로 get할 수 있다
		}
		
		} catch (SQLException e) {
			System.out.println("Memberdao.getMemberdto 오류");
			e.printStackTrace();
		}
		
		
		return memberdto;
	} 
	
}//class end
