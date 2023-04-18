package pack01_base;

public class Ex05_Const {
	int id;
	String pw;
	
	
//	생성자 메소드 오버로딩 : 같은 이름의 메소드를 파라메터의 개수나 타입을 달리해 중복시켜 정의하는 것
	
	public Ex05_Const(int id) {
		this.id = id;
	}
	public Ex05_Const(int id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
//	어떤 메소드가 호출 됐는지 모호한 경우엔 컴퓨터는 오류라고 인식한다.
}
