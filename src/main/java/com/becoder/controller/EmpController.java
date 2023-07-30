package com.becoder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.becoder.entity.Employee;


@Controller
public class EmpController {
	@GetMapping("/")
   public String name() {
	   return "index";
   }
	@GetMapping("/add")
	public String addemp() {
		return "Add-Emp";
	}
	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee e) {
		System.out.println(e);
		return "Add-Emp";
	}
	
}
