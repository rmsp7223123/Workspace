package pack03.mysqlplus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlDAO {
	Connection conn; // sqlplus에서 실제로 사용자명과 비밀번호를 입력받았을 때 접속을 시도하는 연결객체
	PreparedStatement ps; // 쿼리를 전송하고 실행하는 객체
	ResultSet rs; // 결과를 받아오기위한 객체

	public boolean checkConnection(String user, String password) {
		System.out.println("check : " + user + " " + password);
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		oracle.jdbc.driver.OracleDriver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);

			if (!conn.isClosed()) {
				System.out.println("다음에 접속됨" + conn.getMetaData().getDatabaseProductVersion());
				return true;
			}
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 준비가 안돼 사용이 불가능한 PC입니다.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("알수없는 오류발생");
		}
		return false;
	}

	public void sendSql(String sql) {
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				for (int i = 1; i < rs.getMetaData().getColumnCount(); i++) {
					System.out.print(rs.getString(i));
				}
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("MunSqlPlus Exception : " + e.getMessage());
		}
	}

}
