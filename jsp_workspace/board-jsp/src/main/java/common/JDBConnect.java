package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContext;

public class JDBConnect {

	public Connection con;
	public Statement st;
	public PreparedStatement pst;
	public ResultSet rs;
	
	
	public JDBConnect() {//기본 생성자
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:orcle:thin:@192.168.111.101:1521:xe";
			String id = "jsp";
			String pw = "1234";
			con = DriverManager.getConnection(url,id,pw);
			System.out.println("연결성공");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public JDBConnect(String driver,String url,String id,String pw) {//커스텀 생성자
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,id,pw);
			System.out.println("연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("driver 오류");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("url,id,pw 오류");
			e.printStackTrace();
		}
		
		
	}//커스텀 생성자 end
	
	public JDBConnect(ServletContext application) {//application 바로 꽂기
		String driver = application.getInitParameter("OracleDriver");
		String url = application.getInitParameter("OracleUrl");
		String id = application.getInitParameter("OracleId");
		String pw = application.getInitParameter("OraclePw");
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,id,pw);
			System.out.println("연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("driver 오류");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("url,id,pw 오류");
			e.printStackTrace();
		}
		
		
	}
	
	
	public void close() {//연결종료 메서드
		
			try {
			if(rs != null) {rs.close();} 
			if(pst!=null) {pst.close();}
			if(st!=null) {pst.close();}
			if(con!=null) {con.close();}
			System.out.println("닫기 성공");
			}catch (SQLException e) {
				System.out.println("정상으로 close() 되지 않았습니다");
				System.exit(0);
				e.printStackTrace();
			}
		
		
	}//method end
	
	
}//class end


