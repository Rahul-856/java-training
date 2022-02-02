package day4inheritence;

public class Business
{
	public static void displayFeatures(Vehicle vehicle) {
		if (vehicle instanceof Car) {
			((Car) vehicle).CarFeatures();
		} else if (vehicle instanceof Truck) {
			((Truck) vehicle).truckFeatures();
		} else if (vehicle instanceof Bike) {
			((Bike) vehicle).BikeFeatures();
		}
	}

}
