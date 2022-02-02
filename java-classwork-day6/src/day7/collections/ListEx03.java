package day7.collections;

import java.util.Stack;

public class ListEx03 {
public static void main(String[] args) {
	Stack<String> List=new Stack<String>();
	List.add("rahul");
	List.add("devansh");
	List.add("Ketan");
	List.add("Akash");
	List.add("rahul");
	List.add("devansh");
	List.add("Ketan");
	List.add("Akash");

  System.out.println(List.peek());
  List.pop();
 // System.out.println(List.peek());
	System.out.println(List);
}
}
