package pack01.list;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {

	List<BoardDTO> getList() {
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		list.add(new BoardDTO(1, "제목", "내용"));
		list.add(new BoardDTO(2, "제목", "내용"));
		list.add(new BoardDTO(3, "제목", "내용"));
		return list;
	}

	void getDisplay(List<BoardDTO> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getBoardNum());
			System.out.print(list.get(i).getBoardTitle());
			System.out.print(list.get(i).getBoardContent());
			System.out.println();
		}
		System.out.println();
		for (BoardDTO dto : list) {
			System.out.print(dto.getBoardNum());
			System.out.print(dto.getBoardTitle());
			System.out.print(dto.getBoardContent());
			System.out.println();
		}
	}
}
