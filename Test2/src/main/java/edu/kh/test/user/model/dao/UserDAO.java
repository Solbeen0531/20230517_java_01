package edu.kh.test.user.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.kh.test.user.JdbcTemplate;
import edu.kh.test.user.model.vo.User;

public class UserDAO {

	public User selectOne(Connection conn, String userId) {
//		USER_NO NUMBER PRIMARY KEY,
//		USER_ID VARCHAR2(50) UNIQUE NOT NULL,
//		USER_NAME VARCHAR2(50) NOT NULL,
//		USER_AGE NUMBER NOT NULL
		User result = null;

		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "SELECT USER_NO,USER_ID,USER_NAME,USER_AGE FROM TB_USER WHERE USER_ID = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, query);
			rset = pstmt.executeQuery();

			if (rset.next()) {
				result = new User(rset.getInt("user_No"), rset.getString("user_Id"), rset.getString("user_Name"),
						rset.getInt("user_Age"));
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
