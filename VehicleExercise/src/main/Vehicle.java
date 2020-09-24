package main;

public class Vehicle {
	private int noOfWheels;
	private String colour;
	private String name;
	private final int vehicleID;
	private static int numberOfCars = 0;
	
	public Vehicle(int noOfWheels, String colour, String name) {
		super();
		this.vehicleID = numberOfCars;
		this.noOfWheels = noOfWheels;
		this.colour = colour;
		this.name = name;
		numberOfCars++;
	}

	public void remove() {
		
	}
	
	public void bill() {
		
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public int getVehicleID() {
		return vehicleID;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
