package day7.collections;

import java.util.Set;
import java.util.HashSet;

public class SetEx01
{
public static void main(String[] args) {
	Set<String> set=new HashSet<String>();
	set.add("rahul");
	set.add("devansh");
	set.add("Ketan");
	set.add("Akash");

	System.out.println(set);
	set.remove("Ketan");
	System.out.println(set);
}
}
