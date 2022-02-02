package assessment.second;
import java.util.*;
import java.util.stream.Collectors;

public class Dictionary {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		Map<String, List<String>> dictionary = new HashMap<String, List<String>>();
		
		List<String> meaning = new ArrayList<String>();
		meaning.add("overflow");
		meaning.add("Flood");
		dictionary.put("Deluge", meaning);
		//meaning.clear();
		List<String> meaning1 = new ArrayList<String>();
		meaning1.add("Cemetry");
		dictionary.put("Cremation", meaning1);
		
		List<String> meaning2 = new ArrayList<String>();
		meaning1.add("Fake");
		dictionary.put("Pretend", meaning2);
		
		List<String> meaning3 = new ArrayList<String>();
		meaning1.add("strong");
		dictionary.put("Resolute", meaning3);
		dictionary.forEach(
				(x, y)->{System.out.println("Words: " + x + " Meaning: " + y);}
				);
		System.out.println("---------------------------------------------");
		System.out.println("Enter a Words");
		String word = ss.next();
		
		Map<String, List<String>> searchWord = dictionary.entrySet().stream()
				.filter(x->word.equalsIgnoreCase(x.getKey()))
				.collect(Collectors.toMap(Map.Entry:: getKey, Map.Entry::getValue));
		System.out.println(searchWord);
		
		
		ss.close();
		

	}
}
