package models;

import java.util.List;

import models.Pojo.Link;
import models.Pojo.User;

public interface IUserService {
	
	public User registerUser(User user);
	public User loginUser(User user);
	public List<Link> getLink(User user);
	public List<Link> getLink(int Id);
	
}
