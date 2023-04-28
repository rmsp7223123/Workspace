package pack06_oop3;

public class ProductMain {
	public static void main(String[] args) {
		ProductDTO[] dtoArr = new ProductDTO[5];
		
		dtoArr[0] = new ProductDTO(1, "컴퓨터" , 10000, 5);
		dtoArr[1] = new ProductDTO(2, "냉장고" , 100000, 3);
		dtoArr[2] = new ProductDTO(3, "라면" , 1000, 30);
		dtoArr[3] = new ProductDTO(4, "커피" , 3000, 70);
		dtoArr[4] = new ProductDTO(5, "마우스" , 50000, 10);
		
		ProductDTO dto = new ProductDTO(1, "컴퓨터" , 10000, 5);
		ProductDTO dto2 = new ProductDTO(2, "냉장고" , 100000, 3);
		ProductDTO dto3 = new ProductDTO(3, "라면" , 1000, 30);
		ProductDTO dto4 = new ProductDTO(4, "커피" , 3000, 70);
		ProductDTO dto5 = new ProductDTO(5, "마우스" , 50000, 10);
		ProductDAO dao = new ProductDAO();
		
		
		for (int i = 0; i <dtoArr.length; i++) {
			dao.display(dtoArr[i]);
		}
		dao.display1(dtoArr);
			
		
	}
}
