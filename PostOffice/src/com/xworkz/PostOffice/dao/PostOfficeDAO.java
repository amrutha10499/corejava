package com.xworkz.PostOffice.dao;

import com.xworkz.PostOffice.dto.PostOfficeDTO;


public class PostOfficeDAO {
	
	
	PostOfficeDTO[] dtos=new PostOfficeDTO[5];
		int index=0;
		public void add(PostOfficeDTO name) {
			if(index<dtos.length) {
				dtos[index]=name;
				index++;
			}
		}
		
		public PostOfficeDTO updatenoOfEmployeesbyManager(byte noOfEmployees,String Manager) {
			PostOfficeDTO postOfficeDTO=null;
			for(int index=0;index<dtos.length;index++) {
				if(dtos[index]!=null) {
					if(Manager.equals(dtos[index].getManager())){
						dtos[index].setNoOfEmployees(noOfEmployees);
						postOfficeDTO=dtos[index];
					}									
				}
			}
		return postOfficeDTO;
			}
		
		
		public PostOfficeDTO updateaddressbyPostMaster(String address,String PostMaster) {
			PostOfficeDTO postOfficeDTO=null;
			for(int index=0;index<dtos.length;index++) {
				if(dtos[index]!=null) {
					if(PostMaster.equals(dtos[index].getPostMaster())){
						dtos[index].setAddress(address);;
						postOfficeDTO=dtos[index];
					}									
				}
			}
		return postOfficeDTO;
			}
		
		
		public PostOfficeDTO getbyBranchCode(String BranchCode){
			for (int index = 0; index < dtos.length; index++) {
				if(BranchCode.equals(dtos[index].getBranch().getBranchCode())){
					return dtos[index];
				}
				
			}
			return null;
		}
		
		public PostOfficeDTO getbyManager(String Manager){
			for (int index = 0; index < dtos.length; index++) {
				if(Manager.equals(dtos[index].getManager())){
					return dtos[index];
				}
				
			}
			return null;
		}
		
		
		public PostOfficeDTO deletebyaddress(String address) {
			for(int index=0;index<dtos.length;index++) {
				if(dtos[index]!=null) {
				if(address.equals(dtos[index].getAddress())){
					dtos[index]=null;
				}
			
				}
			}
			return dtos[index];
		}
		
		public PostOfficeDTO deletebyPostMaster(String PostMaster) {
			for(int index=0;index<dtos.length;index++) {
				if(dtos[index]!=null) {
				if(PostMaster.equals(dtos[index].getPostMaster())){
					dtos[index]=null;
				}
			
				}
			}
			return dtos[index];
		}
		

		public void printAll() {
			for(int index=0;index<dtos.length;index++) {
				if(dtos[index]!=null) {
				System.out.println(dtos[index].toString());
				}
			}
		}
		
		

	}






