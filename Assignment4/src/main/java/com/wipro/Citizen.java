package com.wipro;

public class Citizen {

	private int id;
	private String name;
	private String address;
	private double totalIncome;
	private double taxToPay;
	
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Citizen(int id, String name, String address, double totalIncome, double taxToPay) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.totalIncome = totalIncome;
		this.taxToPay = taxToPay;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getTotalIncome() {
		return totalIncome;
	}

	public void setTotalIncome(double totalIncome) {
		this.totalIncome = totalIncome;
	}

	public double getTaxToPay() {
		return taxToPay;
	}

	public void setTaxToPay(double taxToPay) {
		this.taxToPay = taxToPay;
	}

	@Override
	public String toString() {
		return "Citizen [id=" + id + ", name=" + name + ", address=" + address + ", totalIncome=" + totalIncome
				+ ", taxToPay=" + taxToPay + "]";
	}
}
