package edu.kh.test.user.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.kh.test.user.JdbcTemplate;
import edu.kh.test.user.model.vo.UserDTO;

public class UserDAO {
	// PK
	public UserDTO selectOne(Connection conn, int userNo) {
		UserDTO result = null;

		String query = "SELECT USER_NO, USER_ID, USER_NAME, USER_AGE FROM TB_USER WHERE = ?";
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, userNo);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				result=new UserDTO(rset.getInt("user_No"), rset.getString("user_ID"), rset.getString("user_Name"), rset.getInt("user_Age"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rset);
			JdbcTemplate.close(pstmt);
		}

		return result;
	}
}
