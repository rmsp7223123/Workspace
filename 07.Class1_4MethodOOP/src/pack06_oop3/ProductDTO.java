package pack06_oop3;

public class ProductDTO {
	// 정보 은닉(information hiding), 캡슐화(encapsulation)
	private int num= 10;
	private String name;
	private int price;
	private int count;
	int[] dtoArr = new int[5];
	

	public ProductDTO(int num, String name, int price, int count) {
		this.num = num;
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
