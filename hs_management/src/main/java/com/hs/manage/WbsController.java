package com.hs.manage;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hs.manage.entity.User_Info;
import com.hs.manage.entity.Wbs_2020;
import com.hs.manage.entity.Workplaceinfo;
import com.hs.manage.service.WbsTestService;

@Controller
public class WbsController {

	
	@Autowired
	WbsTestService WbsTestService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		
		ModelAndView mv = new ModelAndView("wbs_test2");


		return mv;
	}
	
	
	
	
	@RequestMapping(value = "/wbscheck")
	public ModelAndView wbstestview (String u_no) {
		
		ModelAndView mv = new ModelAndView("wbs_test");

		List<User_Info> wbs1 = WbsTestService.selectWbsCheck(u_no);
		
		List<Wbs_2020> wbs2 = WbsTestService.selectWbsCheck2(u_no);
		
		List<Workplaceinfo> wbs3 = WbsTestService.selectWbsCheck3(u_no);
		
		mv.addObject("wbs1", wbs1);
		mv.addObject("wbs2", wbs2);
		mv.addObject("wbs3", wbs3);
		
		return mv;
	}
	
}
