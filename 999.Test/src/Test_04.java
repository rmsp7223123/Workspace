
public class Test_04 {
	public static void main(String[] args) {
		// int(소수점이 없는 정수) , double(소수점이 있는 실수)
		// char(한글자==문자) , String(두글자 이상의 문자열)
		// 변수를 선언하는 규칙 : 변수타입 네이밍(이름) ;
		// 메모리를 효율적으로 쓰기 위해 데이터의 표현범위 별로 또는 유형에 따라 변수타입은 나눠져있음
		int a; // 소수점이 없는 숫자
		double b; // 소수점이 있는 숫자
		char c; // 한글자를 담을때 사용(유니코드) 규칙 ''<-로 감싸주면됨
		String d; // 두글자 이상의 문자열을 담을때 사용 규칙 ""<-로 감싸주면됨
		// 변수에 값 저장(할당, 값==리터럴) : 변수명 = 해당타입에 맞는 값
		a = 5;
		b = 5.5;
		c = 'a';
		d = "문병준";
		
		int iNum2 = 10; // 변수 선언과 동시에 값 할당 ==> 초기화
		// 나열 같은 타입의 변수를 여러개 만들 때 사용
		int subject1, subject2, subject3 ;
		subject1 = 1;
		subject2 = 2;
		subject3 = 3;
		System.out.println(subject1);
	}
}
