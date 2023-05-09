package pack02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import oracle.jdbc.driver.OracleDriver;

public class EmpDAO {// 실제 데이터베이스와 연동하여 요구사항 처리 후 리턴
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

//	데이터베이스 접속(하나의 기능으로 만들고) 재활용 성공하면 ==> ps사용

	public Connection getConn() {

//		접속시 필요한것 : url, user, pw
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "0000";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

	public void testDb() {
		conn = getConn();
		String sql = "select 1 test from dual";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("쿼리 결과 : " + rs.getInt("test"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<EmpDTO> selectEmp() {
		conn = getConn();
		String sql = "select EMPLOYEE_ID, FIRST_NAME||' '|| LAST_NAME name, EMAIL from employees";
		ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				EmpDTO dto = new EmpDTO(rs.getInt("EMPLOYEE_ID"), rs.getString("name"), rs.getString("email"));
				list.add(dto);
				System.out.println(dto.getEmployee_id() + " " + dto.getName() + " " + dto.getEmail());

			}
			System.out.println("총 인원 : " + list.size() + "명");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
