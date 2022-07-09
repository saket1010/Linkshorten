package com.example.models.Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



@Entity
public class Address {
	
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	private String house_no;
	private String city;
	private String state;
	private String pin_code;
	private String locality;
	private String country_name;
	public Address(int id, String house_no, String city, String state, String pin_code, String locality,
			String country_name) {
		super();
		Id = id;
		this.house_no = house_no;
		this.city = city;
		this.state = state;
		this.pin_code = pin_code;
		this.locality = locality;
		this.country_name = country_name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getHouse_no() {
		return house_no;
	}
	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPin_code() {
		return pin_code;
	}
	public void setPin_code(String pin_code) {
		this.pin_code = pin_code;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	
	
	
}
