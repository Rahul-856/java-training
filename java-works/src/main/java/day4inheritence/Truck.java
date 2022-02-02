package day4inheritence;

public class Truck extends Vehicle {
	public Truck() {
		System.out.println("Truck is called");
	}

	public void truckFeatures() {
		System.out.println("Truck is heavy duty veichle");
	}
	
	@Override
	public void move() {
		System.out.println("Trucks are Big");
	}

}
