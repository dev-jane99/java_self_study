package view;

import dao.MemberDAO;
import vo.MemberVO;

public class View {
	public static void main(String[] args) {
//		단위테스트 하기
		MemberDAO memberDAO = new MemberDAO();
		MemberVO memberVO = new MemberVO();
		
//		MEMBER_ID, MEMBER_PASSWORD, MEMBER_NAME, MEMBER_ADDRESS
//		"jane99", "1234", "류재은", "서울시 서초구"
//		객체화된 데이터에 임의 데이터를 삽입 후 join 메서드 실행
		
		memberVO.setMemberId("jane99");
		memberVO.setMemberPassword("1234");
//		memberVO.setMemberName("류재은");
//		memberVO.setMemberAddress("서울시 서초구");
//		System.out.println(memberVO);
		
//		memberDAO.join(memberVO);
//		System.out.println("회원가입 완료");
		
		
//		체크 아이디
//		if (memberDAO.checkId(memberVO.getMemberId())) {
//		    System.out.println("사용가능한 아이디 입니다.");
//		    memberDAO.join(memberVO);
//		    System.out.println("회원가입 완료");
//		}else {
//			System.out.println("이미 사용중인 아이디 입니다.");
//		}
		

//	로그인
//		if (memberDAO.login(memberVO)) {
//			System.out.println("로그인 성공");
//		} else {
//			System.out.println("로그인 실패");
//		}
		
//		마이페이지
		System.out.println(memberDAO.findById());
		
		
	}
}
