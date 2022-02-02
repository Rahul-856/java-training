package Day8.threads;

class SomeBusinessLogic extends Thread{
	public void run() {
		 for(int i=0;i<45;i++) {
		System.out.println("I Value is "+i +" in "+Thread.currentThread());
	try {
		Thread.sleep(40);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
		 }
	System.out.println("Exiting Thread "+Thread.currentThread());
}

	
}


public class ThreadEx01 {
public static void main(String[] args) throws InterruptedException {
	System.out.println("The current Thread is "+Thread.currentThread().getName());
    System.out.println("Priority Of thread is "+Thread.currentThread().getPriority());
    
    System.out.println("Thread Group :"+Thread.currentThread().getThreadGroup().getName());
    System.out.println("Thread Information :"+Thread.currentThread());
    
    
    SomeBusinessLogic Logic =new SomeBusinessLogic();
    Logic.setPriority(Thread.MAX_PRIORITY);
    Logic.setName("Pen");
   Logic.start();
   
   SomeBusinessLogic Logic1 =new SomeBusinessLogic();
   Logic1.setName("Pencil");
   Logic1.start();
   
    
    for(int i=0;i<45;i++) {
    	System.out.println("I Value is "+i +" in "+Thread.currentThread());
    }
    try {
    Logic.join();
    Logic1.join();
    }catch(InterruptedException e) {
    	e.printStackTrace();
    }
    
     System.out.println(" Hey I am exiting main Thread...");
}
}
