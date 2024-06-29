package com.techmojo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WishingController {
	
	@RequestMapping("/hello")
	public void hello() {
		System.out.println("Hello");
	}
	
	@RequestMapping
	public void hii() {
		System.out.println("Hii");
	}

}
