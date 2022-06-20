package models.Pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
public class Link {
	
	@javax.persistence.Id
	private int Id;
	private String url;
	private String shorten_url;
	private Date creationDate;
	private Date expireDate;
	
	@ManyToOne
	private User user;
	
	public Link(int id, String url, String shorten_url, Date creationDate, Date expireDate, User user) {
		super();
		Id = id;
		this.url = url;
		this.shorten_url = shorten_url;
		this.creationDate = creationDate;
		this.expireDate = expireDate;
		this.user = user;
	}
	@Override
	public String toString() {
		return "Link [Id=" + Id + ", url=" + url + ", shorten_url=" + shorten_url + ", creationDate=" + creationDate
				+ ", expireDate=" + expireDate + ", user=" + user + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getShorten_url() {
		return shorten_url;
	}
	public void setShorten_url(String shorten_url) {
		this.shorten_url = shorten_url;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	}


