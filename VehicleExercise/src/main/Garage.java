package main;
import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	private List<Vehicle> vehiclesInGarage = new ArrayList<>();	
	
	public void addVehicle(Vehicle vehicle) { 
		
		this.vehiclesInGarage.add(vehicle);
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
		for (Vehicle vehicle: this.vehiclesInGarage) {
			
			if (vehicle.getClass().getSimpleName().equalsIgnoreCase(type)) {
				
				toRemove.add(vehicle);
			}
		}
		this.vehiclesInGarage.removeAll(toRemove);
	}
			
	public void removeVehiclesByID(int ID) {	
		
		for (int i = 0; i< this.vehiclesInGarage.size();i++) {
			
			Vehicle a = this.vehiclesInGarage.get(i);
			
			if (a.getVehicleID()==(ID)){
				
				this.vehiclesInGarage.remove(a);
			}
		}
	}
		
					
	
	public void calculateBill() {
		
		for (Vehicle a:this.vehiclesInGarage) {
			
			a.bill();
		}
	}
	
	public Garage() {
		
		this.vehiclesInGarage = new ArrayList<>();
	}

}
