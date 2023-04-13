package pack02_trycatch;

import java.util.Scanner;

public class Ex03_TryCatchOrder {
	public static void main(String[] args) {
		int data2 = 1;
		try {
			int data1 = 10;
			int result = data1/data2; //ArithmeticException
			Scanner sc = new Scanner(System.in);
			int a = Integer.parseInt(sc.nextLine());
		} catch (ArithmeticException e) {// 연산오류 0으로 어떤수 나누기하면 발생
			System.out.println("data2의 변수 (값 : "+ data2+ ")때문에 오류" + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException"+ e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException " + e.getMessage());
		}
		
	}
}
