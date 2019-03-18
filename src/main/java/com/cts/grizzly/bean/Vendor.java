package com.cts.grizzly.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Vendor")
public class Vendor {
	@Id
	private String id;	
	private String name;
	private String location;
	private String contact;
	
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Vendor [id=" + id + ", name=" + name + ", location=" + location + ", contact=" + contact + "]";
	}
	
	
}
