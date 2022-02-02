package day9.java8features;

import java.util.stream.IntStream;

public class LambdaEx05{
	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Some code goes here... ");
			}
		}).start();

		new Thread(() -> {
				IntStream.range(0, 50).forEach(System.out :: println);
			}
		).start();

	}
}