package pack01.inputstream;

import java.io.IOException;
import java.io.InputStream;

public class Ex01_SystemIn {
	public static void main(String[] args) {// 메인메소드 == 메인쓰레드(메모리에 할당받아 프로그램시작)
		try {
			int data = System.in.read(); // 콘솔로부터 입력받은 데이터를 byte타입으로 받게 됨
			System.out.println(data);
			InputStream is = System.in; // 노드스트림 : 가장 먼저 연결되는 스트림(static)

		} catch (IOException e) {// Input, Output : 데이터가 들어오가나 나갈 때 중간에 오류가 생기면 반드시 예외처리를 해줘야함
			e.printStackTrace();
		}

	}
}
