package gay10.Streams;

import java.util.List;

public class StreamEx05 {
	public static void main(String[] args) {
		List<Trainer> list = List.of(
				new Trainer(123, "Rahul", 1223), 
				new Trainer(456, "Akash", 5645), 
				new Trainer(12, "Chetan", 1122), 
				new Trainer(13, "Rohit", 3322), 
				new Trainer(23, "Monu", 5566) 
				); 
		
		list.stream()
			.map(Trainer :: gettName)
			.map(name -> name.toUpperCase())
			.sorted((a,b) -> a.compareTo(b))
			.limit(4)
			.forEach(System.out :: println);
	}
}