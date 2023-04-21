package test;

import java.util.Iterator;

public class JapangiDAO {
	void display(JapangiDTO dto) {
		for (int i = 0; i < dto.getBev().length; i++) {
			if (dto.getBev()[i] == null) {

				System.out.println(i + 1 + "번 비어있음 " + dto.bevCost[i] + "원 " + dto.bevCount[i] + "개");
			} else {

				System.out.println(i + 1 + "번 " + dto.bev[i] + " " + dto.bevCost[i] + "원 " + dto.bevCount[i] + "개");
			}
		}
	}

	void display1() {

	}

	JapangiDTO initDTO(String[] nameArr, int[] priceArr, int[] cntArr) {
		JapangiDTO dto = new JapangiDTO();
		for (int i = 0; i < nameArr.length; i++) {
			dto.setBev(i, nameArr[i]);
		}
		for (int i = 0; i < priceArr.length; i++) {
			dto.setBevCost(i, priceArr[i]);
		}
		for (int i = 0; i < cntArr.length; i++) {
			dto.setBevCount(i, cntArr[i]);
		}
		return dto;
	}
}
