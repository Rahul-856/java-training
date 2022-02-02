package day9.java8features;

import java.util.Arrays;
import java.util.List;

public class LambdaEx01 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		System.out.println("------ With for loop -----");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + "\t");
		}
		System.out.println();

		System.out.println("------ With for loop -----");
		for (Integer temp : list) {
			System.out.println(temp + "\t");
		}

		// with lambda
		System.out.println();
		System.out.println("------ with lambda-----");

		list.forEach((t) -> System.out.println(t + "\t"));

		//with reference
		System.out.println();
		System.out.println("------Method reference");
		list.forEach(System.out::println);
	}
}
