package com.Controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Register.RegVO;




@Controller
public class RegController 
{	
	@RequestMapping(value="form.html",method=RequestMethod.GET)
	public ModelAndView helo(){
		return new ModelAndView("form");
	}
	
	@RequestMapping(value="welcome.html",method=RequestMethod.GET)
	public ModelAndView welcome(HttpServletRequest rq){
		
		String un = rq.getParameter("uname");
	//	System.out.println(un);
		String pw = rq.getParameter("pass");
	//	System.out.println(pw);
		if(un.equals("root") && (pw.equals("root")))
		{
		return new ModelAndView("form");
		}
		else{
			return new ModelAndView("1");
		}
	}
	
	
	@RequestMapping(value="register.html",method=RequestMethod.GET)
	public ModelAndView register(HttpServletRequest rq){
		
		return  new ModelAndView("register","VO",new RegVO());
		
	}
	
	@RequestMapping(value="save.html",method=RequestMethod.POST)
	public ModelAndView save(HttpSession session , HttpServletRequest rq){
		
		String un = rq.getParameter("uname");

		String pw = rq.getParameter("pass");

	session.setAttribute("un",un );
	session.setAttribute("pw", pw);
		return  new ModelAndView("login","VO",new RegVO());
		
	}
	
	
	@RequestMapping(value="loginSave.html",method=RequestMethod.POST)
	public ModelAndView loginSave(@ModelAttribute RegVO v,HttpSession session){
	
		
		
		
		String un = (String)session.getAttribute("un");

		String pw = (String)session.getAttribute("pw");
	
		
		String lun = v.getUname();

		String lpw = v.getPass();

		
		if(un.equals(lun) && (pw.equals(lpw)))
		{
			return new ModelAndView("1");
		}
		else{
			return new ModelAndView("login","VO",new RegVO());
		}
		
		
		
	}
}
