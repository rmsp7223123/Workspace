package pack02.Array;

public class Test01_ArraySum {
	public static void main(String[] args) {
		String[] sArr = {"1","2","3","4","5","6","7","8","9","10"};
		System.out.println(Integer.parseInt(sArr[0]));
		
		int sum = 0;
		for (int i = 0; i<10; i++) {
			sum += Integer.parseInt(sArr[i]);
		}
		System.out.println(sum);
	}
}
