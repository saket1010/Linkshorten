package models.Pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

enum Gender
{
	male,female,other;
}

@Table
@Entity
public class User {
	
	@javax.persistence.Id
	private int Id;
	private String first_name;
	private String  last_name;
	private Address address;  
	private String email_id;
	private String mobile_number;
	
	@OneToMany
	private List<Link> links;
	
	public User(int id, String first_name, String last_name, Address address, String email_id, String mobile_number,
			Gender gender, List<Link> links) {
		super();
		Id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.email_id = email_id;
		this.mobile_number = mobile_number;
		this.gender = gender;
		this.links = links;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	private Gender gender;
	
}
