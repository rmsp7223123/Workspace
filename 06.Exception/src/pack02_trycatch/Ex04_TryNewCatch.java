package pack02_trycatch;

public class Ex04_TryNewCatch {
	public static void main(String[] args) {
		int sum = 0;

		try {
			for (int i = 1; i <= 100; i++) {
				sum += i;
				if (sum >= 777) {
					throw new Exception("누적합이 777이상이 되었다" + sum);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(sum);
	}
}
