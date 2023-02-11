package com.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.regdao.regdao;
import com.regvo.regvo;

import com.regvo.loginvo;


@Controller
public class controller {
	@Autowired
	regdao regdao;

	@RequestMapping(value = "reg.html", method = RequestMethod.GET)
	public ModelAndView load() {
		return new ModelAndView("register", "vo", new regvo()).addObject(new loginvo());
	}

	@RequestMapping(value = "save.html", method = RequestMethod.POST)
	public ModelAndView logininst(@ModelAttribute regvo vo, @ModelAttribute loginvo v1) {
		System.out.println(vo.getFname());
		System.out.println(vo.getLname());
		v1 = vo.getVid();
		System.out.println(v1.getUname());
		System.out.println(v1.getPass());
		this.regdao.insert(v1);
		vo.setVid(v1);
		this.regdao.insertr(vo);
		return new ModelAndView("redirect:/search.html");
	}
	@RequestMapping(value="search.html",method=RequestMethod.GET)
	public ModelAndView sear(@ModelAttribute regvo v)
	{	
		List ls=this.regdao.search(v);
		
		return new ModelAndView("display","lis",ls);
		
	}
	@RequestMapping(value="delete.html",method=RequestMethod.GET)
	public ModelAndView delete(@ModelAttribute regvo v,@ModelAttribute loginvo v1,@RequestParam int id){
		v.setId(id);
		this.regdao.delete(v);
		v1 = v.getVid();
		this.regdao.deletel(v1);
		return new ModelAndView("redirect:/search.html");
		
	}
	@RequestMapping(value = "edit.html", method = RequestMethod.GET)
	public ModelAndView edit(@ModelAttribute regvo vo){
		
		List ls=this.regdao.edit(vo);
		
	return new ModelAndView("register", "vo", ls.get(0)) ;
	
	}
	

}
