package pack01.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01_List {
	public static void main(String[] args) {
//		Collection Framework
//		Collection : 자료를 수집해서 가지고 있을 수 있는 기능을 가진 자료구조(클래스, 배열)
//		FrameWork : 어떤 목적이나 기능을 미리 쉽게 사용하도록 만들어 놓은것
//		List<Extends Object> list = new ...<>();
//		List는 Object를 상속받은 객체 타입만 데이터를 수집하게 해놓음(클래스)
//		List< 묶을 데이터타입(DTO) > list = new 자료구조타입(...);
//		List<E> E=Element : 어떤 내용이 내부에 묶여 저장될지
		List<String> list = new ArrayList<String>();
		list.add("Java1");
		list.add("Java2");
		list.add("Java3");
		list.add("Java4");
		list.add(3, "끼워넣기"); // 3번 index에 원하는 값 추가
		System.out.println(list.size()); // size == length
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		Scanner sc = new Scanner(System.in);
		list.add(sc.nextLine());
		System.out.println(list.get(5));
	}
}
