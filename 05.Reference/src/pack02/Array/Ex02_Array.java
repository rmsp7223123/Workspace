package pack02.Array;

public class Ex02_Array {
	public static void main(String[] args) {
		int[] array = new int[10];
		int a = 0;
		int b = 0;
		for (int i = 0; i < 10; i++) {
			array[i] = (i+1)*10; // 10~100까지
			System.out.println(array[i]);
			a += array[i];
			System.out.println(a);
			b = a / 10;
			System.out.println(b);
		}
	}
}
