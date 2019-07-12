
package com.hc.jee.PharmacieProject;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PharmacieInService {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	@Column(name="DATE_FROM")
	private String dateFrom;
	@Column(name="DATE_TO")
	private String dateTo;
	private String lieu;
	private String pharmacieName;
	private String adresse;
	private int phone;
	
	
	public PharmacieInService(int id, String dateFrom, String dateTo, String lieu, String pharmacieName, String adresse, int phone) {
		super();
		this.id = id;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.lieu = lieu;
		this.pharmacieName = pharmacieName;
		this.adresse = adresse;
		this.phone = phone;
	}
	
	
	public PharmacieInService() {
		super();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}
	public String getDateTo() {
		return dateTo;
	}
	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getPharmacieName() {
		return pharmacieName;
	}
	public void setPharmacieName(String pharmacieName) {
		this.pharmacieName = pharmacieName;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
	

}