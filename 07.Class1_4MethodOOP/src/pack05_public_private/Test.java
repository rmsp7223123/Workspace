package pack05_public_private;

import pack04_oop2.StudentDTO;

public class Test {
	public static void main(String[] args) {
//		메소드나 변수 앞에 접근제한자를 사용하면 외부에서의 접근을 제한할 수 있다.
//		public, protected, default, private
		StudentDTO dto = new StudentDTO(0,0,0,0,null);
//		접근 제한자가 없는 경우 default 접근제한자로 같은 패키지 내부에 있는 클래스끼리 접근가능
		System.out.println(dto.getNum());
	}
}
