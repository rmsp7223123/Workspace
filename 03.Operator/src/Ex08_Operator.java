
public class Ex08_Operator {
	public static void main(String[] args) {
		// 변수타입 변수명 = 값 비교식 ? "반환값1" : "반환값2" ;
		// int result = num < 10 ? 1 : 2 ;
		int score = 91;
		String grade = score > 90 ? "A": score > 80 ? "B": score > 70 ? "C": score > 60 ? "D": "E";
		System.out.println(grade);
	}
}
