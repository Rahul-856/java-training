package day9.java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int pId;
	private String pName;
	public Person() {}
	
	public Person(int pId, String pName) {
		super();
		this.pId=pId;
		this.pName=pName;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + "]";
	}

	

}

public class LambdaEx04 {
	public static void main(String[] args) {
		List<Person> list= Arrays.asList(
		            new Person(101, "rahul"),
				new Person(41, "Ketan"),
				new Person(121, "Akash"),
				new Person(551, "rohit"));
		
		// old style - ascending order name 
				Collections.sort(list, new Comparator<Person>() {

					@Override
					public int compare(Person o1, Person o2) {
						return o1.getpName().compareTo(o2.getpName()); 
					}
				});
				
				list.forEach(System.out :: println);
				
				// with lambda - descending order name 
				Collections.sort(list,  ( o1,  o2) ->  o2.getpName().compareTo(o1.getpName()) );
				System.out.println("---- descending order name-----");
				list.forEach(System.out :: println);
				
				// ascending order of pid 
				Comparator<Person> ascPersonId = (p1, p2) -> p1.getpId() - p2.getpId(); 
				Collections.sort(list, ascPersonId);
				System.out.println("---- Asceding order pid -----");
				list.forEach(System.out :: println);
				
				System.out.println("---- Descending order PID ---");
				Comparator<Person> descPersonId = ascPersonId.reversed();
				Collections.sort(list, descPersonId);
				list.forEach(System.out :: println);
		
		
	}
}
