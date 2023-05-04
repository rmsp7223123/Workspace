package test2;

import java.util.Scanner;

public class b2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID를 입력해주세요");
		String userId = sc.nextLine();
		System.out.println("PW를 입력해주세요.");
		String userPw = sc.nextLine();
		if (userId.equals("admin") && userPw.equals("admin1234")) {
			System.out.println("아이디 입력 : " + userId);
			System.out.println("패스워드 입력 : " + userPw);
			System.out.println("로그인 중입니다.");
			System.out.println(userId + "님 접속");
		} else {
			System.out.println("아이디 입력 : " + userId);
			System.out.println("패스워드 입력 : " + userPw);
			System.out.println("로그인 중입니다.");
			System.out.println("로그인 실패 아이디 또는 비밀번호를 확인해주세요.");
		}

	}
}
