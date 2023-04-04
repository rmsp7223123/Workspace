
public class Ex03_Bool {
	public static void main(String[] args) {
		boolean boo1;
		boo1 = true; // (1)
		boolean boo2; 
		boo2 = false; // (0)
		System.out.println(boo1);
		System.out.println(boo2);
		//AND 연산자(&)는 논리곱
			// 논리곱은 모든 조건이 true 일때만 true
				// true * true = true, true * false = false
		//OR 연산자(|)는 논리합
			// 논리합은 하나의 true가 전제 조건식을 true로 만듦
				// true + true = true, true + false = true
		
		// NOT => !
		// 어떤 true, false(boolean)앞에 붙이면 해당 결과를 반전시킴
		System.out.println(!boo1);
		System.out.println(!boo2);
	}
}
