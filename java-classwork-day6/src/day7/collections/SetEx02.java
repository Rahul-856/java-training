package day7.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetEx02 {
public static void main(String[] args) {
	Set<String> set= new TreeSet<String>();
	set.add("rahul");
	set.add("devansh");
	set.add("Ketan");
	set.add("Akash");
	set.add("rahul");
	set.add("devansh");
	set.add("Ketan");
	set.add("Akash");
	
  System.out.println(set);
}
}
