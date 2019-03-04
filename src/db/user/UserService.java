package db.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.board.DBCon;
import db.board2.BoardInfoVO;

public class UserService {

	public List<UserInfoVO> selectUser() {
		String sql = "select * from user_info, board_info bi, user_info ui where bi.ui_num=ui.ui_num";
		Connection con = DBCon.getCon();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<UserInfoVO> userList = new ArrayList<>();
			while (rs.next()) {
				UserInfoVO ui = new UserInfoVO();
				ui.setUiNum(rs.getInt("ui_num"));
				ui.setUiName(rs.getString("ui_name"));
				ui.setUiId(rs.getString("ui_id"));
				ui.setUiPwd(rs.getString("ui_pwd"));
				ui.setUiEmail(rs.getString("ui_email"));
				userList.add(ui);
			}
			return userList;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	public List<BoardInfoVO> selectBoard(BoardInfoVO bivo) {
		String sql = "select bi.*, ui.ui_name from board_info bi, user_info u2i where bi.ui_num = ui.ui_num";
		if(bivo.getBiTitle()!=null) {
			sql += " and bi.bi_title=?";					
		}
		if(bivo.getBiContent()!=null) {
			sql += " and bi.bi_content=?";
		}
		if(bivo.getUiName()!=null) {
			sql += " and ui.ui_name=?";
		}
		Connection con = DBCon.getCon();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			if(bivo.getBiTitle()!=null) {
				ps.setString(1,  bivo.getBiTitle());					
			}
			if(bivo.getBiContent()!=null) {
				ps.setString(1,  bivo.getBiContent());
			}
			if(bivo.getUiName()!=null) {
				ps.setString(1,  bivo.getUiName());
			}
			ResultSet rs = ps.executeQuery();
			List<BoardInfoVO> biList = new ArrayList<>();
			while (rs.next()) {
				BoardInfoVO bi = new BoardInfoVO();
				bi.setBiNum(rs.getInt("bi_Num"));
				bi.setBiTitle(rs.getString("bi_Title"));
				bi.setBiContent(rs.getString("bi_Content"));
				bi.setBiCredat(rs.getString("bi_Credat"));
				bi.setBiCretim(rs.getString("bi_Cretim"));
				bi.setBiIsactive(rs.getString("bi_Isactive"));
				bi.setUiNum(rs.getInt("ui_Num"));
				bi.setUiName(rs.getString("ui_Name"));
				biList.add(bi);
			}
			return biList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
