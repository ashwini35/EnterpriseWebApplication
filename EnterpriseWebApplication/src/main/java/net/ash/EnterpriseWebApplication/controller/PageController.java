package net.ash.EnterpriseWebApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value= {"/","index","model"})
	public ModelAndView index() 
	{
		System.out.println("coming to page controller class --------");
		ModelAndView mv =  new ModelAndView("page");
		mv.addObject("greeting", "Welcome to my Enterprise Application");
		return mv;
	}
	

}
