package com.js.member.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.js.member.dao.MemberDAO;
import com.js.member.dto.MemberDTO;

@Service
public class MemberService {

	@Autowired
	MemberDAO dao;
	
	@Autowired
	HttpSession session;
	
	//MemberDAO dao =new MemberDAO();
	ModelAndView mav= new ModelAndView();
	
	//회원가입
	public ModelAndView memberJoin(MemberDTO member) {
		int result = dao.memberJoin(member);
//		DAO.MEMBERjOIN(MEMBER) 성공하면 1, 실패하면 0을 반환
		if(result>0) {
			mav.setViewName("loginForm");
			System.out.println("member"+member.toString());
			
		}else {
			mav.setViewName("index");
		}
		return mav;
	}

	public ModelAndView memberList() {
		List<MemberDTO> mList = dao.memberList();
		
		
		//ModelAndView
		//Model : Object
		//View  : 이동할 jsp주소
		
		//servlet 사용시
		//serAttribute
		mav.addObject("mList",mList);
		
		//dispacther
		mav.setViewName("memberList");
		
		
		//현재 mav에는 이동할 jsp주소 memberList와 Lisr<MemberDTO>를 담고 있다.
		
		//service 에서는 이동할 주소를 선언만 해주고
		//실제 jsp로 이동하는건 controller에서 한다.
		System.out.println("================= mav확인 ================");
		
		System.out.println(mav);
		
		System.out.println("========================================");
		return mav;
	}

	//회원로그인
		public ModelAndView memberLogin(MemberDTO member) {
		String loginID= dao.memberLogin(member);
		System.out.println("dao에서 리턴된 값 : "+ loginID);
		
		if(loginID != null) {
			session.setAttribute("loginID", loginID);
			mav.setViewName("index");
		}else {
			mav.setViewName("loginForm");
		}
		return mav;
	}
		
	//회원 상세보기
		public ModelAndView memberView(String id) {
			MemberDTO mView = dao.memberView(id);
			mav.addObject("mView",mView);
			System.out.println("================= mav확인2 ================");
			
			System.out.println(mav);
			
			System.out.println("========================================");
			mav.setViewName("memberView");
			return mav;

}
}
