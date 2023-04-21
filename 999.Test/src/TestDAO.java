import java.util.Scanner;

public class TestDAO {
	public int rtnInt() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				return Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
			}
		}
	}
}
