package day9.java8features;

interface SomefunctionInterface{
	public void hi();
	public default void bye() {
		System.out.println("This is default in interface");
	}
	public default void cya()
	{
		System.out.println("hey i am CYA");
	}
	
	public static void someStatic() {
		System.out.println("hey I am some Static method in interface");
	}
	
}

class Something {
	private int val1; 
	private int val2; 
	
	public Something doSomething(int val1) {
		this.val1 = val1; 
		return this; 
	}
	
}

public class DefaultEx01 {

}
