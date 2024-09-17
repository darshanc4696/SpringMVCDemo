package com.darshan.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	String firstPage()
	{
		return "index.html";
	}
	
	@RequestMapping("/projects")
	String showProjects()
	{
		return "project.html";
	}
}
