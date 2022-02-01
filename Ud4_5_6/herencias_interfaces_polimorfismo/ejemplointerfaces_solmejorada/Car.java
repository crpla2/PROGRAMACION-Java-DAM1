package ejemplointerfaces_solmejorada;

public class Car implements Vehicle {
	private String license;;
	private String description;
	
	public Car(String license, String description) {
		this.license = license;
		this.description = description;
	}

	public Double move (Integer km) {
		System.out.println("Moving vehicle: " + this.toString());
		return Math.random() * km;
	}
	
	@Override
	public String toString() {
		return "Car [license=" + license + 
				", description=" + description + "]";
	}
}
