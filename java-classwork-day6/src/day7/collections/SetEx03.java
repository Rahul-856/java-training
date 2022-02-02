package day7.collections;

import java.util.HashSet;
import java.util.Set;

public class SetEx03 {
public static void main(String[] args) {
	Set<Laptop> laptops=new HashSet<Laptop>();
	
	laptops.add(new Laptop(101,"Apple mackbook pro",20000.0));
	laptops.add(new Laptop(102,"Dell",10000.0));
	
	for(Laptop temp: laptops) {
		System.out.println(temp+ ",Stored @ "+temp.hashCode());
	}
}
}
