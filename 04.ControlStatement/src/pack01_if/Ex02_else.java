package pack01_if;

public class Ex02_else {
	public static void main(String[] args) {
	//if-else문 : if의 조건식이 TRUE가 아닌 FALSE라면 else라는 키워드를 만들어
	//			  if문 뒤에 붙여서 false실행부를 만드는것.
		int score = 95;
		if (score % 2 == 0) {
		//TRUE 일 때	
		} else { // if와 항상 세트로 사용
		//FALSE 일 때
		}
		int num1 = 1, num2 = 2;
		if (num1 < num2) {
			System.out.println("num2 큼");
		} else {
			System.out.println("num1 큼");
		}
	}//main
}//class
