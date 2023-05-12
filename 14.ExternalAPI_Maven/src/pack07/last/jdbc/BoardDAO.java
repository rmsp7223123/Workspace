package pack07.last.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDAO {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;

	public Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hanul", "0000");
		} catch (Exception e) {
			System.out.println("알수없는 오류발생");
		}
		return conn;
	}

	public void dbClose() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void selectList(String keyword) {
		try {
			conn = getConn(); // db연결객체 초기화
//			ps = conn.prepareStatement("SELECT * FROM board WHERE BOARD_TITLE = '"+keyword+"'");
			ps = conn.prepareStatement("SELECT * FROM board WHERE BOARD_TITLE = ? ");
			ps.setString(1, keyword);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("BOARD_NUM"));
			}
		} catch (SQLException e) {
			System.out.println("MunSqlPlus Exception : " + e.getMessage());
		} finally {
			// conn, ps, rs 세가지 객체 null로 전부 역순으로 비워줘야함(db close)
			dbClose();
		}
	}

	public void insertBoard() {
		try {
			conn = getConn(); // db연결객체 초기화
//			ps = conn.prepareStatement("SELECT * FROM board WHERE BOARD_TITLE = '"+keyword+"'");
			ps = conn.prepareStatement(
					"INSERT INTO BOARD (BOARD_NUM, BOARD_TITLE, BOARD_CONTENT, WRITER, WRITE_DATE) VALUES (?, ?, ?, ?, ?)");
			ps.setInt(1, 6);
			ps.setString(2, "제목6");
			ps.setString(3, "내용6");
			ps.setString(4, "작성자6");
			ps.setString(5, "2023-05-12");
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("MunSqlPlus Exception : " + e.getMessage());
		} finally {
			// conn, ps, rs 세가지 객체 null로 전부 역순으로 비워줘야함(db close)
			dbClose();
		}
	}

}
