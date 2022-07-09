package com.example.models;

import org.apache.catalina.User;
import com.example.models.Pojo.Link;

public interface ILinkService {
	Link shortenLink(User user,String url);
	Link shortenLink(String url);
	Link getLink(long Id);
	Link getLink(String LinkId);
}