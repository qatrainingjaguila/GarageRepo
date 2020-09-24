package main;

public class runner {

	public static void main(String[] args) {
		Vehicle car1 = new Car("Red","Ferrari",2);
		Vehicle motorbike1 = new Motorcycle("Yellow","Ducati",false);
		Vehicle moped1 = new Moped("Cream","Vespa",false);

		Garage newGarage = new Garage();
		newGarage.addVehicle(car1);
		newGarage.addVehicle(motorbike1);
		newGarage.addVehicle(moped1);
		
		newGarage.calculateBill();
		
		newGarage.removeVehicleByType("Moped");
		newGarage.removeVehiclesByID(0);
		
		System.out.println("\r");
		newGarage.calculateBill();
		
		//.getClass().getSimpleName()
		
	}

}

/*
 * Using Vehicle as a base class, create three derived classes (Car, Motorcycle
 * etc.), each derived class should have its own attributes in addition to the
 * normal Vehicle attributes.
 * 
 * 
 * 1. Using a List implementation, store all your vehicles in a Garage class.
 * 
 * 2. Create a method in Garage that iterates through each Vehicle, calculating
 * a bill for each type of Vehicle in a different way, depending on the type of
 * vehicle it is. You can decide how this bill is calculated based on any
 * attributes you see fit. (You do not get extra marks for making the
 * calculation overly complex)
 * 
 * Garage should have methods that: 1. add Vehicle 2. remove Vehicle(s) (By ID,
 * By Vehicle Type) 3. fix Vehicle (Calculate bill) 4. empty the garage.
 */