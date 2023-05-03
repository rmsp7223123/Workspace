package extend.imp;

public class SuperParent implements TestInterface, Camera {
//	interface는 구조의 상속(implements[구조] vs extends[멤버])
//	interface의 변수는 상수(final)
//	1세대로 만드는 클래스
	int superField = 1;

	void superMethod() {
		System.out.println("SuperParent 부모 클래스");
	}

	@Override
	public void testMethod() {
		System.out.println("테스트 메소드 구현");
	}

	@Override
	public int testMethod2() {
		return 0;
	}

	@Override
	public void cameraShot() {
		System.out.println("카메라");
	}
}
