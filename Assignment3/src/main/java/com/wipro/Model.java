package com.wipro;


public class Model {
    private int ID;
    private String name;
    private String address;
    private double yearsOfExperience;
    private double wages;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(double yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public double getWages() {
		return wages;
	}
	public Model(int iD, String name, String address, double yearsOfExperience, double wages) {
		super();
		ID = iD;
		this.name = name;
		this.address = address;
		this.yearsOfExperience = yearsOfExperience;
		this.wages = wages;
	}
	public void setWages(double wages) {
		this.wages = wages;
	}
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Model [ID=" + ID + ", name=" + name + ", address=" + address + ", yearsOfExperience="
				+ yearsOfExperience + ", wages=" + wages + "]";
	}
    
	
}