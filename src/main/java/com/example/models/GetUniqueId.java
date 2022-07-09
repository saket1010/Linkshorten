package com.example.models;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class GetUniqueId {
	
	LinkRepository linkRepository;
	
	public GetUniqueId(LinkRepository linkRepository) {
		// TODO Auto-generated constructor stub
		this.linkRepository=linkRepository;
	}

	public String getUniqueshortenId()
	{
		return "SRT"+String.valueOf(linkRepository.getLastLinkId()+1);
	}
}
