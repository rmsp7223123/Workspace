package pack04.db;

public class HtmlMain {
	public static void main(String[] args) {
		dbWork(new MysqlDAO());
		dbWork(new OracleDAO());
	}

	// Oracle or Mysql을 입력받아 select~delete 하는 메소드
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
}
