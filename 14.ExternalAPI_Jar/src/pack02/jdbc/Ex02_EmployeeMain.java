package pack02.jdbc;

import java.sql.SQLException;

public class Ex02_EmployeeMain {
	public static void main(String[] args) throws SQLException {
//		number == int, 이름 String, 이메일 String은 하나의 행으로 같이 움직이는 데이터(EmpDTO)
//		sqldev를 대신해 자바코드로 쿼리문을 작성하여 실행하고 결과를 받아옴(EmpDAO)
//		Connection(접속), Statement(전송, 실행), ResultSet(결과)
		
		EmpDAO dao = new EmpDAO();
		if (dao.getConn().isClosed()) {
			System.out.println("닫힘");
		} else {
			System.out.println("열림");
		}
		dao.selectEmp();
	}
}
