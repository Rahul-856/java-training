package day4inheritence;

public class Bike extends Vehicle{
	public Bike() {
		System.out.println("Bike is called");
	}

	public void BikeFeatures() {
		System.out.println("Bike runs on two wheels!");
	}

	@Override
	public void move() {
		System.out.println("Bike is Superfast while moving on 2 wheels");
	}

}
