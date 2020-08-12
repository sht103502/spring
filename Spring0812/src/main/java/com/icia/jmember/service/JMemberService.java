package com.icia.jmember.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icia.jmember.dao.JMemberDAO;
import com.icia.jmember.dto.JMemberDTO;
import com.icia.jmember.dto.JoinMemberDTO;

@Service
public class JMemberService {

	@Autowired
	private JMemberDAO dao;
	
	private ModelAndView mav;
	
	
	
/////////////////////////////////////////////새로추가
	public ModelAndView insert1(JoinMemberDTO joinmember) {
		mav = new ModelAndView();
		int result = dao.insert1(joinmember);
		
		if(result>0) {   
			 
			mav.setViewName("JoinForm");
			
		} else {
			
			mav.setViewName("index");
		}
		
		return mav;
	}


	public ModelAndView mList1() {
		mav = new ModelAndView();
		List<JoinMemberDTO> mList1 = dao.mList1();
		
		mav.addObject("mList1", mList1);
		mav.setViewName("JoinMemberList");
		
		return mav;
	}


	

}
