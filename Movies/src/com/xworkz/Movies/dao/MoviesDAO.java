package com.xworkz.Movies.dao;

import com.xworkz.Movies.dto.MoviesDTO;



public class MoviesDAO {

	MoviesDTO[] dtos=new MoviesDTO[5];
		int index=0;
		public void add(MoviesDTO name) {
			if(index<dtos.length) {
				dtos[index]=name;
				index++;
			}
		}
		
		public MoviesDTO updateLanguagebyJoner(String Language,String joner) {
			MoviesDTO  moviesDTO =null;
			for(int index=0;index<dtos.length;index++) {
				if(dtos[index]!=null) {
					if(joner==(dtos[index].getJoner())) {
						dtos[index].setLanguage(Language);;
						moviesDTO =dtos[index];
					}									
				}
			}
		return moviesDTO;
			}
		
		public MoviesDTO updateDurationbyJoner(float Duration,String joner) {
			MoviesDTO  moviesDTO =null;
			for(int index=0;index<dtos.length;index++) {
				if(dtos[index]!=null) {
					if(joner==(dtos[index].getJoner())) {
						dtos[index].setDuration(Duration);;
						moviesDTO =dtos[index];
					}									
				}
			}
		return moviesDTO;
			}
		
		
		public MoviesDTO getbyLanguage(String Language){
			for (int index = 0; index < dtos.length; index++) {
				if(Language.equals(dtos[index].getLanguage())){
					return dtos[index];
				}
				
			}
			return null;
		}
		public MoviesDTO getbyMovieName(String MovieName){
			for (int index = 0; index < dtos.length; index++) {
				if(MovieName.equals(dtos[index].getFilm().getMovieName())){
					return dtos[index];
				}
				
			}
			return null;
		}
		
		public MoviesDTO deletebylanguage(String address) {
			for(int index=0;index<dtos.length;index++) {
				if(dtos[index]!=null) {
				if(address.equals(dtos[index].getLanguage())){
					dtos[index]=null;
				}
			
				}
			}
			return dtos[index];
		}
		
		
		public MoviesDTO deletebyJoner(String Joner) {
			for(int index=0;index<dtos.length;index++) {
				if(dtos[index]!=null) {
				if(Joner.equals(dtos[index].getJoner())){
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
