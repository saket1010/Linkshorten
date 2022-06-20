package com.example.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import models.Add;

@SpringBootApplication

public class LinkShortenApplication {
	
	@Autowired
	Add a;
	
	public static void main(String[] args) {
		SpringApplication.run(LinkShortenApplication.class, args);
		
		
	}

}
