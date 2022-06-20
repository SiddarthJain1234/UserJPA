package com.atcs.userjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.math.BigInteger;
import java.sql.Date;

@Entity
@Table(name="user_profiles")
public class User_profilesEntity {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	
	@Column
	String add1;
	
	@Column
	String add2;
	
	@Column
	String city;
	
	@Column
	String country;
	
	//dob logic
	@Column
	String dob;
	
	@Column
	String gender;
	
	@Override
	public String toString() {
		return "User_profilesEntity [id=" + id + ", add1=" + add1 + ", add2=" + add2 + ", city=" + city + ", country="
				+ country + ", dob=" + dob + ", gender=" + gender + ", phoneNo=" + phoneNo + ", state=" + state
				+ ", street=" + street + ", zipcode=" + zipcode + ", user=" + user + "]";
	}

	@Column
	String phoneNo;
	
	@Column
	String state;
	
	@Column
	String street;
	
	@Column
	String zipcode;
	
	@OneToOne
	UsersEntity user;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdd1() {
		return add1;
	}

	public void setAdd1(String add1) {
		this.add1 = add1;
	}

	public String getAdd2() {
		return add2;
	}

	public void setAdd2(String add2) {
		this.add2 = add2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public UsersEntity getUser() {
		return user;
	}

	public void setUser(UsersEntity user) {
		this.user = user;
	}

	public User_profilesEntity(long id, String add1, String add2, String city, String country, String dob, String gender,
			String phoneNo, String state, String street, String zipcode, UsersEntity user) {
		super();
		this.id = id;
		this.add1 = add1;
		this.add2 = add2;
		this.city = city;
		this.country = country;
		this.dob = dob;
		this.gender = gender;
		this.phoneNo = phoneNo;
		this.state = state;
		this.street = street;
		this.zipcode = zipcode;
		this.user = user;
	}

	public User_profilesEntity() {
		}
	
	
}
