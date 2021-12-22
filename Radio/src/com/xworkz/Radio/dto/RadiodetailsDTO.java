package com.xworkz.Radio.dto;

public class RadiodetailsDTO {
	private String Company;
	private int Price;
	private String color;
    private byte noOfRS;
	private SizeDTO size;
	
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public SizeDTO getSize() {
		return size;
	}
	public void setSize(SizeDTO size) {
		this.size = size;
	}
	public byte getNoOfRS() {
		return noOfRS;
	}
	public void setNoOfRS(byte noOfRS) {
		this.noOfRS = noOfRS;
	}
	
	public String toString() {
		return "RadiodetailsDTO [Company=" + Company + ", Price=" + Price + ", color=" + color + ", noOfRS=" + noOfRS
				+ ", size=" + size + "]";
	}
	
	
	
	}
	
