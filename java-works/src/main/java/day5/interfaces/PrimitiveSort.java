package day5.interfaces;

import java.util.Arrays;

public class PrimitiveSort {
	public static void main(String[] args) {
		String[] names = new String[] { "Rahul", "Devansh", "Akash", "Vibanshu" };

		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("------After Sorting ----");

		Arrays.sort(names);
		for (String name : names) {
			System.out.println(name);
		}
	}

}
