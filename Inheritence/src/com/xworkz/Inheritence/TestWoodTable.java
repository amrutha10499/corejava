package com.xworkz.Inheritence;

import com.xworkz.Inheritence.dto.Table;

public class TestWoodTable {
	
		public static void main(String[] args) {
			
			Table table = new Table();
			System.out.println(table.noOfLegs);
			System.out.println(table.length);
			System.out.println(table.width);
			System.out.println(table.price);
			System.out.println(table.color);
			
			String tab1 =table.toSit("sitting");
			System.out.println("tabel is used for"+tab1);
			
			String tab2 =table.asDainingTable("daining tabel");
			System.out.println("tabel is used as"+tab2);
			
			String tab3 =table.readORwrite("for read or write");
			System.out.println("tabel can be used"+tab3);
			
			String tab4 =table.toKeepThings("keeping things");
			System.out.println("tabel is used to"+tab4);
			
			byte tab5 = table.noofdraws((byte)4);
			System.out.println("noofdraws in tabel"+tab5);
			
			System.out.println(table.nameOfWood);
			System.out.println(table.habitat);
			System.out.println(table.heightinmeter);
			System.out.println(table.circumference);
			System.out.println(table.weight);
			
			String wood1 =table.breeze("breezing");
			System.out.println("wood helps in"+wood1);
			
			String wood2 =table.shelter("shelter");
			System.out.println("wood can be used for"+wood2);
			
			String wood3 =table.charwood("charwood");
			System.out.println("wood used to made"+wood3);
			
			float wood4 =table.grow(12.56f);
			System.out.println("wood can grow upto"+wood4);
			
			String wood5=table.causesRain("rain");
			System.out.println("wood causes "+wood5);
		}

		

}
