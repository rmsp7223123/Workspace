package pack01_base;

public class Ex03_ComputerMain {
	public static void main(String[] args) {
		Ex03_Computer ec = new Ex03_Computer();
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		System.out.println(ec.sum1(arr));
		System.out.println(ec.sum2(1,2,3,4,5,6,7));
	}
}
