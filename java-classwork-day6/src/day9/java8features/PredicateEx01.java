package day9.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx01 {
	public static void main(String[] args) {
	List<String> list = Arrays.asList("keyboard", "pen", "Mobile", "book");
		List<Integer> numlist = Arrays.asList(34, 5, 67, 76, 87, 34, 12, 23);

		Predicate<Integer> intTest = t -> t > 50;
		Predicate<String> strTest4Chars = t -> t.length() > 4;

	List<Integer> filterIntList= numlist.stream().filter(intTest).collect(Collectors.toList());
	filterIntList.forEach(System.out::println);
	
	

}
}