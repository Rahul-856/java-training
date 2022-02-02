package day4inheritence;

public class Suv extends Car{
	public Suv() {
		System.out.println("SUV is a type of car ");
	}

	@Override
	public void CarFeatures() {
		System.out.println("SUV have a lot of space !");
	}


}
