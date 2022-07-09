package com.example.models;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Pojo.Link;


@Service
public class LinkService implements ILinkService {
	


	private LinkRepository linkrepository;

	private GetUniqueId uniqueid;
	
	@Autowired
	public LinkService(LinkRepository linkrepository,GetUniqueId uniqueId) {
		// TODO Auto-generated constructor stub
		this.linkrepository=linkrepository;
		this.uniqueid=uniqueId;
	}


	@Override
	public Link shortenLink(User user, String url) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Link shortenLink(String url) {
		// TODO Auto-generated method stub
		url=url.trim();
		if(url=="")
		{
			throw new RuntimeException("url is Empty");
		}
		else
		{
			return linkrepository.save(new Link(url,uniqueid.getUniqueshortenId()));
		}
	}

	@Override
	public Link getLink(long id) {
		// TODO Auto-generated method stub
		Link l=linkrepository.findById(id).get();
		
		if(l!=null)
		{
			return l;
		}
		else
		{
			throw new RuntimeException("url not found");
		}
		
	}


	@Override
	public Link getLink(String shortenUrlId) {
		// TODO Auto-generated method stub
		Link link=this.linkrepository.getLink(shortenUrlId);
		if(link!=null)
		{
			return link;
		}
		else
		{
			return null;
		}
	}


	
	

}
