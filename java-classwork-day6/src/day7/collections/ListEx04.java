package day7.collections;

import java.util.Queue;
import java.util.LinkedList;
public class ListEx04 
{
	public static void main(String[] args) {
		Queue<String> List=new LinkedList<String>();
		List.offer("rahul");
		List.offer("devansh");
		List.offer("Ketan");
		List.offer("Akash");
	
		System.out.println(List);
		System.out.println(List.peek());
		List.poll();
		System.out.println(List);
	}

}
