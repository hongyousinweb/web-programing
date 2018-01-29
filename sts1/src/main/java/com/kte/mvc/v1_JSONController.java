package com.kte.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kte.mvc.VO.Member;

@RestController
public class v1_JSONController {
	@RequestMapping(value ="/json_idcheck.do",method= {RequestMethod.GET,RequestMethod.POST})
	public Member json_idcheck() {
		Member vo = new Member();
		vo.setId("aaa");
		vo.setPw("bbb");
		vo.setName("ccc");
		
		return vo;
	}
}
