package com.replication.rep.starbucks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StarBucksHomeController {

	@RequestMapping(value = "/starbucks/home", method = RequestMethod.GET)
	public String home() {
		return "starbucks";
	}
}
