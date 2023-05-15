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
		String loginSelect;
		while (true) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("0번 취소");
			System.out.println("1번 로그인/로그아웃");
			System.out.println("2번 회원가입");
			System.out.println("3번 회원탈퇴");
			System.out.println("4번 회원정보보기 및 수정");
			System.out.println("5번 게시판");
			System.out.println("5번 날씨보기");
			String select = sc.nextLine();
			if (select.equals("1")) {
//				로그인 상태시 로그아웃메소드로, 로그아웃 상태시 로그인 메소드로 이동하게
				if (dto.getState().equals("off")) {
//					로그아웃 상태이니 로그인창(메소드 만들어서 setState(on)) 유도 or 이전화면
					while (true) {
						System.out.println("로그아웃 상태입니다. 로그인하시려면 1번 취소하시려면 0번을 입력해주세요.");
						loginSelect = sc.nextLine();
						if (loginSelect.equals("1")) {
							login();
							break;
						} else if (loginSelect.equals("0")) {
							System.out.println("취소합니다.");
							break;
						} else {
							System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
						}
					}
				}
				if (dto.getState().equals("on")) {
					logout();
				}
			} else if (select.equals("2")) {
				createAccount();
				break;
			} else if (select.equals("3")) {
				deleteAccount();
				break;
			} else if (select.equals("4")) {
//				회원정보보기 및 수정
				Account();
			} else if (select.equals("5")) {
//				게시판
			} else if (select.equals("6")) {
//				공공데이터 광주 날씨보기 추가
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
			boolean isDuplicated = checkDuplicatedId(id);
			if (isDuplicated) {
				System.out.println("이미 사용중인 아이디입니다. 다시 입력해주세요.");
				continue;
			} else {
				dto.setId(id);
			}
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
		dto.setPw(showMsgRtnStr("비밀번호(10글자이내)를 입력해주세요."));
		dto.setName(showMsgRtnStr("이름(5글자이내)을 입력해주세요."));
		dto.setCall(showMsgRtnStr("전화번호를 입력해주세요."));
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

	private boolean checkDuplicatedId(String id) {
		boolean result = false;
		try {
			conn = getConn();
			ps = conn.prepareStatement("SELECT MEMBER_ID FROM MEMBER WHERE MEMBER_ID = ?");
			ps.setString(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				result = true;
			}
		} catch (SQLException e) {
			System.out.println("오류");
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return result;
	}

	public void deleteAccount() {
		String id, pw;
		String deleteSelect;
		String deleteId;
		String deletePw = null;
		System.out.println("회원 탈퇴를 선택하셨습니다.");
		while (true) {
			System.out.println("1번을 누르면 회원탈퇴를 진행합니다.");
			System.out.println("0번을 누르면 탈퇴를 취소하고 이전화면으로 이동합니다.");
			deleteSelect = sc.nextLine();
			if (deleteSelect.equals("1")) {
				while (true) {
					System.out.println("아이디를 입력해주세요.");
					id = sc.nextLine();
					while (true) {
						System.out.println("입력하신 아이디가 " + id + "가 맞으시면 1번을, 다시 입력하시려면 2번을, 이전화면으로 이동하시려면 0번을 입력해주세요.");
						deleteId = sc.nextLine();
						if (deleteId.equals("1")) {
							while (true) {
								System.out.println("비밀번호를 입력해주세요.");
								pw = sc.nextLine();
								while (true) {
									System.out.println(
											"입력하신 비밀번호가 : " + pw + " 가 맞으시면 1번을, 다시입력하시려면 2번을, 취소하시려면 0번을 입력해주세요.");
									deletePw = sc.nextLine();
									if (deletePw.equals("1")) {
										try {
											conn = getConn();
											ps = conn.prepareStatement(
													"DELETE FROM MEMBER WHERE MEMBER_ID = ? AND MEMBER_PW = ?");
											ps.setString(1, id);
											ps.setString(2, pw);
											int result = ps.executeUpdate();
											if (result >= 1) {
												System.out.println("회원탈퇴 되었습니다.");
												break;
											} else {
												System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
												break;
											}
										} catch (SQLException e) {
											System.out.println("오류");
											e.printStackTrace();
										} finally {
											dbClose();
										}

									} else if (deletePw.equals("2")) {
										break;
									} else if (deletePw.equals("0")) {
										break;
									} else {
										System.out.println("잘못 입력하셨습니다.");
									}
								}
								if (deletePw.equals("0")) {
									break;
								}
							}
						} else if (deleteId.equals("2")) {
							break;
						} else if (deleteId.equals("0")) {
							System.out.println("이전화면으로 이동합니다.");
							break;
						} else {
							System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
						}
						if (deletePw.equals("0")) {
							break;
						}
					}
					if (deleteId.equals("1") || deleteId.equals("0")) {
						break;
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

	public void login() {
		String id, pw;
		String loginId;
		String loginPw = null;
		String loginSelect;
		while (true) {
			System.out.println("1번을 누르면 로그인를 진행합니다.");
			System.out.println("0번을 누르면 로그인을 취소하고 이전화면으로 이동합니다.");
			loginSelect = sc.nextLine();
			if (loginSelect.equals("1")) {
				while (true) {
					System.out.println("아이디를 입력해주세요.");
					id = sc.nextLine();
					while (true) {
						System.out.println("입력하신 아이디가 " + id + "가 맞으시면 1번을, 다시 입력하시려면 2번을, 이전화면으로 이동하시려면 0번을 입력해주세요.");
						loginId = sc.nextLine();
						if (loginId.equals("1")) {
							while (true) {
								System.out.println("비밀번호를 입력해주세요.");
								pw = sc.nextLine();
								while (true) {
									System.out.println(
											"입력하신 비밀번호가 : " + pw + " 가 맞으시면 1번을, 다시입력하시려면 2번을, 취소하시려면 0번을 입력해주세요.");
									loginPw = sc.nextLine();
									if (loginPw.equals("1")) {
										try {
											conn = getConn();
											ps = conn.prepareStatement(
													"SELECT * FROM MEMBER WHERE MEMBER_ID = ? AND MEMBER_PW = ? ");
											ps.setString(1, id);
											ps.setString(2, pw);
											rs = ps.executeQuery();
											if (rs.next()) {
												System.out.println("로그인 되었습니다.");
												dto.setState("on");
												break;
											} else {
												System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
												break;
											}
										} catch (SQLException e) {
											System.out.println("오류");
											e.printStackTrace();
										} finally {
											dbClose();
										}
									} else if (loginPw.equals("2")) {
										break;
									} else if (loginPw.equals("0")) {
										break;
									} else {
										System.out.println("잘못 입력하셨습니다.");
									}
								}
								if (loginPw.equals("0") || loginPw.equals("1")) {
									break;
								}
							}
						} else if (loginId.equals("2")) {
							break;
						} else if (loginId.equals("0")) {
							System.out.println("이전화면으로 이동합니다.");
							break;
						} else {
							System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
						}
						if (loginPw.equals("0")) {
							break;
						}
						break;
					}
					if (loginId.equals("1") || loginId.equals("0")) {
						break;
					}
				}
			} else if (loginSelect.equals("0")) {
				System.out.println("로그인을 취소합니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
			}
			break;
		}
		menu();
	}

	public void logout() {
		String logoutSelect;
		while (true) {
			System.out.println("로그아웃 하시려면 1번을 취소하시려면 0번을 입력해주세요.");
			logoutSelect = sc.nextLine();
			if (logoutSelect.equals("1")) {
				dto.setState("off");
				System.out.println("로그아웃 되었습니다.");
				break;
			} else if (logoutSelect.equals("0")) {
				System.out.println("취소하셨습니다.");
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

	public String showMsgRtnStr(String msg) {
		String createSelect = null;
		String rtnTemp = null;
		while (true) {
			System.out.println(msg);
			rtnTemp = sc.nextLine();
			while (true) {
				System.out.println("입력하신 값 " + rtnTemp + " 가 맞으시면 1번 다시 입력하시려면 0번을입력해주세요.");
				createSelect = sc.nextLine();
				if (createSelect.equals("1")) {
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
		return rtnTemp;
	}

	public void Account() {
		String id, pw, select, updateSelect, updatePw, updateName, updateCall, updateAge;
		String updateSelect2;
		try {
			conn = getConn();
			ps = conn.prepareStatement("SELECT * FROM MEMBER WHERE MEMBER_ID = ? AND MEMBER_PW = ?");
			System.out.println("조회하실 id를 입력해주세요.");
			id = sc.nextLine();
			ps.setString(1, id);
			System.out.println("조회하실 pw를 입력해주세요.");
			pw = sc.nextLine();
			ps.setString(2, pw);
			rs = ps.executeQuery();
			while (true) {
				if (rs.next()) {
					System.out.println("MEMBER_ID : " + rs.getString("MEMBER_ID"));
					System.out.println("MEMBER_PW : " + rs.getString("MEMBER_PW"));
					System.out.println("MEMBER_NAME : " + rs.getString("MEMBER_NAME"));
					System.out.println("MEMBER_CALL : " + rs.getString("MEMBER_CALL"));
					System.out.println("MEMBER_AGE : " + rs.getInt("MEMBER_AGE"));

					System.out.println("회원정보 수정을 원하시면 1번을 취소하시려면 0번을 입력해주세요.");
					select = sc.nextLine();
					if (select.equals("1")) {
						while (true) {
							System.out.println("수정하실 부분을 선택해주세요.");
							System.out.println("MEMBER_ID : " + rs.getString("MEMBER_ID"));
							System.out.println("1번 MEMBER_PW : " + rs.getString("MEMBER_PW"));
							System.out.println("2번 MEMBER_NAME : " + rs.getString("MEMBER_NAME"));
							System.out.println("3번 MEMBER_CALL : " + rs.getString("MEMBER_CALL"));
							System.out.println("4번 MEMBER_AGE : " + rs.getInt("MEMBER_AGE"));
							System.out.println("0번 취소");
							updateSelect = sc.nextLine();
							if (updateSelect.equals("1")) {
								System.out.println("비밀번호 수정을 선택하셨습니다.");
								while (true) {
									System.out.println("수정하실 비밀번호를 입력해주세요.");
									updatePw = sc.nextLine();
									System.out.println(
											"수정하실 비밀번호가 " + updatePw + "맞으시면 1번을 다시 입력하시려면 2번을 취소하시려면 0번을 입력해주세요.");
									updateSelect2 = sc.nextLine();
									if (updateSelect2.equals("1")) {
										ps = conn.prepareStatement(
												"UPDATE MEMBER SET MEMBER_PW = ? WHERE MEMBER_ID = ?");
										ps.setString(1, updatePw);
										ps.setString(2, id);
										int result = ps.executeUpdate();
										if (result >= 1) {
											System.out.println("비밀번호 : " + updatePw + "로 변경되었습니다.");
											break;
										}
									} else if (updateSelect2.equals("2")) {
										continue;
									} else if (updateSelect2.equals("0")) {
										System.out.println("취소하셨습니다.");
										break;
									} else {
										System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
									}
								}

							} else if (updateSelect.equals("2")) {

							} else if (updateSelect.equals("3")) {

							} else if (updateSelect.equals("4")) {

							} else if (updateSelect.equals("0")) {
								System.out.println("취소합니다.");
								break;
							} else {
								System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
							}
						}
					} else if (select.equals("0")) {
						System.out.println("취소합니다");
						break;
					} else {
						System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
						continue;
					}
				} else {
					System.out.println("아이디나 비밀번호가 틀렸습니다.");
					break;
				}
				break;
			}
		} catch (SQLException e) {
			System.out.println("오류");
			e.printStackTrace();
		} finally {
			dbClose();
		}
		menu();
	}

	public void updateAccount() {
		System.out.println("");
	}
}
