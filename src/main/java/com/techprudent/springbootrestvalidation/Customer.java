package com.techprudent.springbootrestvalidation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="customervalidatetable")
public class Customer {

	@Id
	@GeneratedValue
	private long id;
	
	@NotNull(message="enter name") 
	@Size(min=2, max=50)
	private String name;
	
	@Min(value=18, message="age should be more than 18")
	private int age;
	
	@Email(message="Email id is not valid")
	private String email;
	
	@Size(min=10, max=10)
	private String contact;
	
	@NotEmpty(message="enter gender data")
	private String gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
}
