package main;

public class Motorcycle extends Vehicle {
	boolean hasTopBox;

	@Override
	public void bill(){
		if (hasTopBox == true) {
			System.out.println("The maintenance cost for this Motorcycle is: £100");
		}
		else {
			System.out.println("The maintenance cost for this Motorcycle is: £200");
		}
	}
	
	public Motorcycle(String colour, String name, boolean hasTopBox) {
		super(2, colour, name);
		this.hasTopBox= hasTopBox;
		
	}
	
	public Motorcycle() {
		this("default colour","default Motorbike Name",false);
	}

}
