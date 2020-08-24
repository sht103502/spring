package com.icia.tae.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.icia.tae.dto.MemberDTO;
import com.icia.tae.service.MemberService;

@Controller
public class MemberController {
	ModelAndView mav = new ModelAndView();
	@Autowired
	HttpSession session;
	@Autowired
	MemberService msvc;
	
	
	
	@RequestMapping(value="/gojoin", method = RequestMethod.GET )
	public String gojoin() {
		return "joinForm";
	}
	@RequestMapping(value="/gologin", method = RequestMethod.GET )
	public String gologin() {
		return "loginForm";
	}

	
	@RequestMapping(value="/join")
	public ModelAndView join(@ModelAttribute MemberDTO member) {
	mav = msvc.join(member);
	return mav;
}

//회원로그인
@RequestMapping(value="/Login", method=RequestMethod.POST)
public ModelAndView Login(@ModelAttribute MemberDTO member) {
	
	mav = msvc.Login(member);
	return mav;
}

//회원목록 조회(memberList)
@RequestMapping(value="/memberList")
public ModelAndView memberList() {
	mav = msvc.memberList();
	return mav;
}
//회원로그아웃 처리
@RequestMapping(value="/logOut")
public String Logout(){
session.invalidate();
	return "index";
}
//아이디 중복 확인
@RequestMapping(value="/idoverlap")
public @ResponseBody String idOverlap(@RequestParam("mid") String mid){
	String resultMsg = msvc.idOverlap(mid);
	return resultMsg;

}


}
