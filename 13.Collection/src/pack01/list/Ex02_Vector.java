package pack01.list;

import java.util.List;
import java.util.Vector;

public class Ex02_Vector {
	public static void main(String[] args) {
//		사용 빈도가 없거나 매우 낮음
//		List라는 Interface를 상속받았기 때문에 기본 구조는 ArrayList, LinkedList, Vector 모두 비슷함
		List<TestDTO> list = new Vector<TestDTO>();
		TestDTO dto = new TestDTO("firstName", "lastName");
		list.add(dto);
		list.add(new TestDTO("a", "b"));
		System.out.println(dto.getFirstName());
		System.out.println(list.get(1).getFirstName());

		TestDTO[] arrDTOs = new TestDTO[1];
		arrDTOs[0] = new TestDTO("FirstName", "LastName");
		System.out.println(arrDTOs[0].getFirstName());

	}
}
