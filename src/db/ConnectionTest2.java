package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConnectionTest2 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			String sql = "select BI_NUM, BI_TITLE, BI_CONTENT, BI_CREDAT, BI_CRETIM, BI_CNT, BI_ISACTIVE from board_INFO";
			ResultSet rs = stmt.executeQuery(sql);
			
			List<HashMap<String, String>> rowList = new ArrayList<>();
			while (rs.next()) {
				HashMap<String, String> row = new HashMap<>();
				String biTitle = rs.getString("bi_title");
				String biNum = rs.getString("bi_num");
				String biContent = rs.getString("bi_content");
				String biCredat = rs.getString("bi_credat");
				String biCretim = rs.getString("bi_cretim");
				String biCnt = rs.getString("bi_cnt");
				String biIsActive = rs.getString("bi_isactive");
				row.put("biNum", biNum);
				row.put("biTitle", biTitle);
				row.put("biContent", biContent);
				row.put("biCredat", biCredat);
				row.put("biCreTim", biCretim);
				row.put("biCnt", biCnt);
				row.put("biIsActive", biIsActive);
				rowList.add(row);
			}
			for (int i = 0; i < rowList.size(); i++) {
				System.out.println(rowList.get(i));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
