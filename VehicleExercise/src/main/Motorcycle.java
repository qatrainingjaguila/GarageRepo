package main;

import java.util.Scanner;

public class Motorcycle extends Vehicle {
	boolean hasTopBox;

	@Override
	public double bill(){
		double result = 0;
		if (hasTopBox == true) {
			result = 100 * this.getNoOfWheels();
		}
		else {
			result = 200 * this.getNoOfWheels();
		}return result;
	}
	
	@Override
	public void create(Scanner input) {
boolean complete = false;
		
		System.out.println("Please enter a name");
		String name = input.next();
		this.setName(name);
		
		System.out.println("Please enter a colour");
		String colour = input.next();
		this.setColour(colour);
		while (complete == false) {
		System.out.println("Does it have a top box? Enter Y/N");
		String legal = input.next();
		if (legal.equalsIgnoreCase("Y")){
			this.setHasTopBox(true);
			complete = true;
		}
		else if (legal.equalsIgnoreCase("N")) {
			this.setHasTopBox(false);
			complete = true;
		}
		else {
			System.out.println("Incorrect value, try again");
		}
		}
	}
	
	public boolean isHasTopBox() {
		return hasTopBox;
	}

	public void setHasTopBox(boolean hasTopBox) {
		this.hasTopBox = hasTopBox;
	}

	public Motorcycle(String colour, String name, boolean hasTopBox) {
		super(2, colour, name);
		this.hasTopBox= hasTopBox;
		
	}
	
	public Motorcycle() {
		this("default colour","default Motorbike Name",false);
	}

}
