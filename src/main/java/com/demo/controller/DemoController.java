package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	@RequestMapping("/demo")
	public ModelAndView demoView() {
		
		ModelAndView modelAndView = new ModelAndView("demo.html");
		return modelAndView;
		
		
	}

}
