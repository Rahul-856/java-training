package day7.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapEx01 {
public static void main(String[] args) {
	Map<String, Integer> map=new HashMap<String,Integer>();
	map.put("Rahul",22);
	map.put("Akash",232);
	map.put("Rohit",212);
	
	System.out.println(map.get("Akash"));
	System.out.println(map.get("Rahul"));
	
	Set<Entry<String, Integer>> entrySet =map.entrySet();
	Iterator<Entry<String, Integer>> iterator =entrySet.iterator();
	
	while(iterator.hasNext()) {
		Entry<String,Integer> next=iterator.next();
		System.out.println("Key :"+next.getKey()+", value "+next.getValue());
	}
}
}
