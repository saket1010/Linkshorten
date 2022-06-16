package models.Pojo;

enum Gender
{
	male,female,other;
}

public class User {
	
	@javax.persistence.Id
	private int Id;
	private String first_name;
	private String  last_name;
	private Address address;  
	private String email_id;
	private String mobile_number;
	private Gender gender;

}
