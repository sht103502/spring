package com.js.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.js.member.dto.MemberDTO;
import com.js.member.service.MemberService;

@Controller
public class MemberController {
	
	ModelAndView mav = new ModelAndView();
	
	@Autowired
	MemberService mbsvc;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(value="/", method = RequestMethod.GET )
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/joinForm", method = RequestMethod.GET )
	public String joinForm() {
		return "joinForm";
	}
	
	@RequestMapping(value="/loginForm", method = RequestMethod.GET )
	public String loginForm() {
		return "loginForm";
	}
	
	// 회원가입 (memberJoin)
	@RequestMapping(value="/memberJoin", method = RequestMethod.POST )
	public ModelAndView memberJoin(@ModelAttribute MemberDTO member) {
		// @ModelAttribute MemberDTO 경우 parameter 값과 MemberDTO의 값이 같을 경우
		// 자동적으로 setting이 되어 member라는 객체에 값이 담겨져 있다.
		
		mav = mbsvc.memberJoin(member);
		// mbsvc.memberJoin(member)
		// service에서 정보를 mav에 담아서 돌아온다.
		
		return mav;
	}
	
	// 회원목록 조회 (memberList)
	// method 안쓰면 GET, POST 모두 받음!
	@RequestMapping(value="/memberList")
	public ModelAndView memberList() {
		mav = mbsvc.memberList();
		return mav;
	}
	
	// 회원 로그인
	@RequestMapping(value="/memberLogin", method=RequestMethod.POST)
	public ModelAndView memberLogin(@ModelAttribute MemberDTO member) {
		mav = mbsvc.memberLogin(member);
		return mav;
	}
	
	// 회원 목록 상세보기
	@RequestMapping(value="/memberView")
	public ModelAndView memberView(@RequestParam("jsid") String id) {
		mav = mbsvc.memberView(id);
		return mav;
	}
	
	//회원 삭체
	@RequestMapping(value="/memberDelete", method=RequestMethod.GET)
	public ModelAndView memberDelete(@RequestParam("jsid") String id) {
		mav = mbsvc.memberDelete(id);
		return mav;
	}
	@RequestMapping(value="/memberModify", method=RequestMethod.GET)
	public ModelAndView memberModify(@RequestParam("jsid") String id) {
		mav = mbsvc.memberModify(id);
		return mav;
	}
	
	
	//회원 목록 수정페이지
	@RequestMapping(value="/modifyProcess", method=RequestMethod.POST)
	public ModelAndView modifyProcess(@RequestParam("jsid") MemberDTO member) {
		mav = mbsvc.modifyProcess(member);
		return mav;
	}
	
	//회원로그아웃 처리
		@RequestMapping(value="/logOut")
		public String memberLogout(){
		session.invalidate();
			return "index";
		}
	
}
