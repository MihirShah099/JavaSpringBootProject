package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller   
public class control {
	@RequestMapping(value="/")
	public ModelAndView load(){
		return new ModelAndView("hello","msg","hello world");
	}
}
