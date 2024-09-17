package com.ecom.shree;

public class User {
	private String name;
	private String phone;
	private String address;
	private String password;
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, String phone, String address, String password) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
