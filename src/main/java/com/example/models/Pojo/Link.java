package com.example.models.Pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Link implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	private String url;
	private String domain;
	private Date   creationDate;
	private Date   expireDate;
	

	@GenericGenerator(
			name = "shorten_id", 
			strategy = "com.example.models.Pojo.ShortenLinkIdGenerator"
			)
    @GeneratedValue(generator = "shorten_id")    
	@Column(name="shorten_id", nullable=false)
	private String shortenUrlId;
	
	@ManyToOne
	private User user;

	public Link(long id, String url, String domain, Date expireDate, String shortenUrlId,
			User user) {
		super();
		Id = id;
		this.url = url;
		this.domain = domain;
		this.creationDate = new Date();
		this.expireDate = expireDate;
		this.shortenUrlId = shortenUrlId;
		this.user = user;
	}
	
	public Link() {
		// TODO Auto-generated constructor stub
	}
	
	public Link(String url,String shortUrlId) {
		// TODO Auto-generated constructor stub
		this.url=url;
		this.creationDate=new Date();
		this.shortenUrlId=shortUrlId;
		Date d=new Date();
		d.setMonth(d.getMonth()+1);
		this.expireDate=d;
		this.domain="http://localhost:8080";
		
	}


	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getShortenUrlId() {
		return shortenUrlId;
	}

	public void setShortenUrlId(String shortenUrlId) {
		this.shortenUrlId = shortenUrlId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}


