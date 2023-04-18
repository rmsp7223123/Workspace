package pack02_static;

public class Test01_Method {
	boolean login (String id, String pw) {
		
		if (id.equals("master") && pw.equals("master1234")) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("로그인 실패");
			return false;
		}
		return true;  
	}
}
