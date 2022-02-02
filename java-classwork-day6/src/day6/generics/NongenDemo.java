package day6.generics;


class NonGen{
	private Object obj;

	public NonGen(Object obj) {
		super();
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	void showType() {
		System.out.println("Type of obj :" +obj.getClass().getName());
	}
	
}

public class NongenDemo 
{
	public static void main(String[] args) {
		NonGen obj1=new NonGen(100);
		
		
		obj1.showType();
		int val=(Integer) obj1.getObj();
		System.out.println("Val is "+val);
		
		NonGen obj2 =new NonGen("heyy ---");
		obj2.showType();
		String valString=(String) obj2.getObj();
		System.out.println("Val of  String :"+valString);
		
		obj1=obj2;
		val=(Integer) obj1.getObj();
	}
	

}
