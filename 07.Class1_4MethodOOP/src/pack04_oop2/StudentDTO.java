package pack04_oop2;

public class StudentDTO {
//	메소드나 변수 앞에 접근제한자를 사용하면 외부에서의 접근을 제한할 수 있다.
//	public, protected, default, private
//	public : 같은 프로젝트 내에서 접근 가능
//	default : 같은 패키지 내에서 접근 가능
//	private : 같은 클래스 내부에서만 접근 가능
	
//	getter&setter
//	변수이름 앞에 get을 붙이고 뒤에 변수이름 첫번째 글자를 대문자로 바꾼형태
//	외부에서의 접근이 막혀있는 변수를 메소드를 통해 접근 가능하게 만드는 구조
//	ex)  score1 => getScore1()메소드 => score1에 들어있는 값을 리턴
//		     	   getScore1(int score) => score1에 값을 변경
	private int num = 10;
	private int lan, mat, eng, total;
	private double avg;
	String name;


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getLan() {
		return lan;
	}

	public void setLan(int lan) {
		this.lan = lan;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	
}
