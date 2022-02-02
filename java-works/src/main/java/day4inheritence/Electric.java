package day4inheritence;

public class Electric extends Car
{
	public Electric() {
		System.out.println("Electric is a type of car ");
		System.out.println();
	}

	@Override
	public void CarFeatures() {
		System.out.println("Electric saves a lot of money !");
	}

}
