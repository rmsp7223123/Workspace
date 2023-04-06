package pack04_While;

public class Ex03_While {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 100) {			
			if (i%2 == 1) {
				System.out.println("홀수 : " + i);
			} else {
				System.out.println("짝수 : " + i);
			}
			i++;
		}
		
		
	}
}
