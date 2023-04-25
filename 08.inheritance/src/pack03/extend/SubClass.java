package pack03.extend;

public class SubClass extends SuperClass{
//	sub클래스에서 부모클래스의 기능을 그대로 사용하는게아닌 달리하고싶음
//	오버라이드(Override) , 재정의
//	부모클래스의 메소드 형태는 유지하되, 내용을 바꿔 정의하는것
//	super<- 부모 클래스의~
	@Override // annotation(어노테이션) : 주석, 컴퓨터가 해석하는 주석
	public int sum(int num1, int num2) {
		return num1 + num2 + 3;
	}
	
	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	public int div(int num1, int num2) {
		return num1 / num2;
	}
	
	public int div_re(int num1, int num2) {
		return num1 % num2;
	}
}
