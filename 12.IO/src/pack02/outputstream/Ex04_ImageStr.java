package pack02.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_ImageStr {
//	FileInputStream, FileOutputStream
//	파일(그림, 음원, 영상 등)에서 바이트 단위로 입출력을 하는 스트림을 의미
//	이미지 파일을 읽어서 출력하는 행위(ctrl+c, ctrl+v) == IO : Input&Output
//	원본 이미지를 준비해서 이미지를 읽어온 다음 다른 이름으로 다시 출력
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Study_Java\\Workspace\\12.IO\\src\\pic2.png");
		FileOutputStream fos = new FileOutputStream("D:\\Study_Java\\Workspace\\12.IO\\src\\pic2_copy.png");
		int data, cnt = 0;
		while ((data = fis.read()) != -1) { // -1 : 파일이 없다
			cnt++;
			System.out.println(data); // 이미지의 1px 값 (RGB)
			fos.write(data); // data값을 하나씩 누적
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println(cnt + "횟수만큼 접근했음");
	}
}
