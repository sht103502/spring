package com.js.member.controller;

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
	
	ModelAndView mav =new ModelAndView();
//	서비스와 연결하기 위한 작업 
	@Autowired
	MemberService mbsvc;
	

		@RequestMapping(value="/", method=RequestMethod.GET)
		public String index() {
			return "index";
		}
		@RequestMapping(value="/joinForm", method=RequestMethod.GET)
		public String joinForm() {
			return "joinForm";
		}

		@RequestMapping(value="/loginForm", method=RequestMethod.GET)
		public String loginForm() {
			return "loginForm";

		}
		//memberJoin
		//회원가입
		@RequestMapping(value="/memberJoin", method=RequestMethod.POST)
		public ModelAndView memberJoin(@ModelAttribute MemberDTO member) {
			
			mav= mbsvc.memberJoin(member);
			
//			mbsvc.memberJoin(member)
			//service에서 정보를 mav에 담아서 돌아온다.
			return mav;
		}
					
		
		//memberList
		//회원목록조회
		//method 안쓰면 GET, POST 모두받음!
		@RequestMapping(value="/memberList")
		public ModelAndView memberList() {
			mav= mbsvc.memberList();
			
			return mav;
		}
		
		@RequestMapping(value="/memberLogin", method= RequestMethod.POST)
		public ModelAndView memberLogin(@ModelAttribute MemberDTO member) {
			mav =mbsvc.memberLogin(member);
			return mav;
			
		}
		
		@RequestMapping(value="/memberView")
		public ModelAndView memberView(@RequestParam("jsid")String id) {
			mav= mbsvc.memberView(id);
			
			return mav;
		}
		

}
