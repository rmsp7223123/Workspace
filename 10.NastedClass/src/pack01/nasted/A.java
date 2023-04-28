package pack01.nasted;

import java.util.Scanner;

public class A {
	int aField = 10;

	String methodA() {
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		return b;
	}

//	인스턴스화 과정에서 사용되는 생성자 메소드는 별도로 구현하지않으면 A() {}로 제공되고있다.
	public A(int a) {

	}

	public class B {

		B() {
			System.out.println("B객체 생성됨");
		}

		int bField = 10;

		void methodB() {
			System.out.println("메소드");
		}
	}

	static class C {
		static int fieldCs = 10;

		C() {
			System.out.println("C객체가 생성됨");
		}

		int fieldC;

		void methodC() {
			System.out.println("C메소드");
		}
	}

	public void methodD() {
		class D {
			D() {
				System.out.println("D가 생성됨");
			}

			int fieldD = 10;

			void methodD() {
				System.out.println("메소드 D");
			}
		}
		D d = new D();
		System.out.println(d.fieldD);
		d.methodD();
	}

}
