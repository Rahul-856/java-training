package assessment.second;
import java.util.*;

class Work
{
	String name;
    float salrate;
    Work(String n,float r)
    {
        name = n;
        salrate = r;
    }
     
    float Pay() {
		return salrate;
	}
}
 class dailyWorker extends Work{
private int hr;
  dailyWorker(String m,float r,int h)
  {
	  super(m,r);
	  hr=h;
	}
  public float Pay()
  {
	  int days=hr/24;
	  return salrate*days;
  }	 
 }
 class SalariedWorker extends Work{
	 private int hr;
	 SalariedWorker(String m,float r,int h){
		 super(m,r);
		 hr=h;
	 }
	 public float Pay()
	 {
		 int weeks=hr/(24*7);
		 return salrate*weeks;
	 }
 }
public class Worker {
	public static void main(String[] args) {
		String name;
		float rate;
		int time;
		Scanner cc=new Scanner(System.in);
		System.out.print("Enter name of DailyWorker:");
		name=cc.next();
		System.out.println("Enter rate per day:");
		rate=cc.nextFloat();
		System.out.println("Enter no of hrs:");
		
		time=cc.nextInt();
		
		//dailyWorker w1=new dailyWorker("Rahul",1000,45);
		
		dailyWorker w1=new dailyWorker(name,rate,time);
		System.out.println("Salary: "+w1.Pay()+"\n");
		
		System.out.print("Enter name of SalariedWorker:");
		name=cc.next();
		System.out.println("Enter rate per week:");
		rate=cc.nextFloat();
		System.out.println("Enter no of hrs:");
		time=cc.nextInt();
		
		SalariedWorker w2=new SalariedWorker(name,rate,time);
		System.out.println("Salary: "+w2.Pay()+"\n");
		
		
		cc.close();
	}
}

