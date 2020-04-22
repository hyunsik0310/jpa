package com.hs.manage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hs.manage.service.FindPasswordService;



@Controller
public class FindPasswordController {
	
	@Autowired
	FindPasswordService findPasswordService;
	
	private static final Logger logger = LoggerFactory.getLogger(FindPasswordController.class);
	
	@RequestMapping("/movefindpassword")
	public String movefindpassword() {
		
		logger.debug("비밀번호찾기");
		
		return "findpassword";
	}
	
	@RequestMapping("/findpassword")
	public ModelAndView findpassword(String id, String email1, String email2) {

		ModelAndView mv1 = new ModelAndView();	
		
		String result = findPasswordService.findpassword(id, email1, email2);
		
		
		mv1.setViewName("findpasswordresult");
		mv1.addObject("result", result);
		
		return mv1;
		
	}
}