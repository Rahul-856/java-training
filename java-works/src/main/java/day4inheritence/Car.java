package day4inheritence;

public class Car extends Vehicle
{
	public Car() {
		System.out.println("Car is Called");
	}

	public void CarFeatures() {
		System.out.println("Car run on 4 wheels!");
	}

	@Override
	public void move() {
		System.out.println("Cars move very comfortably ");
	}
}
