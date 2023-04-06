package pack04_While;

public class Test01_While {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 8) {
			int j = 0;
			i++;
			System.out.println();
			while (j <= 8){
				j++;
				System.out.print(i + " X " + j + " = " +(i * j) + " ");
			}
			System.out.println();
		}
	}
}
