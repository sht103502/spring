package com.icia.tae.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;


import com.icia.tae.dao.MemberDAO;
import com.icia.tae.dto.MemberDTO;
@Service
public class MemberService {
	ModelAndView mav = new ModelAndView();
	@Autowired
	HttpSession session;
	@Autowired
	MemberDAO dao;
	
	//member
		public ModelAndView join(MemberDTO member) {
			int result =dao.join(member);
			
			if(result>0) {
				mav.setViewName("loginForm");
			}else {
				mav.setViewName("index");
			}
			return mav;
		}
		
		public ModelAndView memberList() {
			List<MemberDTO> mList= dao.memberList();
			mav.addObject("mList", mList);
			mav.setViewName("memberList");
			return mav;
		}
		
		//회원로그인
		public ModelAndView Login(MemberDTO member) {
			System.out.println("=================================================================service=====================================");
			String loginID = dao.Login(member);
			
			System.out.println("=================================================================service=====================================");
			System.out.println("dao에서 리턴된 값 :" + loginID);
			if(loginID !=null) {
				session.setAttribute("loginID", loginID);
				mav.setViewName("index");
			}else {
				mav.setViewName("loginForm");
			}
			return mav;
		}
		
		public String idOverlap(String mid) {
			String idCheck =dao.idOverlap(mid);
			String resultMsg= null;
			if(idCheck == null) {
				resultMsg="OK";
			}else {
				resultMsg="NO";
			}
			return resultMsg;
		}
	
	
}
