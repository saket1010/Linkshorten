package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.LinkService;
import com.example.models.Pojo.Link;


@RestController("/Link")
public class LinkController {
	
@Autowired
private LinkService linkservice;



@PostMapping("/shorturl")
public Link shortUrl(@RequestParam String url)
{
	return this.linkservice.shortenLink(url);
}

@GetMapping("/getlinkByShortenUrlId")
public Link getLinkBbyShortenUrlId(@RequestParam String id)
{
	return null;
}

}
