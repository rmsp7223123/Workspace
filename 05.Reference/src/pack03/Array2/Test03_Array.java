package pack03.Array2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Test03_Array {
	public static void main(String[] args) {
		int[] arrA = { 1, 2, 3, 4 };
		int[] arrB = { 5, 6, 7, 8 };
		int[] arrC = new int[4];
		arrC = arrB;
		arrB = arrA;
		arrA = arrC;
		System.out.println(Arrays.toString(arrA));
		System.out.println(Arrays.toString(arrB));

		int[][] arr3 = new int[8][9];
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				arr3[i - 2][j - 1] = i * j;
				System.out.print(arr3[i - 2][j - 1] + " ");
			}
			System.out.println();
		}

		int[] arrSort = { 3, 4, 6, 7, 8, 9, 1, 2, 5 };
		Arrays.sort(arrSort);
		System.out.println(Arrays.toString(arrSort));
		
//		for(int i = 0; i<arrSort.length; i++) {
//			for (int j = i+1; j<arrSort.length; j++) {
//				if(arrSort[i] > arrSort[j]) {
//					int temp = arrSort[i];
//					arrSort[i] = arrSort[j];
//					arrSort[j] = temp;
//				}
//			}
//			System.out.println(Arrays.toString(arrSort));
//		}
	}
}
