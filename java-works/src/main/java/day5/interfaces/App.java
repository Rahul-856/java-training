package day5.interfaces;

public class App 
{
	public static void main(String[] args) {
		IVechile vehicles[]=new IVechile[3];
		vehicles[0]=new Car();
		vehicles[1]=new Lorry();
		vehicles[2]=new Car();
		
		for(IVechile v : vehicles) {
			v.move();
		}
	}
}
