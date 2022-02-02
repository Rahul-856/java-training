package first.assessment;

import java.util.Scanner;

class Details {
	public static final int Marks = 0;
	String StName;
	int StId;
	int StMarks;

	public Details(String Name, int Id, int Marks) {
		StName = Name;
		StId = Id;
		StMarks = Marks;
	}
}

public class Student1 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n=5;
		System.out.println("Student Details:  ");
		System.out.println(" Student Name,||  ID  ||  St Marks");
      
		Details stu=new Details(null, n, n);
		Details hgpercent=new Details(null, n, n);
		Details hgmarks=new Details(null, n, n);
	
		for(int i=0;i<n;i++) {
			stu.StName=in.next();
			stu.StId=in.nextInt();
			stu.StMarks=in.nextInt();	
			
			if(hgpercent.Marks<stu.StMarks) {
				hgpercent.StName=stu.StName;
				hgpercent.StId=stu.StId;
				hgpercent.StMarks=stu.StMarks;
				
			}
			if(hgmarks.Marks<stu.StMarks) {
				hgmarks.StName=stu.StName;
				hgmarks.StId=stu.StId;
				hgmarks.StMarks=stu.StMarks;
				
			}
			
		}
		System.out.println("-----------");
		System.out.println(hgpercent.StName +"student who has got the highest percentage:--"+hgpercent.StId);
	     System.out.println(hgmarks.StName  +"student who has got the highest Maths Marks  "+hgmarks.StId);
	in.close();
	}

}
