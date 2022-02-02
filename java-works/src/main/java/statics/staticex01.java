package statics;

public class staticex01 {
	static int counter=100;
 public static int add(int a,int b) {
	 return a+b;
 }
 
 {
	 System.out.println("hey i am instace block");
 }
 
 static {
	 System.out.println("This is first static block");
 }
	public static void main(String[] args) {
		//staticex01 s=new staticex01();
		new staticex01();
		int result =add(10, 20);
		System.out.println("Result "+result);
	}
	 static {
		 System.out.println("This is Second static block");
	 }
	 static {
		 System.out.println("This is third static block");
	 }
}
