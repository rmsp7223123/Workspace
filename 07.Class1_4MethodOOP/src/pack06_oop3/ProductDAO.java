package pack06_oop3;

public class ProductDAO {
	void display(ProductDTO dto) {
		System.out.println("번호 :  " + dto.getNum() +" 이름 : " + dto.getName() + " 가격 : " + dto.getPrice() + " 수량 : " +dto.getCount());
	}
	void display1(ProductDTO[] dtoArr) {
		for (int i = 0; i <dtoArr.length; i++) {
			System.out.println(dtoArr[i].getNum());
		}
	}
}
