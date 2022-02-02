package gay10.Streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamEx01 {
public static void main(String[] args) throws IOException {
	try(
			FileReader fr=new FileReader("trainer.txt");
		 BufferedReader br=new BufferedReader(fr);
	 ){
		br.lines().forEach(System.out ::println);
	}
	
	//with java 1.8 with stream directly 
	System.out.println("------------------");
	try(Stream<String> st= Files.lines(Paths.get("trainer.txt"))){
		
		st.forEach(s -> {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(s);
	});
}
}
}
