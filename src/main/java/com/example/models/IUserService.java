package com.example.models;

import java.util.List;
import org.apache.catalina.User;
import com.example.models.Pojo.Link;


public interface IUserService {
	
	public User registerUser(User user);
	public User loginUser(User user);
	public List<Link> getLink(User user);
	public List<Link> getLink(int Id);
	
}
