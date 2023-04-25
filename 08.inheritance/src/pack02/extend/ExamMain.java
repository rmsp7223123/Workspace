package pack02.extend;

public class ExamMain {
	public static void main(String[] args) {
//		1. 상속방법 : class클래스(자식) extends클래스(부모)
//		2. 자식클래스는 부모클래스로부터 메소드와 필드를 물려받아 사용
//		3. 부모클래스는 자식클래스에서 정의한 메소드나 필드를 사용하지못함
//		(자식 = 자신+부모 / 부모 = 자신)
//		4. extends로 클래스의 상속은 한가지만 가능 (단일상속)
//		5. 부모클래스는 여러 자식 클래스가 있을 수 있음
//		6. 자식클래스가 당연하게도 더 많은 기능을 가지고 있기 때문에 특별한 경우가 아니면
//		   자식클래스를 인스턴스화 하는게 더 효율적이고 생산적임.
		SubClass sc = new SubClass();
		
		
	}
}
