package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class runner {
	
	public static Scanner input;
	
	public static void removeVehicleByType(Garage newGarage) {
		System.out.println("Please enter a Vehicle type(Car, Motorcycle or Moped)");
		String vehicleType = scanHere();
		
		newGarage.removeVehicleByType(vehicleType);
		
	}
	
	public static void outputAllVehicles(Garage newGarage) {
		
		List<Vehicle> vehiclesInGarage = newGarage.getVehiclesInGarage();	
		for (Vehicle vehicle: vehiclesInGarage) {
			System.out.print("ID no: " + vehicle.getVehicleID()+ " - ");
			System.out.print("A "+ vehicle.getColour() + " " + vehicle.getClass().getSimpleName()+", named ");
			System.out.println(vehicle.getName());
		}
	}

	public static void removeVehicleByID(Garage newGarage) {
		System.out.println("Enter the ID you want to remove");
		int id = Integer.parseInt(scanHere());
		newGarage.removeVehiclesByID(id);
	}
	
	public static void addVehicle(Garage newGarage) {
		
		System.out.println("Please enter a Vehicle type(Car, Motorcycle or Moped)");
		String vehicleType = scanHere();
		
		Vehicle vehicle = null;
		
		if (vehicleType.equals("Car")){
			vehicle = new Car();
			vehicle.create(input);
		}
		else if (vehicleType.equals("Motorcycle")){
			vehicle = new Motorcycle();
			vehicle.create(input);
		}
		else if (vehicleType.equals("Moped")) {
			vehicle = new Moped();
			vehicle.create(input);
		}
		
		newGarage.addVehicle(vehicle);
		

		}
	
	
	public static String scanHere() {
		String result = input.next();
		return result;
	}
	
	public static void main(String[] args) {
		
		  Vehicle car1 = new Car("Red","La Ferrari",2); 
		  
		  Vehicle motorbike1 = new Motorcycle("Yellow","Dad's bike",false); 
		  
		  Vehicle moped1 = new Moped("Cream","Vespa",false);
		  
		  Garage newGarage = new Garage(); 
		  newGarage.addVehicle(car1);
		  
		  newGarage.addVehicle(motorbike1); 
		  
		  newGarage.addVehicle(moped1);
		  

		  
		  input = new Scanner(System.in);
		  
		  int choice = 0;
			
			while(choice != 5) {
				System.out.println("\rWelcome to the menu \rPlease select a "
						+ "choice \r1.Create Vehicle\r2.Output all Vehicles\r"
						+ "3.Remove Vehicle by ID\r4.Remove Vehicle by Type\r5.Exit");
				choice = Integer.parseInt(scanHere());
				switch(choice) {
				case 1: addVehicle(newGarage);
						break;
				case 2: outputAllVehicles(newGarage);
						break;
				case 3: removeVehicleByID(newGarage);
						break;
				case 4: removeVehicleByType(newGarage);
						break;
				case 5: System.out.println("Exiting");
						break;
					
				}
		 
		
		//.getClass().getSimpleName()
		
	}input.close();
	System.out.println("Done");

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