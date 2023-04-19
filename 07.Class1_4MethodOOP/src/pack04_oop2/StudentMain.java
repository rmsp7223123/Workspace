package pack04_oop2;

public class StudentMain {
	public static void main(String[] args) {
//		메소드나 변수 앞에 접근제한자를 사용하면 외부에서의 접근을 제한할 수 있다.
//		public, protected, default, private
		StudentDTO dto = new StudentDTO(1, 50, 100, 50, "문병준");
		dto.setNum(1);// = 1;
		dto.name = "문병준";
		dto.setLan(50);
		dto.setMat(100);
		dto.setEng(51);
		dto.setTotal(dto.getLan() + dto.getMat() + dto.getEng());
		dto.setAvg((double) dto.getTotal() / 3);
		
		StudentDAO dao = new StudentDAO();
		dao.display(dto);
	}
}
