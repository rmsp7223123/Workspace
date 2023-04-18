package pack01_base;

public class Ex06_MethodMain {
	public static void main(String[] args) {
		Ex06_Method em = new Ex06_Method();
		em.method1(5, 10);
		em.method2();
		em.method3(013231, 1231230);
		em.method4();
		
//		메소드에 리턴타입이 주어진다면 해당하는 타입의 변수라고 봐도 됨.
//		메소드에 리턴타입이 없으면 아무타입도 아님(실행 후 없어지는 코드 블럭).
		int method = em.method2();
		
		boolean isBoolean = 1<2;
		if(isBoolean) {
//			메소드 결과가 true일 때 또는 false일 때에 따라 if와 else블럭 실행여부가 바뀐다.
		} else {
			
		}
		System.out.println(em.aMethod()[0]);
		System.out.println(em.sMethod());
		System.out.println(em.dMethod());
		em.method5("1d1qddqd");
	}
}
