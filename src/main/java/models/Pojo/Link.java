package models.Pojo;

import java.util.Date;

public class Link {
	
	@javax.persistence.Id
	private int Id;
	private String url;
	private String shorten_url;
	private Date creationDate;
	private Date expireDate;
	private User user;
	
	}


