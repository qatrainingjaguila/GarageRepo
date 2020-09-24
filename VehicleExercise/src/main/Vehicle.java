package main;

public abstract class Vehicle { //abstract class so Vehicles cannot be instantiated
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

	
	abstract public void bill(); // using abstract methods which must be overridden in subclasses

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
