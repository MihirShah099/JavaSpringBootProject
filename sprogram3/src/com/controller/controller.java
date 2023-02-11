package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.regdao;
import com.vo.regvo;

@Controller
public class controller {
	@Autowired
	regdao s1;
	@RequestMapping(value = "reg.html", method = RequestMethod.GET)
	public ModelAndView load() {
		return new ModelAndView("register", "vo", new regvo());
	}
	@RequestMapping(value = "save.html", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute regvo vo) {
		
		this.s1.insert(vo);
		return new ModelAndView("redirect:/search.html");
		
	}
	@RequestMapping(value = "search.html", method = RequestMethod.GET)
		public ModelAndView search(@ModelAttribute regvo vo,HttpSession session)
		{	
			List ls=this.s1.search(vo);
			
			return new ModelAndView("display","list",ls);
		}
	@RequestMapping(value = "edit.html", method = RequestMethod.GET)
	public ModelAndView edit(@ModelAttribute regvo vo){
			
		List ls=this.s1.edit(vo);
		
	return new ModelAndView("register", "vo", ls.get(0)) ;
	
	}
	@RequestMapping(value = "delete.html", method = RequestMethod.GET)
	public ModelAndView delete(@ModelAttribute regvo vo ,@RequestParam int id) {
		vo.setId(id);
		this.s1.delete(vo);
		return new ModelAndView("display","data",vo);
		}

}
