package pack07.last.jdbc;

import java.util.Scanner;

public class BoardMain {
	// main ==> html, jsp, android app화면 등의 실제 사용자 눈에 보이는 메인화면
	
	public void displayMenu() {
		System.out.println("게시판 프로그램");
		System.out.println("======메뉴======");
		System.out.println("게시글 추가 : I");// CREATE
		System.out.println("게시글 조회 : S");// Read
		System.out.println("게시글 수정 : U");
		System.out.println("게시글 삭제 : D");
		System.out.println("종료 : X");
		System.out.println("================");	
	}
	
	
	
	
	
	public static void main(String[] args) {
		BoardMain bm = new BoardMain();
		BoardDAO dao = new BoardDAO();
		Scanner sc = new Scanner(System.in);
		dao.insertBoard();	
	}
	
}
