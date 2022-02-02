package day6.generics;

interface MinMax<T extends Comparable<T>> {
	T min();

	T max();
}

class MyClass<T extends Comparable<T>> implements MinMax<T> {
	private T[] vals;

	public MyClass(T[] vals) {
		super();
		this.vals = vals;
	}

	public T min() {
		T v=vals[0];
		for(int i=1;i<vals.length;i++) {
			if(vals[i].compareTo(v)<0) {
				v=vals[i];
			}
		}
		
		return v;
	}

	public T max() {
		T v=vals[0];
		for(int i=1;i<vals.length;i++) {
			if(vals[i].compareTo(v)>0) {
				v=vals[i];
			}
		}
		
		return v;
	
	}
}

public class GenricInterface {
public static void main(String[] args) {
	Integer iNums[]= {4,3,7,22,23,55};
	Character chars[]= {'a','z','p','w','e'};
	
	
	MyClass<Integer> integerM=new MyClass(iNums);
	int minIntVal=(int) integerM.min();
	System.out.println("MinimumValue : "+minIntVal);
	int maxIntVal=(int) integerM.max();
	System.out.println("Maximum Value: "+maxIntVal);

	
	MyClass<Character> stringM=new MyClass(chars);
	Character minChar=stringM.min();
	Character maxChar=stringM.max();
	
	System.out.println("MinimumValue : "+minChar);
	System.out.println("MinimumValue : "+maxChar);
}
}
