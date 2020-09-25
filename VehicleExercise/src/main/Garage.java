package main;
import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	private List<Vehicle> vehiclesInGarage = new ArrayList<>();	
	
	public void addVehicle(Vehicle vehicle) { 
		
		
		this.getVehiclesInGarage().add(vehicle);
	}
	
	public void removeVehicleByType(String type) {	
		
		List<Vehicle> toRemove = new ArrayList<>();	
		
		/*for (int i = 0; i< this.vehiclesInGarage.size();i++) {
			Vehicle a = this.vehiclesInGarage.get(i);
			if (type.equals("Car")) {
				if (a instanceof Car) {
					this.vehiclesInGarage.remove(a);
				}
			}
			else if (type.equals("Motorcycle")) {
				if (a instanceof Motorcycle) {
					this.vehiclesInGarage.remove(a);
				
			}
			}
			else if (type.equals("Moped")){
				if (a instanceof Moped) {
					this.vehiclesInGarage.remove(a);
			}
		}
		
	}*/
		for (Vehicle vehicle: this.getVehiclesInGarage()) {
			
			if (vehicle.getClass().getSimpleName().equalsIgnoreCase(type)) {
				
				toRemove.add(vehicle);
			}
		}
		this.getVehiclesInGarage().removeAll(toRemove);
	}
			
	public void removeVehiclesByID(int ID) {	
		
		for (int i = 0; i< this.getVehiclesInGarage().size();i++) {
			
			Vehicle a = this.getVehiclesInGarage().get(i);
			
			if (a.getVehicleID()==(ID)){
				
				this.getVehiclesInGarage().remove(a);
			}
		}
	}
		
					
	
	public double calculateBill() {
		
		double total = 0;
		
		for (Vehicle a:this.getVehiclesInGarage()) {
			
			total = total + a.bill();
		}
		System.out.println("Your total is " + total);
		return total;
	}
	
	public Garage() {
		
		this.vehiclesInGarage = new ArrayList<>();
	}

	public List<Vehicle> getVehiclesInGarage() {
		return vehiclesInGarage;
	}

}
