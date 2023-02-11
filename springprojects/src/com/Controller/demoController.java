package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class demoController {

	@RequestMapping(value = "demo.html", method = RequestMethod.GET)
	public ModelAndView load()
	{
		System.out.println("in controller");
		return new ModelAndView("demo","s","hhhhhhhhhhhhh");
	}
}
