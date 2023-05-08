package pack01.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex03_LinkedList {
	public static void main(String[] args) {
//		사용빈도가 낮음
		List<String> listArray = new ArrayList<String>();
		List<String> listLinked = new LinkedList<String>();

		long startTime;
		long endTime;

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			listArray.add(i + "");
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList의 작업시간  : " + (endTime - startTime) + "ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			listLinked.add(i + "");
		}
		endTime = System.nanoTime();
		System.out.println("listLinked의 작업시간 : " + (endTime - startTime) + "ns");
	}
}
