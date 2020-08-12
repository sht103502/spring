package com.icia.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.icia.member.dto.MemberDTO;
import com.icia.member.service.MemberService;

@Controller
public class MemberController {

	
	@Autowired
	private MemberService mbsvc;
	
	private ModelAndView mav;
	
	@RequestMapping(value="/")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping(value="/insertDB")
	public ModelAndView insert(@ModelAttribute MemberDTO member) {
		mav = new ModelAndView();	
		mav = mbsvc.insert(member);	
		return mav;
	}
	@RequestMapping(value="/selectDB")
	public ModelAndView mList() {
		mav = new ModelAndView();
		mav = mbsvc.mList();
		return mav;
	}
	
	
	
	
	
	
	
	
}
