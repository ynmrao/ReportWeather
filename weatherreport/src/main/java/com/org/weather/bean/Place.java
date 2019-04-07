package com.org.weather.bean;

public class Place {
	public String name;
	public String coardinates;
	public int id;
	
	
		
	
	public Place() {
		super();
		this.name = name;
		this.coardinates = coardinates;
		this.id = id;
	}
	
	public Place(String name, String coardinates, int id) {
		super();
		this.name = name;
		this.coardinates = coardinates;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoardinates() {
		return coardinates;
	}
	public void setCoardinates(String coardinates) {
		this.coardinates = coardinates;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	

}
