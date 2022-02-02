package day9.java8features;


interface Maths{
	double operation(double val1, double val2);
	
}

public class LambdaEx03 {
public static void main(String[] args) {
	Maths add=(a,b)-> a + b;
	Maths sub=(a,b)->  a - b;
	Maths mul =(a,b)-> a * b;
	Maths div =(a,b)-> a / b;

	System.out.println("Addition is " +operate(100,20,add));
	System.out.println("Substraction is " +operate(100,20,sub));
	System.out.println("Multiplication is " +operate(100,20,mul));
	System.out.println("Division is " +operate(100,20,div));
}
private static double operate(double val1,double val2,Maths maths) {
	return maths.operation(val1,val2);
}
}
