package main;

import java.util.Scanner;

public class Car extends Vehicle {
	private int noOfDoors = 0;
	
	
	@Override
	public double bill(){
		double result = 120 * noOfDoors;
		return result;
	}
	
	@Override
	public void create(Scanner input) {
		System.out.println("Please enter a name");
		String name = input.next();
		this.setName(name);
		
		System.out.println("Please enter a colour");
		String colour = input.next();
		this.setColour(colour);
		
		System.out.println("Please enter number of Doors");
		int noOfDoors = Integer.parseInt(input.next());
		this.setNoOfDoors(noOfDoors);
	}
	
	public Car(String colour, String name, int doors) {
		super(4, colour, name);
		this.noOfDoors = doors;
		
	}
	
	public Car() {
		this("default colour","default Car name",0);
	}


	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

}
