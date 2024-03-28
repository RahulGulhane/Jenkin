package com.BikkadIT.RollBackTrans.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

	@Id
	private int addrId;

	private String area;

	private String city;

	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", area=" + area + ", city=" + city + "]";
	}

}