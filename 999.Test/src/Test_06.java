
public class Test_06 {
	public static void main(String[] args) {
		int lanScore, mathScore, engScore, sciScore, athScore;
		lanScore = 1;
		mathScore = 2;
		engScore = 3;
		sciScore = 4;
		athScore = 5;
		System.out.println(lanScore);
		System.out.println(mathScore);
		System.out.println(engScore);
		System.out.println(sciScore);
		System.out.println(athScore);
		
		// 형변환(Casting) : 서로 다른타입의 변수를 변환시켜 사용함.
		// ex) int <-> double , String <-> int
		int iValue = 10;
		double dValue = iValue + 0.5 ; // 자동 형변환(UpCasting)
		System.out.println("iValue 값 : " + iValue);
		System.out.println("dValue 값 : " + dValue);
		
		// 더 큰 데이터 타입을 작은 타입에 담을 때 오류가 발생
		// 개발자가 어떤 타입으로 바꿀건지 명시 해줘서 강제로 바꿈
		
		iValue = (int)dValue;
		System.out.println(iValue); // 소수점 유실
		
		String str = "1234" + 12; // 문자열에 어떤 값을 더하는것 ==> 123412
		int iData = 1234 + 12; // 숫자형 데이터의 합은 값의 합침 ==> 1246
		System.out.println(str);
		System.out.println(iData);
		
		String str1 = "123412";
		int str2 = Integer.parseInt(str1);
		System.out.println(str2+1);
		
	}
}
