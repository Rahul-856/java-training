package day6.generics;


class GenericConst{
	private double val;
	
	<T extends Number> GenericConst(T arg){
		this.val=arg.doubleValue();
	}
	void showVal()
	{
		System.out.println("Val is "+val);
	}
}
public class GenConstructor {
public static void main(String[] args) {
	GenericConst genCon=new GenericConst(100);
	genCon.showVal();
	GenericConst genCon1= new GenericConst(123.45f);
	genCon.showVal();
}
}
