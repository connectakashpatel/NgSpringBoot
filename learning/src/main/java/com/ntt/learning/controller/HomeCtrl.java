package com.ntt.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ntt.learning.model.Person;

@Controller
public class HomeCtrl {
	
	@RequestMapping("/home")
	public String welcome() {
		return "home";
	}
	
	@PostMapping("/save")
    public String register(@RequestBody Person person) {
        System.out.println("name:" + person.getName());
        return "OK";
    }

}
