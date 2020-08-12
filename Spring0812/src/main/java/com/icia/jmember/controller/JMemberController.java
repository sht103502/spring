package com.icia.jmember.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.icia.jmember.dto.JMemberDTO;
import com.icia.jmember.dto.JoinMemberDTO;
import com.icia.jmember.service.JMemberService;

@Controller
public class JMemberController {

	
	@Autowired
	private JMemberService mbsvc;
	
	private ModelAndView mav;
	
	/*
	 * @RequestMapping(value="/") public String index() { return "index"; }
	 * 
	 * @RequestMapping(value="/insertDB") public ModelAndView insert(@ModelAttribute
	 * JMemberDTO member) { mav = new ModelAndView(); mav = mbsvc.insert(member);
	 * return mav; }
	 * 
	 * @RequestMapping(value="/selectDB") public ModelAndView mList() { mav = new
	 * ModelAndView(); mav = mbsvc.mList(); return mav;
	 * 
	 * }
	 */
	////////////////////////////////////////////////////// 새로추가
	@RequestMapping(value="/")
	public String index2() {
		return "index2";
	}
	@RequestMapping(value="/insertDB1")
	public ModelAndView insert1(@ModelAttribute JoinMemberDTO joinmember) {
		mav = new ModelAndView();	
		mav = mbsvc.insert1(joinmember);	
		return mav;
	}
	
	@RequestMapping(value="/selectDB1")
	public ModelAndView mList1() {
		mav = new ModelAndView();
		mav = mbsvc.mList1();
		return mav;
		
	}
	

}

