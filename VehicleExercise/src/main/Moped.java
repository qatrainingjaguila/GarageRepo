package main;

public class Moped extends Vehicle{
	boolean motorwayLegal = false;
	
	public void bill(){
		if (motorwayLegal == true) {
			System.out.println("The maintenance cost for this Moped is: £10");
		}
		else {
			System.out.println("The maintenance cost for this Moped is: £20");
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
