package day4inheritence;

import day4inheritence.Honda;
import day4inheritence.Tvs;
import day4inheritence.Electric;
import day4inheritence.Suv;
import day4inheritence.Mahindra;


public class App 
{
	public static void main(String[] args) {
		Vehicle vehicles[] = new Vehicle[8];

		vehicles[0] = new Car();
		vehicles[1] = new Electric();
		vehicles[2] = new Suv();
		vehicles[3] = new Bike();
		vehicles[4] = new Honda();
		vehicles[5] = new Tvs();
		vehicles[6] = new Truck();
		vehicles[7] = new Mahindra();

		
		for (Vehicle vh : vehicles) {
			vh.move();
			Business.displayFeatures(vh);
		}

	}
}
