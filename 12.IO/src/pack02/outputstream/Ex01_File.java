package pack02.outputstream;

import java.io.File;

public class Ex01_File {
	public static void main(String[] args) {
//		D:\Study_Java\Workspace\12.IO
//		웹에서 파일을 다운받거나 업로드 할 때 빈번하게 사용되는 클래스는 file클래스
//		기본적으로 InputSTream과 OutputStream을 통해 만들어졌지만 내부구조보다는 사용법을 알아야 함.
		File file = new File("D:\\Study_Java\\Workspace\\12.IO");
		if (file.exists()) {
			System.out.println("경로가 존재합니다.");
		} else {
			System.out.println("경로가 존재하지 않습니다.");
		}

		
		for (int i = 0; i < 10; i++) {
			file = new File("D:\\Study_Java\\Workspace\\12.IO_FileTest\\" + i);	
			file.mkdir();
		}

	}
}
