package pack02.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01_Hash {
	public static void main(String[] args) {
//		Collection 자료구조는 <> 클래스 타입만 넣을 수 있게 구조가 되어있음.
//		ArrayList< Class타입 뭐든 가능 > 이름 = new ..
//		해쉬코드 : 객체를 식별하는 하나의 정수값
//		String strHash1 = "hash1";
//		String strHash2 = "hash";
//		String strHash3 = new String("hash");
//		System.out.println(strHash1.hashCode());
//		System.out.println(strHash2.hashCode());
//		System.out.println(strHash3.hashCode());
//		데이터를 식별할 수 있는 해쉬코드를 기준으로 데이터를 저장하는 것(HashSet)
		Set<String> set = new HashSet<String>();
		set.add("java");
		set.add("html");
		set.add("jsp/servlet");
		set.add("oracledb");
		set.add("oracledb"); // 중복X
		System.out.println(set.size()); // 4

//		HashSet자료구조는 index접근이 아닌 요소별로 접근하는것을 권장
		Iterator<String> iterator = set.iterator(); // set자료구조를 탐색할 수 있는 기능
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
//		반복횟수가 정확하게 정해지지 않거나 인덱스로 관리가 안될 때는 향상된 for문 사용
		for(String element : set) {
			System.out.println(element);
		}
	}
}
