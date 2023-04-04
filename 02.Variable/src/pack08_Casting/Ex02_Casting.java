package pack08_Casting;

public class Ex02_Casting {
	public static void main(String[] args) {
		// 문자열 + 어떤 값 = 문자열  <== 문자열 결합의 규칙
		String sum = "12" + 34;
		System.out.println(sum);
		String sum2 = "" + 1234;
		System.out.println(sum2);
		// int, double 등의 보라색으로 글씨가 바뀌는것 => 기본타입
		// 대문자로 시작하는 것들은 대부분 Class 타입
		// 기본 데이터 타입은 Wrapper class 라는것을 가지고있음
		// int => Integer, double => Double
		// String을 해당하는 타입으로 바꿔주는것
		// String에 있는 ""를 제거한다.
		int num = Integer.parseInt(sum);
		System.out.println(num);
		int num2 = Integer.parseInt(sum2);
		System.out.println(num + num2);
		String sAvg = "88.6";
		Double dAvg = Double.parseDouble(sAvg);
		System.out.println(dAvg+10);
		// WrapperClass.parseDataType(String);+> DataType
		// Float.parseFloat(sAvg)
		// Long.parseLong(sAvg)
		// Byte.parseByte(sAvg)
		// String str = "MBJ";
		// 콘솔창을 확인하기 (빨간색 줄 == 오류)
	}
}
