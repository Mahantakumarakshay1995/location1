package com.psalocation_web_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psalocation_web_app.entity.Location;
import com.psalocation_web_app.services.LocationService;

@Controller
public class LocationController {
	
	@Autowired
	private LocationService lserv;
	@RequestMapping("/showlocation")
	public String showLocation() {
		return"location";
	}
	@RequestMapping("/savelocation")
	public String saveLocation(@ModelAttribute("xyz") Location l) {
		
		lserv.saveLocation(l);
		
		return"location";
		
	}

}
