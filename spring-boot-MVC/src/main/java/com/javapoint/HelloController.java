package com.javapoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@GetMapping("/demo1")
	public String demo1() {
		return "hello this is demo1";
	}
	
	@GetMapping("/demo2")
	public ModelAndView demo2() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("name","Sriram");
		mv.setViewName("index");
		return mv;
	}
}
