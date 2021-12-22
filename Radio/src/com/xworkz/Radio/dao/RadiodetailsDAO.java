package com.xworkz.Radio.dao;

import com.xworkz.Radio.dto.RadiodetailsDTO;

public class RadiodetailsDAO {
	
	RadiodetailsDTO[] dtos=new RadiodetailsDTO [5];
	int index=0;
	public void add(RadiodetailsDTO name) {
		if(index<dtos.length) {
			dtos[index]=name;
			index++;
		}
	}
	
	
	
	
	public void printAll() {
		for(int index=0;index<dtos.length;index++) {
			System.out.println(dtos[index]);
		}
	}
	
	public RadiodetailsDTO updatePricebyColor(int Price,String color) {
		RadiodetailsDTO radiodetailsDTO=null;
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(color==(dtos[index].getColor())){
					dtos[index].setPrice(Price);
					radiodetailsDTO=dtos[index];
				}									
			}
		}
	return radiodetailsDTO;
		}

	public RadiodetailsDTO updatePricebynoOfRS(int Price,byte noOfRS) {
		RadiodetailsDTO radiodetailsDTO=null;
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(noOfRS==(dtos[index].getNoOfRS())){
					dtos[index].setPrice(Price);
					radiodetailsDTO=dtos[index];
				}									
			}
		}
	return radiodetailsDTO;
		}
 

	public RadiodetailsDTO updateCompanybycolor(String Company,String color) {
		RadiodetailsDTO radiodetailsDTO=null;
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(color==(dtos[index].getColor())) {
					dtos[index].setCompany("Ajanta ellore");
					radiodetailsDTO=dtos[index];
				}									
			}
		}
	return radiodetailsDTO;
		}
	
	public RadiodetailsDTO getbyWidth(double width){
		for (int index = 0; index < dtos.length; index++) {
			if(width==dtos[index].getSize().getWidth()) {
				return dtos[index];
			}
			
		}
		return null;
	}
	
	public RadiodetailsDTO getbyPrice(int price){
		for (int index = 0; index < dtos.length; index++) {
			if(price==dtos[index].getPrice()){
				return dtos[index];
			}
			
		}
		return null;
	}
	
	public RadiodetailsDTO getbyColor(String color){
		for (int index = 0; index < dtos.length; index++) {
			if(color==dtos[index].getColor()){
				return dtos[index];
			}
			
		}
		return null;
	}
	
	
	
	
	
	
	public RadiodetailsDTO deletebyCompany(String company) {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
			if(company.equals(dtos[index].getCompany())) {
				dtos[index]=null;
			}
		
			}
		}
		return dtos[index];
	}
	
	public RadiodetailsDTO deletebyColor(String color) {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
			if(color.equals(dtos[index].getColor())) {
				dtos[index]=null;
			}
		
			}
		}
		return dtos[index];
	}
	
	public RadiodetailsDTO deletebyHeight(float height ) {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
			if(height==(dtos[index].getSize().getHeight())) {
				dtos[index]=null;
			}
		
			}
		}
		return dtos[index];
	}
	
  }



