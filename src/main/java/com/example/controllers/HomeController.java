package com.example.controllers;

import java.lang.ProcessBuilder.Redirect;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import com.example.models.LinkRepository;
import com.example.models.LinkService;
import com.example.models.Pojo.Link;

import jdk.dynalink.linker.LinkerServices;

@Controller
public class HomeController {
	
	private LinkService linkservice;
	private LinkRepository linkRepository;
	
	private String url;
	
	@Autowired
	public HomeController(LinkRepository linkRepository) {
		// TODO Auto-generated constructor stub
		this.linkRepository=linkRepository;
		this.linkservice=linkservice;
		
	}

	@GetMapping("/{shortenUrlId}")
	public RedirectView Index(@PathVariable String shortenUrlId,ModelAndView mv)
	{
		Link link=this.linkRepository.getLink(shortenUrlId);
		System.out.println(link);
		if(link!=null)
		{
			return new RedirectView("http://WWW."+link.getUrl());

		}
		else
		{
			return null;
		}
		
	}
}
