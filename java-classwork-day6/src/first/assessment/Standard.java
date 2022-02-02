package first.assessment;
import java.io.*;
import java.util.*;


class Student
{
   Scanner sc=new Scanner(System.in);
   int RegNo,Total=0,subjects;
   String name;
   int marks[];

   Student()
   {
      System.out.print("Enter Registration No.: ");
      RegNo=sc.nextInt();
      System.out.print("Enter Student Name: ");
      name=sc.next();;
      getDisMarks();
   }

   public void getDisMarks()
   {
	   int hg=0;
       marks=new int[3];
       System.out.print("Enter marks of English: ");
       marks[0]=sc.nextInt();
       System.out.print("Enter marks of Maths: ");
       marks[1]=sc.nextInt();
       System.out.print("Enter marks of Science: ");
       marks[2]=sc.nextInt();
       for(int i=0;i<3;i++)
       {
          Total+=marks[i]/3;
       }
       System.out.println("Percent of student :"+Total);
      // System.out.println("Total Marks of student "+name+": " +Total);
      // highpercent(Total);
   }
}
public class Standard
{
	static void highpercent(int a)
	{
		int hg=0;
		if(a>hg)
		{
			hg=a;
		}
		System.out.println("Highest percent of Student:"+hg);
	}
	static void hgMarkMath(int b)
	{
		int k=0;
		if(k>b)
		{
			k=b;
		}
		System.out.println("Highest percent of Student:"+k);
	}

	public static void main(String[] args) {
		
		Student s[]=new Student[5];
		for(int i=0;i<3;i++)
		{
			s[i]=new Student();
		}
		for(int i=3;i<0;i--)
		{
			s[i]=new Student();
		}
		
		
	}
	
	}


