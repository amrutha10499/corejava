package com.xworkz.Inheritence;

import com.xworkz.Inheritence.dto.Lotus;


public class TestFlowerLotus {
	 public static void main(String []args) {
			
			Lotus lotus = new Lotus();
			
			System.out.println(lotus.color);
			System.out.println(lotus.noOfpetals);
			System.out.println(lotus.floatsonwater);
			System.out.println(lotus. kingdom);
			System.out.println(lotus.family);
			System.out.println(lotus. Fname);
			System.out.println(lotus.Fcolor);
			System.out.println(lotus.Ftype);
			System.out.println(lotus.Fheightincm);
			System.out.println(lotus.Fweightingms);
			
			
			System.out.println();
			String res=lotus.Lotususe("lotus-uses");
			System.out.println("lotus flowers are used to stop bleeding" +"\t"+res);
			
			String res1=lotus.altname("water lilies");
			System.out.println("lotus flowers are also called as water lilies" +"\t"+res1);
			
			String res2=lotus.Speciality("purity");
			System.out.println("speciality of lotus is its purity"+"\t"+res2);
			
			boolean res3 = lotus.aquaticplant(true);
			System.out.println("lotus is a aquatic flower"+"\t"+res3);
			
			String res4 =lotus.Season("season");
			System.out.println("lotus blossom in the month of june-july"+"\t"+res4);
			
			String res5 =lotus.pollination("pollengrains");
			System.out.println("pollen grains are produced by pollination in flowers"+"\t"+res5);
			
			String res6 =lotus.fertilization("fertilizaton");
			System.out.println("fertilizaton occurs in the ovary of female flowers" +res6);
			
			String res7 =lotus.fragrance("deodrants");
			System.out.println("most of the deodrants are done by the fragrance of flowers"+"\t"+res7);
			
			String res8 =lotus. use("decoration");
			System.out.println("flowers are used for decorative purposes"+"\t"+res8);
			
			boolean res9=lotus.isitproducefruit(true);
			System.out.println("fruits are developed from the parts of flowers "+"\t"+res9);
		}

	}




