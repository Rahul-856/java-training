package gay10.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamEx03 {
public static void main(String[] args) {
	String [] arr= {"hi","how","are","you","today"};
	Comparator<String> ascendingOrder=(x,y)->x.compareTo(y);
	List<String> list=Arrays.asList(arr);
	
	list.forEach(System.out::println);
	list.sort(ascendingOrder);
	System.out.println("--- ascending order -----");
	list.forEach(System.out::println);
	
	
	System.out.println("---in desced order -----");
	Arrays.parallelSort(arr, (x,y)-> y.compareTo(x));
	list=Arrays.asList(arr);
	list.forEach(System.out::println);
}
}
