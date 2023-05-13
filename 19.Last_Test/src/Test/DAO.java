package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DAO {
	Scanner sc = new Scanner(System.in);
	DTO dto = new DTO();
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;

	public void menu() {
		while (true) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("0번 취소");
			System.out.println("1번 로그인/로그아웃");
			System.out.println("2번 회원가입");
			System.out.println("3번 회원탈퇴");
			System.out.println("4번 게시판");
			System.out.println("5번 날씨보기");
			String select = sc.nextLine();
			if (select.equals("1")) {

			} else if (select.equals("2")) {
				createAccount();
				break;
			} else if (select.equals("3")) {
				deleteAccount();
				break;
			} else if (select.equals("4")) {

			} else if (select.equals("5")) {

			} else if (select.equals("0")) {
				System.out.println("취소합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}

	}

	public void createAccount() {
		System.out.println("회원가입을 선택하셨습니다.");
		System.out.println("아이디 :\n비밀번호 :\n이름 :\n전화번호 :\n나이 :");
		String createSelect;
		while (true) {
			System.out.println("아이디(10글자이내)를 입력해주세요.");
			String id = sc.nextLine();
			while (true) {
				System.out.println("입력하신 아이디가" + id + "가 맞으시면 1번 다시 입력하시려면 0번을입력해주세요.");
				createSelect = sc.nextLine();
				if (createSelect.equals("1")) {
					dto.setId(id);
					break;
				} else if (createSelect.equals("0")) {
					break;
				} else {
					System.out.println("잘못입력하셨습니다.");
				}
			}
			if (createSelect.equals("1")) {
				break;
			}
		}
		while (true) {
			System.out.println("비밀번호(10글자이내)를 입력해주세요.");
			String pw = sc.nextLine();
			while (true) {
				System.out.println("입력하신 비밀번호" + pw + "가 맞으시면 1번 다시 입력하시려면 0번을입력해주세요.");
				createSelect = sc.nextLine();
				if (createSelect.equals("1")) {
					dto.setPw(pw);
					break;
				} else if (createSelect.equals("0")) {
					break;
				} else {
					System.out.println("잘못입력하셨습니다.");
				}
			}
			if (createSelect.equals("1")) {
				break;
			}
		}
		while (true) {
			System.out.println("이름(5글자이내)을 입력해주세요.");
			String name = sc.nextLine();
			while (true) {
				System.out.println("입력하신 이름이" + name + "가 맞으시면 1번 다시 입력하시려면 0번을입력해주세요.");
				createSelect = sc.nextLine();
				if (createSelect.equals("1")) {
					dto.setName(name);
					break;
				} else if (createSelect.equals("0")) {
					break;
				} else {
					System.out.println("잘못입력하셨습니다.");
				}
			}
			if (createSelect.equals("1")) {
				break;
			}
		}
		while (true) {
			System.out.println("전화번호를 입력해주세요.");
			String call = sc.nextLine();
			while (true) {
				System.out.println("입력하신 전화번호가" + call + "가 맞으시면 1번 다시 입력하시려면 0번을입력해주세요.");
				createSelect = sc.nextLine();
				if (createSelect.equals("1")) {
					dto.setCall(call);
					break;
				} else if (createSelect.equals("0")) {
					break;
				} else {
					System.out.println("잘못입력하셨습니다.");
				}
			}
			if (createSelect.equals("1")) {
				break;
			}
		}
		while (true) {
			try {
				System.out.println("나이를 입력해주세요.");
				int age = Integer.parseInt(sc.nextLine());
				while (true) {
					System.out.println("입력하신 나이가" + age + "가 맞으시면 1번 다시 입력하시려면 0번을입력해주세요.");
					createSelect = sc.nextLine();
					if (createSelect.equals("1")) {
						dto.setAge(age);
						break;
					} else if (createSelect.equals("0")) {
						break;
					} else {
						System.out.println("잘못입력하셨습니다.");
					}
				}
				if (createSelect.equals("1")) {
					break;
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
			}

		}
		System.out.println("아이디 : " + dto.getId());
		System.out.println("비밀번호 : " + dto.getPw());
		System.out.println("이름 : " + dto.getName());
		System.out.println("전화번호 : " + dto.getCall());
		System.out.println("나이 : " + dto.getAge());
		System.out.println("회원가입이 완료되었습니다.");
		try {
			conn = getConn();
			ps = conn.prepareStatement(
					"INSERT INTO MEMBER (MEMBER_ID, MEMBER_PW, MEMBER_NAME, MEMBER_CALL, MEMBER_AGE) VALUES (?, ?, ?, ?, ?)");
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getCall());
			ps.setInt(5, dto.getAge());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("오류");
			e.printStackTrace();
		} finally {
			dbClose();
		}
		menu();
	}

	public void deleteAccount() {
		String id, pw;
		String deleteSelect;
		String deleteId;
		String deletePw;
		System.out.println("회원 탈퇴를 선택하셨습니다.");
		while (true) {
			System.out.println("1번을 누르면 회원탈퇴를 진행합니다.");
			System.out.println("0번을 누르면 탈퇴를 취소하고 이전화면으로 이동합니다.");
			deleteSelect = sc.nextLine();
			if (deleteSelect.equals("1")) {
				while (true) {
					System.out.println("아이디를 입력해주세요.");
					id = sc.nextLine();
					System.out.println("입력하신 아이디가 " + id + "가 맞으시면 1번 다시 입력하시려면 2번 이전화면으로 이동하시려면 0번을 입력해주세요.");
					deleteId = sc.nextLine();
					if (deleteId.equals("1")) {

					} else if (deleteId.equals("2")) {
						continue;
					} else if (deleteId.equals("0")) {
						System.out.println("이전화면으로 이동합니다.");
						break;
					} else {
						System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
					}
				}
			} else if (deleteSelect.equals("0")) {
				System.out.println("회원탈퇴를 취소합니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
			}
		}
		menu();
	}

	public Connection getConn() {
		String url = "jdbc:oracle:thin:@211.223.59.99:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hanul", "0000");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류");
		}
		return conn;
	}

	public void dbClose() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
