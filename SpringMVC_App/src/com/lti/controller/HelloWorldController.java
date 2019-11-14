package com.lti.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/hello" ,method=RequestMethod.GET)
	public ModelAndView hello()
	{
		ModelAndView model=new ModelAndView("hello");
		model.addObject("message", "Hello from spring mvc app");
		return model;
	}
	
	@RequestMapping(value="/sayHello" ,method=RequestMethod.GET)
	public ModelAndView sayHelloToName(@RequestParam("username") String name)
	{
		ModelAndView model=new ModelAndView("sayHello");
		model.addObject("name1", name);
		model.addObject("todaysDate",new Date());
		return model;
	}
	
	@RequestMapping(value="/prime",method=RequestMethod.GET)
	public ModelAndView primeno (@RequestParam("number")int number)
	{
		ModelAndView model=new ModelAndView("Prime");
		String result;
		if(number%2==0)
		{
			result="Number is even";
			
		}
		else
		{
			result="number is odd";
		}
		
		model.addObject("result", result );
		return model;
	}
}
