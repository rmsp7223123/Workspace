package pack04_oop2;

public class StudentDAO {
	void display(StudentDTO dto) {                                              
		System.out.println("번호 : " + dto.getNum());                                
		System.out.println("이름 : " + dto.name);                               
		System.out.println("국어 : " + dto.getLan());                                
		System.out.println("수학 : " + dto.getMat());                                
		System.out.println("영어 : " + dto.getEng());                                
		System.out.println("총점 : " + dto.getTotal());                              
		System.out.println("평균 : " + dto.getAvg());                                
	}                                                                           
}
