package dao.dto.method;

public class HumanDAO {

	public void seeMovie(HumanDTO dto) {
		System.out.println(dto.eye + "과" + dto.eye + "으로 영화를 봅니다");
	}

	public void ask(HumanDTO dto) {
		System.out.println(dto.mouse + "으로 대화중");
	}

	public void coding(HumanDTO dto) {
		System.out.println(dto.hand + "으로 코딩중");
	}

}
