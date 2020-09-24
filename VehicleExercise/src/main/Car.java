package main;

public class Car extends Vehicle {
	private int noOfDoors = 0;
	
	
	@Override
	public double bill(){
		double result = 120 * noOfDoors;
		return result;
	}
	
	public Car(String colour, String name, int doors) {
		super(4, colour, name);
		this.noOfDoors = doors;
		
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

}
