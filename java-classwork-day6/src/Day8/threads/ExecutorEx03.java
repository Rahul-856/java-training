package Day8.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunner implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("In Runner -run()");
	}

}

///executor decouples from the implementation
class MyBusiness implements Executor {

	@Override
	public void execute(Runnable command) {
		// TODO Auto-generated method stub
		command.run();
	}

}

public class ExecutorEx03 {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		executorService.submit(new Callable() {

			public Object call() throws Exception {
				System.out.println("Some work in executor Service");
				return executorService;
			}
		});

	}

	private static void executorEx() {
		Executor executor = new MyBusiness();
		executor.execute(new MyRunner());
		executor.execute(new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				System.out.println("this is another runner - anyonymous");
			}
		});

	}
}
