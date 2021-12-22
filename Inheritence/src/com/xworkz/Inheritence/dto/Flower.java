package com.xworkz.Inheritence.dto;

public class Flower {
	public String Fname="Lotus";
	public String Fcolor="pink,white";
	public String Ftype="unisexual,bisexual";
	public byte Fheightincm=7;
	public byte Fweightingms=35;
	
	public Flower() {
		
	 }
	 public String pollination(String pollination) {
		 return pollination;
	 }
	 
	 public String fertilization(String  fertilization) {
		 return  fertilization;
	 }
	 public String fragrance(String fragrance) {
		 return fragrance;
	 }
	 public String use(String use  ) {
		 return use;
	 }
	 
     public boolean isitproducefruit(boolean isitproducefruit) {
	     return isitproducefruit;
     }

}
