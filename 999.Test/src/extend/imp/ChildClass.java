package extend.imp;

public class ChildClass extends SuperParent {
	public static void main(String[] args) {
		SuperParent sp = new SuperParent();
		System.out.println(sp.superField);
		sp.testMethod();
		sp.cameraShot();
	}

	public void childMethod() {
		System.out.println(superField);
	}
}
