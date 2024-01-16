package com.example.Spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller 
{
	   @GetMapping("/home") 
	   public String Home()
	   {
		   return "welcome to spring boot apllication";
	   }	
}