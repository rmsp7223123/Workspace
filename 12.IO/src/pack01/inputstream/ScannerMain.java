package pack01.inputstream;

public class ScannerMain {
	public static void main(String[] args) {
		MbjScanner ms = new MbjScanner(System.in);
		int inputdata1 = ms.nextInt();
		System.out.println(inputdata1);
	}
}
