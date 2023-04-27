package pack04.db;

public class OracleDAO implements DataAccessObject {

	@Override
	public void select() {
		System.out.println(IP + "에 접근해서 Oracle Select");
	}

	@Override
	public void insert() {
		System.out.println(IP + "에 접근해서 Oracle Insert");
	}

	@Override
	public void update() {
		System.out.println(IP + "에 접근해서 Oracle Update");
	}

	@Override
	public void delete() {
		System.out.println(IP + "에 접근해서 Oracle Delete");
	}

}
