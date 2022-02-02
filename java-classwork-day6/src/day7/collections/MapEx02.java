package day7.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapEx02 {
public static void main(String[] args) {
	
	
	Map<String, List<String>> greetings =new HashMap<String, List<String>>();
	List<String> goodMorning= new ArrayList<String>();
	
	goodMorning.add("GoodMorning");
	goodMorning.add("GoodMorning");
	goodMorning.add("GoodMorning");
	goodMorning.add("GoodMorning");
	goodMorning.add("GoodMorning");
	greetings.put("good-morning",goodMorning);
	
	List<String> goodEvening=new ArrayList<String>();
	goodEvening.add(" Good Evening");
	goodEvening.add("Shuba Sanje");
	goodEvening.add("Shubh Sandhya");
	greetings.put("good-evening",goodEvening);
	
	Iterator<Entry<String, List<String>>> iterator=greetings.entrySet().iterator();
	while(iterator.hasNext()) {
		Entry<String, List<String>> next=iterator.next();
		System.out.println("Key" +next.getKey());
		for(String temp: next.getValue()) {
			System.out.println(temp +", ");
		}
	}
		
}
}
