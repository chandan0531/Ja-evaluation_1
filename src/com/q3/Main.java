package com.q3;

public class Main {
	
	public static void main(String[] args) {
		Car d1 = new Car();
		
		d1.model = "Harrier";
		d1.companyName = "TATA";
		d1.color = "Black";
		
		Engine e1 = new Engine();
		e1.rmp = 1000;
		e1.power = 110;
		e1.manufacturer = "tata";
		e1.enableTurbo(true);
		
		
//		d1.engine =new Engine();
		
//		d1.engine.rmp = 1000;
//		d1.engine.power = 110;
//		d1.engine.manufacturer = "tata";
//		d1.engine.enableTurbo(true);
		
		System.out.println("Car Model : " + d1.model);
		System.out.println("Car companyName : " + d1.companyName);
		System.out.println("Car color : " + d1.color);
		System.out.println("Car RMP : " + e1.rmp);
		System.out.println("Car Power : " + e1.power);
		System.out.println("Car manufacturer : " + e1.manufacturer);
		System.out.println("Car Has Turbo : " + e1.hasTurbo);
	}

}
