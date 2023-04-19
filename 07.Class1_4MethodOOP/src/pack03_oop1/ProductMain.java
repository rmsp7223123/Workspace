package pack03_oop1;

public class ProductMain {
	public static void main(String[] args) {
		ProductDTO dto = new ProductDTO();
		dto.num = 1;
		dto.name = "컴퓨터";
		ProductDTO dto2 = new ProductDTO();
		dto2.num = 2;
		dto2.name = "노트북";
		ProductDAO dao = new ProductDAO();
		dao.display(dto);
		dao.display(dto2);
	}
}
