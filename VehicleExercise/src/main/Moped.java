package main;

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
	

	public Moped(String colour, String name, boolean isMotorwayLegal) {
		super(2, colour, name);
		this.motorwayLegal = isMotorwayLegal;

	}
	
	public Moped() {
		this("default colour","default name",false);
	}

}
