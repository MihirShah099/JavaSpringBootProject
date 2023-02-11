package com.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.regvo.statevo;
import com.regvo.countryvo;
import com.regdao.dao;
@Controller
public class control {
	@Autowired
	dao regdao;
	@RequestMapping(value = "coun.html", method = RequestMethod.GET)
	public ModelAndView load() {
		return new ModelAndView("country", "vo", new countryvo());
	}
	@RequestMapping(value = "save.html", method = RequestMethod.POST)
	public ModelAndView countryins(@ModelAttribute countryvo v){
		this.regdao.insert(v);
		return new ModelAndView("display");
		}
	@RequestMapping(value="state.html",method=RequestMethod.GET)
		public ModelAndView stateload(@ModelAttribute countryvo v,@ModelAttribute statevo v1){
		List ls=this.regdao.search(v);
		return new ModelAndView("stateins","vo",v1).addObject("list",ls);
	}
	@RequestMapping(value="statein.html",method=RequestMethod.POST)
	public ModelAndView stateins(@ModelAttribute statevo v,@ModelAttribute countryvo v1){
		v1=v.getCid();
		v.setCid(v1);
		this.regdao.inserts(v);
		return new ModelAndView("display","vo",v);
	}
	@RequestMapping(value="states.html",method=RequestMethod.GET)
	public ModelAndView searchs(@ModelAttribute statevo v){
		List ls=this.regdao.searchs(v);
		return new ModelAndView("display","lis",ls);
	}

}


