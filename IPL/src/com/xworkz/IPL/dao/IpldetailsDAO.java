package com.xworkz.IPL.dao;

import com.xworkz.IPL.dto.IpldetailsDTO;



public class IpldetailsDAO {
	IpldetailsDTO[] dtos=new IpldetailsDTO [5];
	int index=0;
	public void add(IpldetailsDTO name) {
		if(index<dtos.length) {
			dtos[index]=name;
			index++;
		}
	}
	public void printAll() {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
			System.out.println(dtos[index].toString());
			}
		}
	}
	
	public IpldetailsDTO getbyteamName(String teamName ){
		for (int index = 0; index < dtos.length; index++) {
			if(teamName.equals(dtos[index].getTeamName())){
				return dtos[index];
			}
			
		}
		return null;
	}
	
	public IpldetailsDTO getbyExperience(String Experience ){
		for (int index = 0; index < dtos.length; index++) {
			if(Experience.equals(dtos[index].getCaptain().getExperience())){
				return dtos[index];
			}
			
		}
		return null;
	}
	
	
	public IpldetailsDTO updateteamNamebyOwner(String owner,String teamName){
		IpldetailsDTO ipldetailsDTO=null;
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(owner.equals(dtos[index].getOwner())){
					dtos[index].setTeamName(teamName);
					ipldetailsDTO=dtos[index];
				}									
			}
		}
	return ipldetailsDTO;
		}
	
	public IpldetailsDTO updatenoOfPlayersbyViseCaptain(byte noOfPlayers ,String viseCaptain ){
		IpldetailsDTO ipldetailsDTO1=null;
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(viseCaptain.equals(dtos[index].getViseCaptain())){
					dtos[index].setNoOfPlayers(noOfPlayers);
					ipldetailsDTO1=dtos[index];
				}									
			}
		}
	return ipldetailsDTO1;
		}
	
	
	public IpldetailsDTO deletebycaptain(String Visecaptain) {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
			if(Visecaptain.equals(dtos[index].getViseCaptain())) {
				dtos[index]=null;
			}
		
			}
		}
		return dtos[index];
	}
	
	public IpldetailsDTO deletebyowner(String owner) {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
			if(owner.equals(dtos[index].getOwner())) {
				dtos[index]=null;
			}
		
			}
		}
		return dtos[index];
	}
	

	
}



