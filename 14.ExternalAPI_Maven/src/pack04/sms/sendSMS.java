package pack04.sms;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class sendSMS {
	public static void main(String[] args) {

		final String APIKEY = "NCSEK4YS52OWHDO3";
		final String APISECRET = "4AYBA9MR8URM5UDEGWAH3AYMRCTFVEJW";

		Message sms = new Message(APIKEY, APISECRET);
		HashMap<String, String> params = new HashMap<>();
		params.put("to", "01056257223");
		params.put("from", "01056257223");
		params.put("type", "SMS");
		params.put("text", "문자테스트");
		params.put("app_version", "JAVA SDK v1.2");

		try {
			JSONObject obj = sms.send(params);
			System.out.println(obj.toString());
		} catch (CoolsmsException e) {
			e.printStackTrace();
		}
	}

}
