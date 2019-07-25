package net.javaguides.springboot.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springboot.tutorial.dto.TripRegisterDto;

@Controller
public class PageNavigationController {

	@RequestMapping("/general1")
	public String getGeneralPage(TripRegisterDto tripRegisterDto){
		return "general";
	}
	
}
