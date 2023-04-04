package pack01_if;

public class Ex04_Ifif {
	public static void main(String[] args) {
		// 자바프로그램은 메모리를 효율적으로 쓰기위해 메모리에 올리고 내리는 과정이 존재
		// 블럭킹의 기본개념 : {<== 메모리에 올림 } <== 메모리에 내림
		// 제어문이 3개이상 중첩되는 경우에 내가 코드를 제대로 짜고 있는지 의심 할 필요가 있음
		// 스파게티 코드 : 코드를 이상하게 꼬아서 짜놓음.
		
		int score = 10;
		if (score % 2 == 0) {
			System.out.println("짝수");
			if (score == 10) {
				System.out.println("10");
				if (score < 11) {
					System.out.println("11보다 작음");
				}
			} 
		} 
	}// main
}// class
