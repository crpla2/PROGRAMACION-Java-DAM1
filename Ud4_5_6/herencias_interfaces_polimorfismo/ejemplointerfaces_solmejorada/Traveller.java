package ejemplointerfaces_solmejorada;

public class Traveller {
	private String name;
	private Vehicle vehicle;

	public Traveller(String name, Vehicle vehicle) {
		this.name = name;
		this.vehicle = vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Double move(Integer km) {
		System.out.println("Travelling " + km);
		Double cost = vehicle.move(km);
		return cost;
	}

}
