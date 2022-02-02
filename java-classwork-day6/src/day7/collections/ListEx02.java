package day7.collections;

import java.util.Vector;
public class ListEx02
{

	//vector class has capacity and methods under this class a
	// synchronzed thread safe
	public static void main(String[] args) {
		Vector<String> List=new Vector<String>();
		
		System.out.println("Initial size:  "+List.size());
		System.out.println("Capacity "+List.capacity());
		List.add("rahul");
		List.add("devansh");
		List.add("Ketan");
		List.add("Akash");
	
		System.out.println("Initial size:  "+List.size());
		System.out.println("Capacity "+List.capacity());
		
		
}
}
