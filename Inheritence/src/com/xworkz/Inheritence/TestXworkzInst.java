package com.xworkz.Inheritence;

import com.xworkz.Inheritence.dto.Xworkz;

public class TestXworkzInst {
	
  public static void main(String []args) {
	  
	  Xworkz xworkz=new  Xworkz();
	  System.out.println(xworkz.IName);
	  System.out.println(xworkz.ILoc);
	  System.out.println(xworkz.IDirector);
	  System.out.println(xworkz.InoofLecturers);
	  System.out.println(xworkz.InoofStudents);
	  System.out.println(xworkz.NoofBranches);
	  System.out.println(xworkz.HOI);
	  System.out.println(xworkz.HR);
	  System.out.println(xworkz.Loc);
	  System.out.println(xworkz.NoofStudents);
	  
	  byte res1 = xworkz.Teachinghrs((byte)8);
		System.out.println("teaching hours for every xworkz is "+res1+"hours a day");
		
	  
	  byte res2=xworkz.Workingdays((byte)7);
	  System.out.println("working days for every xworkz is "+res2+"days a week");
		
	  String res3=xworkz.CoursesAvail("java,framworks,sql,bootstrap,html,css,js");
	  System.out.println("courses available in xworkz are"+res3);
	  
	  byte res4=xworkz.NoofFloors((byte)3);
	  System.out.println("NoofFloors in xworkz are"+res4);
	  
	  String res5=xworkz.Use("xworkz -institute is to train students");
	  System.out.println("xworkz"+res5);
	  
	  byte res6=xworkz. NoofCourse((byte)9);
	  System.out.println("xworkz has nearly 9 courses"+res6 );
	  
	  String res7=xworkz.Address("prakash nagar,rajajinagara,bangalore");
	  System.out.println("xworkz is in"+res7);
	  
	  byte res8=xworkz.NoofClass((byte)17);
	  System.out.println("there will be more than"+res8+"classes in xworkz");
	  
	  short res9=xworkz.StartedYear((short)2018);
	  System.out.println("xworkz started in the year"+res9);
	  
	  
	}
	
	}
		
		
