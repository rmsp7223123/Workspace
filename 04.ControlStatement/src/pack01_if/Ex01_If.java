package pack01_if;

public class Ex01_If {
	public static void main(String[] args) {// {} <== 프로그램의 시작점
	// if문 : 조건문
	// 어떤 조건을 주고 해당 조건이 TRUE일 때 지역(블럭킹{})을 만들고 그 지역의 코드를 실행
	// 이항연산자 부분은 값만 결과로 사용가능 => if문은 별도의 코딩을 결과로써 사용이 가능
	// if (조건식 ※ TRUE와 FALSE의 결과를 얻을 수 있는것만) {
				// 조건식이 TRUE 일 때 실행하는 부분.
	//}
		
		int score = 74; // 웹에서 입력받아온 ID와 PW를 비교할 때 사용
		if (score %2 == 1) {
			// 조건식이 TRUE일때만 실행이 가능.
			System.out.println("홀수");
		}
		
		if (score %2 == 0) {
			System.out.println("짝수");
		}
	}// 프로그램의 끝점
}
