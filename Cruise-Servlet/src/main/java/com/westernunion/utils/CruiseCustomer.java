package com.westernunion.utils;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("serial")
public class CruiseCustomer implements Serializable{ 
	//implements WesternUnionResponseModel{	
	
	private String providerId;
	private String empId;
	private String clientId;
	private String shipId;
	private int	   customerId;
	private String country;
	private String fname;
	private String lname;
	private String addr1;
	private String addr2;
	private String city;
	private String state;
	private String zip;
	private String email;
	private String phone;
	private String cardbin;
	private String street1;
	private String street2;
	private int    promoCodeUseCount;
	
	/*private String dat_created;
	private String dat_modified;
	private String str_status;*/
	
	public CruiseCustomer(){
		
	}
	
	public String getProviderId() {
		return providerId;
	}
	@XmlElement(name="providerId")
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getEmpId() {
		return empId;
	}
	@XmlElement(name="empId")
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public String getClientId() {
		return clientId;
	}
	@XmlElement(name="clientId")
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	
	public String getShipId() {
		return shipId;
	}
	@XmlElement(name="shipId")
	public void setShipId(String shipId) {
		this.shipId = shipId;
	}

	public int getCustomerId() {
		return customerId;
	}
	@XmlElement(name="customerId")
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCountry() {
		return country;
	}
	@XmlElement(name="country")
	public void setCountry(String country) {
		this.country = country;
	}

	public String getFname() {
		return fname;
	}
	@XmlElement(name="fname")
	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}
	@XmlElement(name="lname")
	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddr1() {
		return addr1;
	}
	@XmlElement(name="addr1")
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}
	@XmlElement(name="addr2")
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getCity() {
		return city;
	}
	@XmlElement(name="city")
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}
	@XmlElement(name="state")
	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}
	@XmlElement(name="zip")
	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getEmail() {
		return email;
	}
	@XmlElement(name="email")
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}
	@XmlElement(name="phone")
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCardbin() {
		return cardbin;
	}
	@XmlElement(name="cardbin")
	public void setCardbin(String cardbin) {
		this.cardbin = cardbin;
	}

	public String getStreet1() {
		return street1;
	}
	@XmlElement(name="street1")
	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}
	@XmlElement(name="street2")
	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public int getPromoCodeUseCount() {
		return promoCodeUseCount;
	}
	@XmlElement(name="promoCodeUseCount")
	public void setPromoCodeUseCount(int promoCodeUseCount) {
		this.promoCodeUseCount = promoCodeUseCount;
	}
}
