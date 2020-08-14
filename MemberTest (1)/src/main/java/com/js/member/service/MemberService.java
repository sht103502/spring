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
	// MemberDAO dao = new MemberDAO();
	
	@Autowired
	HttpSession session;
	
	ModelAndView mav = new ModelAndView();
	
	public ModelAndView memberJoin(MemberDTO member) {
		int result = dao.memberJoin(member);
		
		// dao.memberJoin(member) 성공하면  1, 실패하면 0 값을 반환
		if(result>0) {
			mav.setViewName("loginForm");
		} else {
			mav.setViewName("index");
		}
		return mav;
	}

	public ModelAndView memberList() {
		List<MemberDTO> mList = dao.memberList();
		
		// ModelAndView
		// Model : Object
		// View : 이동할 jsp주소
		
		// servlet 사용시 setAttribute
		mav.addObject("mList", mList);
		
		// dispatcher
		mav.setViewName("memberList");
		
		// 현재 mav에는 이동할 jsp주소 memberlist와
		// List<MemberDTO>를 담고 있다.
		
		// service에서는 이동할 주소를 선언만 해주고
		// 실제 jsp로 이동하는 것은 controller에서 한다.
		System.out.println("=================== mav 확인 =====================");
		System.out.println(mav);
		return mav;
	}

	// 회원 로그인
	public ModelAndView memberLogin(MemberDTO member) {
		String loginID = dao.memberLogin(member);
		System.out.println("dao에서 리턴된 값 :" + loginID);
		
		if(loginID != null) {
			session.setAttribute("loginID", loginID);
			mav.setViewName("index");
		} else {
			mav.setViewName("loginForm");
		}
		return mav;
	}

	public ModelAndView memberView(String id) {
		MemberDTO mView = dao.memberView(id);
		
		if(mView!= null) {
			mav.addObject("mView", mView);			
			mav.setViewName("MemberView");
		}else {
			mav.setViewName("index");
		}

		return mav;
	}

	public ModelAndView memberDelete(String id) {
		int result = dao.memberDelete(id)
;		
		
		if(result>0) {
			mav.setViewName("redirect:/memberList");
		}else {
			mav.setViewName("index");
		}
		return mav;
	}
	
	public ModelAndView memberModify(String id) {
		MemberDTO mbModify = dao.memberView(id);
		
		mav.addObject("mbModify",mbModify);
		mav.setViewName("memberModify");
		
		return mav;
	
	}
	
	public ModelAndView modifyProcess(MemberDTO member) {
		int result =dao.modifyProcess(member);
		System.out.println("result:"+ result);
		if(result>0) {
			mav.setViewName("redirect:/memberList");
		}else {
			mav.setViewName("index");
		}
		return mav;
	}

}
