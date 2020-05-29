package com.myfirstsite.mvc.beans;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.myfirstsite.mvc.validators.phonenumber.ContactNumberConstraint;


public class Student {
	
	@NotNull
	@Size(min=2,message="Required Field") 
	private String firstName; 

	@NotNull
	@Size(min=2,message="Required Field")
	private String lastName;
	
	@NotNull
	private String birthdate;
	
	@NotNull
	@Email
	private String email;
	
	@NotNull
	private String profession;
	
	@ContactNumberConstraint
	private String phoneNumber;
	
	
	@NotNull
	@Min(value = 10, message = "Minimun number is 10")
	@Max(value = 100, message = "Maximun number is 100")
	private int favNum;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public int getFavNum() {
		return favNum;
	}
	public void setFavNum(int favNum) {
		this.favNum = favNum;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
