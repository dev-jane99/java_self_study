package mail;
//
//import java.util.Date;
//import java.util.Properties;
//import java.util.Scanner;
//
//import javax.mail.Authenticator;
//import javax.mail.Message;
//import javax.mail.Multipart;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMessage.RecipientType;
//import javax.mail.internet.MimeMultipart;
//
//public class MailTest {
//	static String code;
//	
//	public static String randomCode() {
//		String result = "";
//		for(int i = 0; i < 6; i++) {
//			result += (int)Math.floor(Math.random()*10);
//		}
//		return result;
//	}
//	
//	public static void main(String[] args) {
//		
//		MailTest mt = new MailTest();
//		String noticeMessage = "인증번호를 발송 했습니다. 메일을 확인 해주세요.";
//		String expression = null;  //주소값에 넣을거라 null 이다.
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println(noticeMessage);
//		code = mt.randomCode();
//
//		
//		// 메일 인코딩
//		final String bodyEncoding = "UTF-8"; // 콘텐츠 인코딩
//
//		// 원하는 메일 제목 작성
//		String subject = "인증 번호 발송 코드입니다.";
//
//		// 보낸 이메일 작성
//		String fromEmail = "ruejaeeun99@gmail.com";
//		String fromUsername = "류재은";
//
//		String toEmail = "ruejaeeun99@gmail.com"; // 콤마(,)로 여러개 나열
//
//		// 도메인 사용할 필요 없다
//		// 앱비밀번호
//		final String username = "ruejaeeun99@gmail.com";
//		final String password = "dkdq kajh cdfz woxo";
//
//		// 메일에 출력할 텍스트
//		String html = null;
//		StringBuffer sb = new StringBuffer();
//		sb.append("<h3>인증번호</h3>\n");
//		sb.append("★");
//		sb.append(code);
//		sb.append("★");
//		sb.append("<h4>확인후 화면에 입력해주세요</h4>\n");
//		html = sb.toString();
//
//		// 메일 옵션 설정
//		Properties props = new Properties();
//		props.put("mail.smtp.starttls.enable", "true");
//		props.put("mail.smtp.host", "smtp.gmail.com");
//		props.put("mail.smtp.auth", "true");
//		props.put("mail.smtp.port", "587");
//		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
//		props.put("mail.smtp.ssl.protocols", "TLSv1.2");
//
//		try {
//			// 메일 서버 인증 계정 설정
//			Authenticator auth = new Authenticator() {
//				protected PasswordAuthentication getPasswordAuthentication() {
//					return new PasswordAuthentication(username, password);
//				}
//			};
//
//			// 메일 세션 생성
//			Session session = Session.getDefaultInstance(props, auth);
//
//			// 메일 송/수신 옵션 설정
//			Message message = new MimeMessage(session);
//			message.setFrom(new InternetAddress(fromEmail, fromUsername));
//			message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
//			message.setSubject(subject);
//			message.setSentDate(new Date());
//
//      // 메일 콘텐츠 설정
//			Multipart mParts = new MimeMultipart();
//			MimeBodyPart mTextPart = new MimeBodyPart();
//			MimeBodyPart mFilePart = null;
//    
//      // 메일 콘텐츠 - 내용
//			mTextPart.setText(html, bodyEncoding, "html");
//			mParts.addBodyPart(mTextPart);
//            
//      // 메일 콘텐츠 설정
//			message.setContent(mParts);
//
//			// 메일 발송
//			Transport.send(message);
//			
////			메일 발송후 확인
//			expression = sc.nextLine();
//			
//			if(code.equals(expression)) {
//				System.out.println("인증이 완료되었습니다.");
//			}else {
//				System.out.println("인증 번호를 확인하세요.");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//}
