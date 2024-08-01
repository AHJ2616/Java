package fileUpload;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import common.DBconnectionPool;

public class MyfileDAO extends DBconnectionPool{

	//입력
	public int insert_file(MyfileDTO dto) {
		int result=0;
		String query= "insert into myfile(f_num,f_name,f_title,f_category,f_original,saved_name)"
				+ "values(f_num_seq.nextval,?,?,?,?,?)";
		try {
			pst=con.prepareStatement(query);
			pst.setString(1,dto.getF_name());
			pst.setString(2,dto.getF_title());
			pst.setString(3,dto.getF_category());
			pst.setString(4,dto.getF_original());
			pst.setString(5,dto.getSaved_name());
			result = pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("MyfileDAO.insert_file 오류");
			e.printStackTrace();
		}
		
		
		return result;
	}//method end
	
	//파일 리스트 출력하기
		public List<MyfileDTO> show_file() {
			List<MyfileDTO> file_list = new Vector<MyfileDTO>();
			String query ="select * from myfile order by f_num desc"; //query문에서 정렬시 index가 있는 column선택 하기
			
			try {
				st=con.createStatement();
				rs=st.executeQuery(query);
				while(rs.next()) {
				MyfileDTO dto = new MyfileDTO();
					dto.setF_num(rs.getString(1));
					dto.setF_name(rs.getString(2));
					dto.setF_title(rs.getString(3));
					dto.setF_category(rs.getString(4));
					dto.setF_original(rs.getString(5));
					dto.setSaved_name(rs.getString(6));
					dto.setF_postdate(rs.getString(7));
					file_list.add(dto);
				}
			} catch (SQLException e) {
				System.out.println("MyfileDAO.show_file 오류");
				e.printStackTrace();
			}
			
			return file_list;
		}//method end
		
		//수정
		public int modify_file(MyfileDTO dto) {
			int result=0;
			
			return result;
		}//method end
		
		//삭제
		public int delete_file(MyfileDTO dto) {
			int result=0;
			
			return result;
		}//method end
	
}//class end
