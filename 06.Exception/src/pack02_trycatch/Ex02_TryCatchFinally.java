package pack02_trycatch;

public class Ex02_TryCatchFinally {
	public static void main(String[] args) {
		// 가스불,시작,끝,가스불,먹기
		try {
			System.out.println("가스불 ON");
			System.out.println("요리시작");
			int error = 10/0; // 요리하다가 문제 발생
			System.out.println("요리 끝");
			System.out.println("가스불 OFF");
			System.out.println("먹기");
		} catch (Exception e) {
			System.out.println("예외 발생");
		} finally {
//			반드시 실행되어야 하는 로직(코드)이 있다면 넣어주는 부분
			System.out.println("요리 끝");
			System.out.println("가스불 OFF");
			System.out.println("먹기");
		}
	}
}
