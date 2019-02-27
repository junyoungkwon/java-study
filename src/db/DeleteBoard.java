package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteBoard {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,id,pwd);
			String sql = "delete from board_info where bi_num=?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, 4);
			int cnt = ps.executeUpdate();
			if(cnt ==1) {
				System.out.println("삭제 잘됨!");
			}else {
				System.out.println("어라? 없더라 이미!");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
