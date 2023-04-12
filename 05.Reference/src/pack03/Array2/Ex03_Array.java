package pack03.Array2;

public class Ex03_Array {
	public static void main(String[] args) {
		int[][] array = new int[2][3];
		
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };
		int[][] array3 = { array1, array2 };
		System.out.println(array3[1][2]);
		
		// 1차원 배열의 개수만 정확하게 주어졌을 때 사용하는 방법
		int[][] array4 = new int[5][];
		array4[0] = new int[3];//int[] arr = {1,2}; <== 중괄호 초기화식은 최초 한번만 가능
		System.out.println(array3[0].length);
	}
}
