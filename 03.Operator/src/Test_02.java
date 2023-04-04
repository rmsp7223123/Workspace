
public class Test_02 {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		int result1 = ++x + 10; // 12 연산 후 출력 
		int result2 = y++ + 10; // 11 출력 후 연산
		System.out.println(result1);
		System.out.println(result2);
	}
}
