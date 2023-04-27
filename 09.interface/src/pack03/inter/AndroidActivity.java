package pack03.inter;

public class AndroidActivity {
	public static void main(String[] args) {
		AndroidOnclick ao = new AndroidOnclick() {
			
			@Override
			public void onClick() {
				System.out.println("구현함");
			}
		};
		
		ao.onClick();
	}
	
	void test(AndroidOnclick ao) {
		ao.onClick();
	}
}
