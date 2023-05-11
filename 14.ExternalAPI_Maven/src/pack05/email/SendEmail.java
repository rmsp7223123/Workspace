package pack05.email;

import java.net.URL;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {
	public static void main(String[] args) {
		SendEmail se = new SendEmail();
		se.sendHtml();
	}

//	1. 텍스트만 있는 이메일(SimpleEmail)
//	2. 첨부파일이나 url등으로 이미지가 있는 이메일(MultiPartEmail)
//	3. 모든 기능을 가지고 html 태그까지 사용가능한 이메일(HTmlEmail)

	public void sendSimple() {
		SimpleEmail mail = new SimpleEmail();
//		smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8");
		mail.setDebug(true);// 오류를 찾아서 개발하고 있는 과정인지
		mail.setAuthentication("mbj98", "");
		mail.setSSLOnConnect(true);
//		===========================고정===========================

		try {
			mail.setFrom("mbj98@naver.com", "문병준mbjFROM");
			mail.addTo("mbj98@naver.com", "문병준mbjTO");
			mail.addTo("msp7223123@gmail.com", "문병준mbjTO");
			mail.setSubject("제목123123123");
			mail.setMsg("내용15451561561561");
//			===================전송준비완료===================
			mail.send();
		} catch (EmailException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Email 오류가 아닌것 : " + e.getMessage());
		}
	}

	public void sendMulti() {
		MultiPartEmail mail = new MultiPartEmail();
//		smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8");
		mail.setDebug(true);// 오류를 찾아서 개발하고 있는 과정인지
		mail.setAuthentication("mbj98", "sojung344@");
		mail.setSSLOnConnect(true);
//		===========================고정===========================

		try {
			mail.setFrom("mbj98@naver.com", "문병준mbjFROM");
			mail.addTo("mbj98@naver.com", "문병준mbjTO");
			mail.addTo("msp7223123@gmail.com", "문병준mbjTO");
			mail.addTo("ghk1998@naver.com", "문병준");
			mail.addTo("dlwlstjd7000@naver.com", "문병준");
			mail.setSubject("제목123123123");
			mail.setMsg("내용15451561561561");

			EmailAttachment file = new EmailAttachment();
//			file.setPath("‪C:\\Users\\admin\\Documents\\pic.jpeg");// 이미지 파일 경로
//			mail.attach(file); // 실제 파일 추가

			file = new EmailAttachment();
			file.setURL(new URL(
					"https://i.namu.wiki/i/WkPZlLjf0g5i_o4r5j08iC9l29cT-RDp6jc1oQsheTjeVW_hJ31K2Qt_JV6PzSqR0DhsCWkWm8IxM7e-HNKBdQ.webp"));
			mail.attach(file);
//			===================전송준비완료===================
			mail.send();
		} catch (EmailException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Email 오류가 아닌것 : " + e.getMessage());
		}
	}

	public void sendHtml() {
		HtmlEmail mail = new HtmlEmail();
//		smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8");
		mail.setDebug(true);// 오류를 찾아서 개발하고 있는 과정인지
		mail.setAuthentication("mbj98", "sojung344@");
		mail.setSSLOnConnect(true);
//		===========================고정===========================

		try {
			mail.setFrom("mbj98@naver.com", "문병준mbjFROM");
			mail.addTo("youngmoon525@naver.com", "문병준mbjTO");
			mail.setSubject("제목123123123");
			// mail.setMsg("내용15451561561561");

//			메일의 내용이 일반 글자가 아니라 html형태로 보낼예정
			StringBuffer msg = new StringBuffer();
			msg.append("<html>");
			msg.append("<body>");
			msg.append("<h1>제목</h1>");
			msg.append("<p style=\"color : blue\">파란색내용</p>");
			msg.append("<ol>리스트</ol>");
			msg.append("<li>리스트1</li>");
			msg.append("<li>리스트2</li>");
			msg.append("<li>리스트3</li>");
			msg.append("<li>리스트4</li>");
			msg.append("<a href=\"https://www.naver.com/\">네이버이동</a>");
			msg.append("<p style=\"font-size : 50px\">50픽셀</p>");
			msg.append("</body>");
			msg.append("</html>");
			mail.setHtmlMsg(msg.toString());
			EmailAttachment file = new EmailAttachment();
//			file.setPath("‪C:\\Users\\admin\\Documents\\pic.jpeg");// 이미지 파일 경로
//			mail.attach(file); // 실제 파일 추가

			file = new EmailAttachment();
			file.setURL(new URL(
					"https://i.namu.wiki/i/WkPZlLjf0g5i_o4r5j08iC9l29cT-RDp6jc1oQsheTjeVW_hJ31K2Qt_JV6PzSqR0DhsCWkWm8IxM7e-HNKBdQ.webp"));
			mail.attach(file);
//			===================전송준비완료===================
			mail.send();
		} catch (EmailException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Email 오류가 아닌것 : " + e.getMessage());
		}
	}

}
