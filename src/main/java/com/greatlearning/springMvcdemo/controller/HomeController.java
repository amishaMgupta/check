package com.greatlearning.springMvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showPage() {
		System.out.println("hello this is a github demo as well");
		System.out.println("Do some local changes");
		return "main-menu";
	}
}
