package main;

import java.util.Scanner;

public class Moped extends Vehicle{
	
	boolean motorwayLegal = false;
	
	
	@Override
	public double bill(){
		double result = 0;
		if (motorwayLegal == true) {
			result = 10 * this.getNoOfWheels();
		}
		else {
			result = 20 * this.getNoOfWheels();
		}
		return result;
	}
	
	public boolean isMotorwayLegal() {
		return motorwayLegal;
	}

	public void setMotorwayLegal(boolean motorwayLegal) {
		this.motorwayLegal = motorwayLegal;
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
		System.out.println("Is it motorway legal? Enter Y/N");
		String legal = input.next();
		if (legal.equalsIgnoreCase("Y")){
			this.setMotorwayLegal(true);
			complete = true;
		}
		else if (legal.equalsIgnoreCase("N")) {
			this.setMotorwayLegal(false);
			complete = true;
		}
		else {
			System.out.println("Incorrect value, try again");
		}
		}
	}
	

	public Moped(String colour, String name, boolean isMotorwayLegal) {
		super(2, colour, name);
		this.motorwayLegal = isMotorwayLegal;

	}
	
	public Moped() {
		this("default colour","default name",false);
	}

}
