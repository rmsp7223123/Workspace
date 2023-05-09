package pack02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex01_Jdbc {
	public static void main(String[] args) {
//		JDBC : JavaDataBaseConnectivity (API)
//		Connection : 연결객체(SqlDeveloper에서 접속정보를 넣고 연결을 하는 창)
//		Statement : 전송객체(Sql문을 작성하고 실행했을 때 실행되는 에디터 창)
//		ResultSet : 결과객체(select문의 경우 결과가 표모양으로 밑에 나옴 ==> 표)
//		OracleDriver : (오라클에 접속하기 위해서는) 해당클래스가 필요

		Ex01_Jdbc jdbc = new Ex01_Jdbc();
		jdbc.connTest();
	}

//	자바코드를 통해서 데이터베이스에 접속이가능한지 확인하는 메소드
	public void connTest() { // localhost == 127.0.0.1(oracle local)
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // java에서 oracle 접속할 때 앞에 고정된 것
		String user = "hr";
		String password = "0000";

//		클래스 동적로딩(클래스를 인스턴스화 하는게 아닌 자바 static으로 자바에서 사용할 수 있게 만듦)
//		오라클 접속할 때만 사용(API)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = conn.prepareStatement("select 1 data1 from dual"); // ; 생략
			ResultSet rs = ps.executeQuery(); // 쿼리 실행 후 결과를 rs에 저장
			while (rs.next()) {
				System.out.println(rs.getInt("data1"));// getInt는 데이터 결과가 숫자형일때 쓰는 메소드
//														메소드가 int값과 String값을 받을 수 있게 오버로딩되어있는데
//														String을 사용함 => 컬럼의 이름으로 데이터를 가져오는게 정확함
			}
			if (conn.isClosed()) {
				System.out.println("닫힘");
			} else {
				System.out.println("열림");
			}
		} catch (Exception e) {// exception
			e.printStackTrace();
		}
	}
}
