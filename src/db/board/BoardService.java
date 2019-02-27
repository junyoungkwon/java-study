package db.board;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardService {

	public void selectBoard() {
		String sql = "select * from board_info";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("제목");
				System.out.println(rs.getString("bi_title"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
	}

	public void insertBoard(String title, String content) {
		String sql = "insert into board_info(bi_num, bi_title," + "bi_content, bi_credat, bi_cretim)";
		sql += "values(seq_bi_num.nextval,?,?,to_char(sysdate,'YYYYMMDD'),TO_CHAR(SYSDATE,'HH24MISS'))";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			int cnt = ps.executeUpdate();
			if (cnt == 1) {
				System.out.println("게시물이 정상적으로 등록되었습니다.");
			} else {
				System.out.println("게시물 등록이 실패하였습니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
	}

	public void updateBoard(String title, String content, String bi_num) {
		String sql = "update board_info, set bi_title=?,bi_content=? where bi_num=?";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, bi_num);
			int cnt = ps.executeUpdate();
			if (cnt == 1) {
				System.out.println("게시물이 정상적으로 수정되었습니다.");
			} else {
				System.out.println("게시물 수정이 실패하였습니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void deleteBoard() {

	}
}
