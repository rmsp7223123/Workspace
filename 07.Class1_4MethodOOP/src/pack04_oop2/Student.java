package pack04_oop2;

public class Student {
	int num, lan, mat, eng, total;
	double avg;
	String name;
	public Student(int num, int lan, int mat, int eng, String name) {
		this.num = num;
		this.lan = lan;
		this.mat = mat;
		this.eng = eng;
		this.total = this.lan+ this.mat + this.eng;
		this.avg = (double)this.total/3;
		this.name = name;
	}
	
	void display() {
		System.out.println(num);
		System.out.println(lan);
		System.out.println(mat);
		System.out.println(eng);
		System.out.println(total);
		System.out.println(avg);
		System.out.println(name);
	}
	
}
