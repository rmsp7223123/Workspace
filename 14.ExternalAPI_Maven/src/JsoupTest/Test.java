package JsoupTest;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;

public class Test {
	public static void main(String[] args) {
		String url = "https://api.odcloud.kr/api/15019302/v1/uddi:7d6a6d1f-420a-45d0-be70-e9ae6f75ef59_201909041342";
		String doc = null;
		try {
			doc = Jsoup.connect(url).data("page", "1").data("perPage", "10")
					.data("serviceKey",
							"3pIdezEksFzyrjO65AKqJ1aKmjIY8DZcjzblwI9DqnJa5kpHB97MB6bbnz4Vnp8roIw2j7kjORYibrgQH3j1ZA==")
					.timeout(1000 * 10).userAgent("Chrome").ignoreContentType(true).execute().body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(doc);

		JSONParser parser = new JSONParser(); // 문자열 => JsonObject 형태로 바꿔줌
		try {
			JSONObject jsonObj = (JSONObject) parser.parse(doc);
			JSONArray array = (JSONArray) jsonObj.get("data");
			for (int i = 0; i < array.size(); i++) {
				JSONObject tempObj = (JSONObject) array.get(i);
				System.out.print("구분연월 : " + tempObj.get("구분연월") + " ");
				System.out.print("무료 : " + tempObj.get("무료") + " ");
				System.out.print("방문객수 : " + tempObj.get("방문객수") + " ");
				System.out.print("유료 : " + tempObj.get("유료") + " ");
				System.out.println();
			}
		} catch (ParseException e) {
//			String json이 key와 value를 가진 데이터가 아닌 그냥 일반문자열이라면 오류가 발생
			e.printStackTrace();
		}
	}
}
