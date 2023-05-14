package pack02.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex02_HashMap {
	public static void main(String[] args) {
//		Map 컬렉션은 <Class, Class> : 클래스 타입이 두개가 들어감.
//		첫번째 것은 데이터를 식별하기 위한 키값, 두번째 것은 데이터
//		Map<K(key),V(value)>
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("신용권", 95);
		map.put("홍길동", 50);
		map.put("임꺽정", 60);
		map.put("임꺽정", 100);
//		key는 데이터를 유일하게 식별할 수 있는 값이여야함
		System.out.println("map Entry(객체)수 : " + map.size());
		System.out.println("임꺽정의 점수 : " + map.get("임꺽정"));

		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("key : " + key + " value : " + value);
		}

		for (String key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println("key : " + key + " value : " + value);
		}
	}
}