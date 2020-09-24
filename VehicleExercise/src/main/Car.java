package main;

public class Car extends Vehicle {
	private int noOfDoors = 0;
	
	
	@Override
	public void bill(){
		System.out.println("The maintenance cost for this Car is: £"+ 120 * noOfDoors);
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
