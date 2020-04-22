package com.hs.manage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hs.manage.service.RegUserService;


@Controller
public class RegUserController {
	
	@Autowired
	RegUserService RegUserService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/movereguser")
	public String movereguser() {
		
		logger.debug("회원가입 처리");
		
		return "reguser";
	}
	
	@RequestMapping("/reguser")
	public ModelAndView reguser (String id, String password, String email1, String email2 ) {
		
		ModelAndView mv = new ModelAndView();
		
		int result = RegUserService.insertUserInfo(id, password, email1, email2);
		
		if(result == 0 ) {	
			
			mv.setViewName("home");
			mv.addObject("msg", "IN");
		}else {	
			
			mv.setViewName("redirect:/movereguser");
		}
		
		return mv;
		
	}
	
}
