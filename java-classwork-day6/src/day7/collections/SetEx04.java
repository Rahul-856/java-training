package day7.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class LaptopSorter{ 
	static Comparator<Laptop> sortByNameAsc =new Comparator<Laptop>()
			{
		public int compare(Laptop o1,Laptop o2) {
			return o1.getLaptopName().compareTo(o2.getLaptopName());
		}
			};
}

public class SetEx04 {
public static void main(String[] args) {
	Set<Laptop> laptops=new TreeSet<Laptop>();
	
    laptops.add(new Laptop(101,"Apple mackbook pro",20000.0));
	laptops.add(new Laptop(102,"Dell",10000.0));
	laptops.add(new Laptop(103,"HP",15000.0));
	
	for(Laptop temp: laptops) {
		System.out.println(temp+ ",Stored @ "+temp.hashCode());
	}
	Set<Laptop> laptops1=new TreeSet<Laptop>(LaptopSorter.sortByNameAsc);
	 laptops.add(new Laptop(101,"Apple mackbook pro",20000.0));
		laptops.add(new Laptop(102,"Dell",10000.0));
		laptops.add(new Laptop(103,"HP",15000.0));
		
		System.out.println("---Ascending Order ------");
		for(Laptop temp:laptops1) {
			System.out.println(temp+" Stored @ "+temp.hashCode());
		}
}
}
