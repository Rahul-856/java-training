package day6.generics;


class TwoGen<T, V>{
	private T obj1;
	private V obj2;
	public TwoGen(T ob1, V obj2) {
		super();
		this.obj1 = ob1;
		this.obj2 = obj2;
	}
	public T getObj1() {
		return obj1;
	}
	
	public V getObj2() {
		return obj2;
	}
	
	public void showTypes()
	{
		System.out.println("Type of T "+obj1.getClass().getName());
        System.out.println("Type Of V "+obj2.getClass().getName());	
	}
	
	
}
public class Twoarggeneric {
	public static void main(String[] args) {
		TwoGen<String, Integer> twoGenObj =new TwoGen("Hello",100);
	twoGenObj.showTypes();
	String strVal=twoGenObj.getObj1();
	Integer intVal=twoGenObj.getObj2();
	
	System.out.println("Str is "+strVal);
	System.out.println("Int is "+intVal);
	}

}
