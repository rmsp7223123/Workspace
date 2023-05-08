package pack01.list;

import java.util.ArrayList;
import java.util.List;

public class Ex04_ArrayList {
	public static void main(String[] args) {
//	사용빈도가 높음, 배열의 단점을 보완하고 불필요한 체이닝, 멀티쓰레딩등의 기능이 없기 때문에 제일 많이 사용함.
		List<String> listString = new ArrayList<>();
		List<Integer> listInt = new ArrayList<>();
		List<Boolean> listBoo = new ArrayList<>();
		listString.add("a");
		listString.add("b");
		listString.add("c");
		listString.add("d");
		listInt.add(1);
		listInt.add(2);
		listInt.add(3);
		listInt.add(4);
		listBoo.add(true);
		listBoo.add(false);

//		for (int i = 0; i < listString.size(); i++) {
//			System.out.println(listString.get(i));
//		}
//		for (int i = 0; i < listInt.size(); i++) {
//			System.out.println(listInt.get(i));
//		}
//		for (int i = 0; i < listBoo.size(); i++) {
//			System.out.println(listBoo.get(i));
//		}

//		향상된 for문 : Collection이나 배열등의 자료구조 내부에 Element를 한건씩 빼주어서 가독성을 높인 구조
//		for(요소 : 자료구조) {
//				알아서 자료구조의 크기만큼 반복을 하며 :기준 왼쪽요소에 아이템을 하나씩 빼면서 반복함
//		}

		for (String str : listString) {
			System.out.println(str);
		}
		for (int a : listInt) {
			System.out.println(a);
		}
		for (boolean b : listBoo) {
			System.out.println(b);
		}
	}

}
