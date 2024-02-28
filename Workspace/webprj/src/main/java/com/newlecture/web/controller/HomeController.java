package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/")
public class HomeController
{
	@RequestMapping("index")
	//@ResponseBody
	public String index() {
		
		//return "Hello Index1";
		return "root.index";  //tiles 설정 
	}

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		//System.out.println("index Controller");
//		ModelAndView mv = new ModelAndView("root.index"); //tiles 설정 
//		//ModelAndView mv = new ModelAndView("index");
//		mv.addObject("data", "Hello Spring MVC~");
//		//mv.setViewName("/WEB-INF/view/index.jsp");
//		return mv;
//	}
	
}
