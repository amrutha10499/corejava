package com.xworkz.Inheritence.dto;

public class Institute {
	
	public String IName="XWORKZ";
	public String ILoc="RAJAJINAGARA";
	public String IDirector="OMKAR";
	public byte InoofLecturers=5;
	public byte InoofStudents=100;
	
	
	public Institute() {
		
	}
	
	public String Use(String Institute) {
		 return Institute;
	 }
	
	public byte NoofCourse(byte NoofCourse) {
		return NoofCourse;
	}
	
	public String Address(String Address) {
		return Address;
	}
	public byte NoofClass(byte NoofClass) {
		return NoofClass;
	}

    public short StartedYear(short StartedYear) {
    	return StartedYear;
    }
	
	
}
 