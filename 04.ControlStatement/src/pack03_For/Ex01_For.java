package pack03_For;

public class Ex01_For {
	public static void main(String[] args) {
		// 반복문 : for문 (loop문, looping, 순환)
		// for(반복에 사용할 변수 초기화; 조건식; 증감식){
		// 		반복구간(코드)
		//}
		
		// for(①int i = 0; ②i<10; ④i++){ 
		// ③i가 0에서 9까지 총 10번 동작하는 반복문
		//}
		
		// for(int i = 0; i<10;) <== 무한루프 (탈출하려면 break)
		for(int i = 0; i<10; i++) {
			System.out.println("for문 변수 i의 값 : " + i);
		}
		System.out.println("ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ");
		
		int num = 0;
		for(int a = 0; a<18951; a++) {
			num = a;
		}
		System.out.println(num);
	}
}
