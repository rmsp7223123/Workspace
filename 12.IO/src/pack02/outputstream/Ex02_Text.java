package pack02.outputstream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02_Text {
	public static void main(String[] args) {
		try {
//			이클립스와 파일리더만 통해서 파일실제 경로에 접근할 때는 윈도우 보안설정에 따라 안되는 경우도 존재
			Reader reader = new FileReader("C:\\Users\\admin\\Documents\\Ex02_Text.txt");
			String str = "";
			char[]	buffer = new char[5];
			int readCharNum = reader.read(buffer); // 몇글자를 가져오는지
			System.out.println(readCharNum);
			for(int i =0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
			reader.close();
		} catch (IOException e) {
			// 파일이 없는 경우에 캐치로 빠짐
			e.printStackTrace();
		}
	}
}
