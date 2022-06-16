package models;

import java.util.List;

import models.Pojo.Link;
import models.Pojo.User;

public interface ILinkService {
	
	Link shortenLink(User user,String url);
	Link shortenLink(String url);
	Link getLinkByUrl(int Id);
	List<Link> getLink(int Id);
	
	
}