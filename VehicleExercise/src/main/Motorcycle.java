package main;

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
	
	public Motorcycle(String colour, String name, boolean hasTopBox) {
		super(2, colour, name);
		this.hasTopBox= hasTopBox;
		
	}
	
	public Motorcycle() {
		this("default colour","default Motorbike Name",false);
	}

}
