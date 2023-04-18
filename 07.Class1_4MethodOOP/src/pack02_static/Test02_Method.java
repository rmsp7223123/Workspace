package pack02_static;

import java.util.Scanner;

public class Test02_Method {
	Scanner login (String id, String pw) {
		if (id.equals("master") && pw.equals("master1234")) {
			System.out.println("로그인이 되었습니다.");
		} else {
			System.out.println("로그인 실패");
			return new Scanner(System.in);
		}
		return new Scanner(System.in);
	}
	
}
