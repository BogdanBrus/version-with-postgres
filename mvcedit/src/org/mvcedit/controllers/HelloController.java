package org.mvcedit.controllers;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.mvcedit.models.Partner;
import org.mvcedit.services.ServicePartner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {

	@Inject
	private ServicePartner servicePartner;
	
	@RequestMapping("/hello")
	public ModelAndView fromHello(){
		String msg = "I am message from controller hello";
		return new ModelAndView("hello","message", msg);
	}
	
	
	//for hibernate
	@RequestMapping("/home")
	public ModelAndView fromHome() {
		ModelAndView modelAndView = new ModelAndView();
		Logger logger = log.LogInst.getLogger();
		logger.info("Logger work at /home!");
		
		List<Partner> partners = servicePartner.getAllPartner();
		modelAndView.addObject("partners",partners);
		modelAndView.setViewName("home");
		return modelAndView;
	}
	
	@RequestMapping("/login")
	public ModelAndView fromLogin(){
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("login");
		return modelAndView;

	}
	
	@RequestMapping("/access-denied")
	public ModelAndView fromAccessDenied(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("access-denied");
		return modelAndView;

	}
	
}
