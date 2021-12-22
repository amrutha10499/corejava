package com.xworkz.PostOffice.dto;

public class BranchDTO {
	private String BranchCode;
	private String Address;
	private String State;
	
	public String getBranchCode() {
		return BranchCode;
	}
	public void setBranchCode(String branchCode) {
		BranchCode = branchCode;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	public String toString() {
		return "BranchDTO [BranchCode=" + BranchCode + ", Address=" + Address + ", State=" + State + "]";
	}
 	
	

}
