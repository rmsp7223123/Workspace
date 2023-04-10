package pack02.Array;

public class Ex01_Array {
	public static void main(String[] args) {
		// 배열이란 자료형 변수를 생성하고 사용할 때 주로 쓰임
		// 규칙 : "동일한" 데이터 타입을 묶어서 사용하게 하며 정해진 수만큼 저장처리하는 객체
		// 한번만든 크기는 다시 바꾸는게 불편하다.
		// 형태 dataType[] name = new dataType[size];
		// 	   데이터타입[] 배열이름 = new 데이터타입[크기];
		
		// 아직 스캐너나 별도의 처리로 점수를 입력하지 않은 변수 5개를 준비만 해둠.
		int score1 = 0, score2 = 0, score3 = 0, score4 = 0, score5 = 0;
		int[] scoreArray = new int[100]; // 0번[0] 1번[0] 2번[0] 3번[0] 4번[0]
		// 배열의 인덱스 규칙 : n의 크기가 주어진 배열은 0부터 n-1까지의 주소를 가짐.
		System.out.println("scoreArray[0] 값 : " +scoreArray[0]);
		System.out.println(scoreArray); // [I@515f550a =>> 힙 영역의 주소(메모리) 값x
		scoreArray[0] = 10; // 배열에 데이터타입이 주어졌으면 해당하는 타입의 변수라고 생각
		System.out.println("scoreArray[0] 값 : " +scoreArray[0]);
		
		for (int i = 0; i< 100; i++) {	
			System.out.println(scoreArray[i]);
		}
		
	}
}
