package com.kw.restapikw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kw.restapikw.services.HelloServiceImpl;

/**
 * This class helps to control the initial page like index, login and logout.
 * 
 * @author dknitk
 *
 */
@Controller
public class HelloController {
	@Autowired
	private HelloServiceImpl helloService;
	
	@RequestMapping(value = { "/","/hello" }, method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		// helloService.getHelloWorld();
		return modelAndView;
	}

	@RequestMapping(value = { "/error" }, method = RequestMethod.GET)
	public ModelAndView errorRedirect() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("error");
		return modelAndView;
	}	

}