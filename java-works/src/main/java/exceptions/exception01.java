package exceptions;

public class exception01 {
public static void main(String[] args) {
	try {
	int num1= Integer.parseInt(args[0]);
	int num2= Integer.parseInt(args[1]);
	
	try {
	int arr[]=new int[5];
	arr[55]=123;
	}catch(NegativeArraySizeException nase) {
		nase.printStackTrace();
	}
	
	int result =num1/num2;
	
	System.out.println("Result is "+result);
	}
	catch(NumberFormatException nfe) {
		System.out.println(nfe);
	}catch(ArithmeticException ae) {
		ae.printStackTrace();
	}catch(Exception e) {
		System.out.println("sorry , please contact admin "+e);
	}
	finally {
		System.out.println("---HEy i'm finally always there---");
	}
	System.out.println("hello i am last line");
}
}
