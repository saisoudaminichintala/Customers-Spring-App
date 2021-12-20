package com.example.demo.ResponseDto;

public class CustomerDetailsResponse {
	
	private Integer customerId; // 
	
	private String fullName;
	
	private Integer age;
	
	private String phoneNumber;
	
	private String email;
	
	private String eligiblityStatus;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEligiblityStatus() {
		return eligiblityStatus;
	}

	public void setEligiblityStatus(String eligiblityStatus) {
		this.eligiblityStatus = eligiblityStatus;
	}
	
	
	

}
