package day7.collections;

import java.util.ArrayList;
import java.util.Iterator;
public class listExt01 
{
	public static void main(String[] args) {
		ArrayList<String> List=new ArrayList<String>();
		
		List.add("rahul");
		List.add("devansh");
		List.add("Ketan");
		List.add("Akash");
		
		System.out.println(List);
		System.out.println(List.get(0));
		
		System.out.println("-----------");
		
		for(String temp:List) {
			System.out.println(temp);
		}
		List.remove(3);
		System.out.println(List);
		/*List.clear();
		System.out.println(List);*/
		
		//with iterators
		System.out.println("------display with iterators ----- ");
		
		
		Iterator<String> iterator=List.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
