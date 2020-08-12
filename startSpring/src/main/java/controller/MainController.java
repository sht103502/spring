package controller;




import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dto.Member;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController { 
	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String test(Model model,Member member) {
		model.addAttribute("memb",member);
		return "test";

	}
	// 처음 시작하는 페이지 (value ="/") 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
		// 실제 실행되는 jsp 경로 
		//return WEB-INF/views/index.jsp
		//prefix : WEB-INF/views/
		//suffix : .jsp
	}
	
	@RequestMapping(value = "loginpage", method = RequestMethod.GET)
	public String LoginPage() {
		
		return "login";

	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String Login(HttpServletRequest request, HttpSession session) {
		String userID =request.getParameter("id");
		String userPW =request.getParameter("pw");
		
		
		session.setAttribute("sessionID", userID);
		session.setAttribute("sessionPW", userPW);
		
		if(userID.equals("admin") && userPW.equals("admin1234")) {
			return "LoginSuccess";
		}else {
			return "LoginFail";
			
		}

	}

	
}

