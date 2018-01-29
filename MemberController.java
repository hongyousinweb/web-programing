package com.kte.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	@RequestMapping(value="/login.do",method=RequestMethod.GET)
	public String login() {
		return "v1_login";
		
	}
	
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public String loginPost() {
		
		//request.sendRedirect();
		return "redirect:login.do";
	}
	public String join() {
		return null;
	}
	public String changemember() {
		return null;
	}
	test1
}
