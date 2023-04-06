package pack05_etc;

public class Ex02_Continue {
	public static void main(String[] args) {
		// continue <=> break
		// break : 제어문을 빠져나감
		// continue : 반복문에서 continue를 만나면 밑에 코드를 실행x.
		// 반복문 (조건식)부분으로 이동
		// continue 사용빈도가 높지 않기때문에 문법만 알고 있으면 됨.
		
		for (int i= 1; i <=10; i++) {
			if(i % 2 == 0) {
				continue;
			} 
			System.out.println(i);
		}
	}
}
