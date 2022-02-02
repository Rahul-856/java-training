package Day8.threads;

class MyBusinessLogic1 implements Runnable {

	private Thread t;

	public MyBusinessLogic1() {
	}

	public MyBusinessLogic1(String name, int priority) {
		t = new Thread(this, name);
		//t.setPriority(priority);
  t.setPriority(priority);
		t.start();
	}

	public void run() {
		for (int i = 0; i < 145; i++) {
			System.out.println("I Value is " + i + " in " + Thread.currentThread());
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Exiting Thread " + Thread.currentThread());
	}
}

public class ThreadEx02 {
	public static void main(String[] args) {
		System.out.println("Start of Main");

		MyBusinessLogic1 mb1 = new MyBusinessLogic1("styluss", 10);
		MyBusinessLogic1 mb2 = new MyBusinessLogic1("docker", 8);

		Thread t1 = new Thread(new MyBusinessLogic1());
		t1.setName("Printer");
		t1.setPriority(2);

		t1.start();

		System.out.println("End Of Main");
	}
}
