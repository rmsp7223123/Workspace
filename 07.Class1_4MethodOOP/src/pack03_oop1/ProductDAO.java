package pack03_oop1;

public class ProductDAO {
	void display(ProductDTO dto) {
		System.out.println("번호 : " + dto.num);
		System.out.println("상품명 : " + dto.name);
	}
}
