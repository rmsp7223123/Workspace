package pack01_if;

public class Test01_If {
	public static void main(String[] args) {
		// int형 변수 코드 만들기 code의 값이 1이면 "남자" 2이면 "여자" 3이면 "남자" 4이면 "여자"
		// 그외엔 오류
		int code = 6;
		if (code == 1) {
			System.out.println("남자");
		} else if (code == 2) {
			System.out.println("여자");
		} else if (code == 3) {
			System.out.println("남자");
		} else if (code == 4) {
			System.out.println("여자");
		} else {
			System.out.println("오류");
		}

		// int random = (int) (Math.random() * 6 ) +1 ; <<1~6까지 랜덤하게 할당
		// 조건문을 이용해 random의 숫자가 몇인지 출력
		// ex random(1) : 1이 출력이 되었습니다 ~6까지

		int random = (int) (Math.random() * 6) + 1;
		if (random == 1) {
			System.out.println(random + "이 출력이 되었습니다.");
		}
		if (random == 2) {
			System.out.println(random + "이 출력이 되었습니다.");
		}
		if (random == 3) {
			System.out.println(random + "이 출력이 되었습니다.");
		}
		if (random == 4) {
			System.out.println(random + "이 출력이 되었습니다.");
		}
		if (random == 5) {
			System.out.println(random + "이 출력이 되었습니다.");
		}
		if (random == 6) {
			System.out.println(random + "이 출력이 되었습니다.");
		}

		// int random = (int) (Math.random() * 6 ) +1 ; 를 이용해
		// 첫번째로 나온 숫자는 나의 숫자 두번쨰로 나온 숫자는 컴퓨터의 숫자
		// 누구의 주사귀 수가 큰지 배틀하는게임
		// 나 :1 컴퓨터 : 6 => 컴퓨터가 이겼습니다.

		int random1 = (int) (Math.random() * 6) + 1;
		if (random > random1) {
			System.out.println("나 : " + random + " 컴퓨터 : " + random1 + " => 결과 : 내가 이겼습니다.");
		} else if (random == random1) {
			System.out.println("나 : " + random + " 컴퓨터 : " + random1 + " => 결과 : 비겼습니다.");;
		} else {
			System.out.println("나 : " + random + " 컴퓨터 : " + random1 + " => 결과 : 컴퓨터가 이겼습니다.");
		}

	}
}
