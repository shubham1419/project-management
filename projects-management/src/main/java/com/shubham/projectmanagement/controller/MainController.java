package com.shubham.projectmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value={"/","home","index"})
	public ModelAndView home()
	{
	ModelAndView mv = new ModelAndView("index");
	mv.addObject("title","Login");
	mv.addObject("userClickIndex",true);
	return mv;
	}
	
	@RequestMapping("dashboard")
	public ModelAndView dashboard()
	{
	 ModelAndView	 mv = new ModelAndView("index");
	 mv.addObject("userCLickDashboard", true);
	 mv.addObject("title","Dashboard");
	 return mv;
	}
}
