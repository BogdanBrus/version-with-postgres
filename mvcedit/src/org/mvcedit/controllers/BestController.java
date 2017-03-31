package org.mvcedit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BestController {

	
	@RequestMapping ("/best")
	public ModelAndView getBest(){
		String msg = "I am best controller";
		return new ModelAndView("best","message",msg);
	}
	@RequestMapping ("/*.in")
	public ModelAndView inBest(){
		String msg = "I am inbest controller";
		return new ModelAndView("inbest","message",msg);
	}
	
	
	
	
}


