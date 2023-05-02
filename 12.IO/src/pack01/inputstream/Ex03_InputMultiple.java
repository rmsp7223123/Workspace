package pack01.inputstream;

import java.io.IOException;
import java.io.InputStream;

public class Ex03_InputMultiple {
	public static void main(String[] args) throws IOException {
//		byte[] <== A를 입력하고 Enter Key
//		byte[0] (A, 65)
//		byte[1] (13)
//		byte[2] (10)

		InputStream is = System.in;
		System.out.println("영문자 여러글자를 입력하세요.");
//		int data = is.read();
		int arr[] = new int[2];
		int count = 0;
		while (true) {
			int data = is.read();
			arr[count] = data;
			count++;
			System.out.println("입력하신 문자는 : " + (char) data + "입니다.");
			if (data == 13 || data == 10) {
				count = 0;
			}
			if (arr[0] == 45 && arr[1] == 49) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}
