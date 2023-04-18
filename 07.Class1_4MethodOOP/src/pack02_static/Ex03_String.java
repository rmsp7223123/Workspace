package pack02_static;

public class Ex03_String {
	public static void main(String[] args) {
//		String class : 문자열을 조작하기 위한 기능을 담고있는 클래스
//		java.lang(패키지).String.class(.java)
//		String 역시 class이기 때문에 멤버를 가지고 있음.
//		변수는 소괄호가 붙지않고 메소드는 소괄호가 붙음.
		String str1 = "apple";
		String str2 = new String("APPLE"); // 인스턴스화 과정을 거쳐 할당

		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);

		System.out.println("length : " + str1.length()); // 문자열의 길이
		System.out.println("toUpperCase : " + str1.toUpperCase()); // 대문자로 변경
		System.out.println("toLowerCase : " + str2.toLowerCase()); // 소문자로 변경
		System.out.println(str1.substring(3)); // 내가 준 index 0부터 문자열 끝까지 출력
		System.out.println(str1.substring(1, 5)); // index 1부터 3앞까지 출력
		System.out.println(str1.charAt(3)); // index에 있는 숫자 출력
		System.out.println("aaa " + str1.indexOf("f")); // 문자열에서 특정문자의 존재여부 실패 : -1
		String[] temp = str1.split(""); // 문자열의 분리
		System.out.println(temp.length);
		String str3 = "ab cd ef";
		String[] tempArr = str3.split(" ");
		System.out.println(tempArr.length);
		System.out.println(str1.replace("pp", "bb")); // 문자열 치환
		System.out.println(str1.replace("pp", "qqqq").length()); // 치환 후 문자열의 길이
		String trimStr1 = "   abc   def   ";
		System.out.println(trimStr1.trim().replace(" ", "").length());// 공백제거 후 문자열의 길이
		String eqStr1 = "A";
		String eqStr2 = new String("A");
		if (eqStr1.equals(eqStr2)) { // 스트링 비교는 equals로
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}
}
