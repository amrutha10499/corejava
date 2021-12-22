package com.xworkz.Inheritence;
import com.xworkz.Inheritence.dto.Metro;

public class TestTrainMetro {
	public static void main(String[] args) {
		
	        Metro passenger = new Metro();
			System.out.println(passenger.voltage);
			System.out.println(passenger.noofCompartment);
			System.out.println(passenger.peopleCapacity);
			System.out.println(passenger.color);
			System.out.println(passenger.sensor);
			System.out.println(passenger.name);
			System.out.println(passenger.runBy);
			System.out.println(passenger.lengthinKM);
			System.out.println(passenger.purpose);
			
			
			String metro1 = passenger.name("Namma-Metro");
			System.out.println( "name of the metro"+"\t" +metro1);
			
			String metro2 = passenger.carry("CarryPassengers");
			System.out.println("metro will "+metro2);
			
			long metro3 = passenger.price(6000000000l);
			System.out.println("price of metro"+"\t"+metro3);
			
			boolean metro4 =passenger.sound(false);
			System.out.println("metro make sound" +metro4);
			
		}
}
