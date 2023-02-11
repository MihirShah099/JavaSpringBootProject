package com.Controller;

import org.apache.catalina.connector.Request;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.vo.regvo;

@Controller
public class controller {
	@RequestMapping(value = "register.html", method = RequestMethod.GET)
	public ModelAndView load() {
		return new ModelAndView("register", "vo", new regvo());
	}

	@RequestMapping(value = "save.html", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute regvo vo, HttpSession session) {

		session.setAttribute("name", vo.getUname());
		session.setAttribute("password", vo.getPass());
		return new ModelAndView("login", "vo", new regvo());
	}

	@RequestMapping(value = "verify.html", method = RequestMethod.POST)
	public ModelAndView verfiy(HttpSession session, @ModelAttribute regvo vo) {
		
		String s = (String) session.getAttribute("name");
		String s1 = (String) session.getAttribute("password");
		session.setAttribute("fn", "fname");
		session.setAttribute("ln", "lname");
		
		String s2 = vo.getUname();
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		String s3 = vo.getPass();
		System.out.println(s3);
		if (s2.equals(s) && s3.equals(s1)) {
			return new ModelAndView("display","data",vo);
		} else {
			return new ModelAndView("login");
		}
	}

}
