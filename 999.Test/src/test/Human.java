package test;

public class Human {
	public String ask = "a";
	String look = "b";
	private String river;

	public String getRiver(boolean isDoctor) {
		if (isDoctor) {
			return this.river;
		} else {
			return "접근불가능";
		}
	}

	public void setRiver(String river) {
		if(river.equals("싱싱한 간")) {
			this.river = river;			
		} else {
			System.out.println("바꿀 수 없음");
		}
	}

}
