package pack01.inputstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_Buffer {
	public static void main(String[] args) throws IOException {
//		키보드에서 여러 글자를 입력받아 줄 단위로 작업 : Scanner보다 빠름
//		InputStream ==> InputStreamReader ==> BufferReader

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputdata = br.readLine();
		System.out.println("입력하신 글자는 : " + inputdata + " 입니다.");
		br.close();
	}
}
