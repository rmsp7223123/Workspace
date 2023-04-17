package pack01_base;

public class Ex03_Computer {
	int sum1 (int[] arr) {
		int sum = 0;
		for (int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	int sum2 (int ...values) {
		int sum = 0;
		for (int i=1; i<=values.length; i++) {
			sum += i;
		}
		return sum;
	}
}
