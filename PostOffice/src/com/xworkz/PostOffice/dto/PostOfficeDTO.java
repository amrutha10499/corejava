package com.xworkz.PostOffice.dto;

public class PostOfficeDTO {
	private String Manager;
	private String PostMaster;
	private byte noOfEmployees;
	private String address;
	private BranchDTO branch;
	
	public String getManager() {
		return Manager;
	}
	public void setManager(String manager) {
		Manager = manager;
	}
	public String getPostMaster() {
		return PostMaster;
	}
	public void setPostMaster(String postMaster) {
		PostMaster = postMaster;
	}
	public byte getNoOfEmployees() {
		return noOfEmployees;
	}
	public void setNoOfEmployees(byte noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public BranchDTO getBranch() {
		return branch;
	}
	public void setBranch(BranchDTO branch) {
		this.branch = branch;
	}
	
	public String toString() {
		return "PostOfficeDTO [Manager=" + Manager + ", PostMaster=" + PostMaster + ", noOfEmployees=" + noOfEmployees
				+ ", address=" + address + ", branch=" + branch + "]";
	}
	
	
	

}
